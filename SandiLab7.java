import java.util.Scanner;

public class SandiLab7
{
	public static boolean loyaltyQA()
	{
		String answer;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type Yes or Y if you would like to sign up for our loyalty program, or anything else to decline");
		answer = kb.nextLine();

			if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y"))
			{
				System.out.print("Thank you for signing up to our loyalty program.");
				return true;
			}
			else
				return false;
		//return 
	}
	public static boolean volumeBonus(double volumeIndex[]) //method to find the number of times data has been inputted
	{
		int zeroPurchase=0;
		for(int i=0;i<volumeIndex.length;i++)
		{
			if(volumeIndex[i]>0)
				zeroPurchase++;
		}
		if(zeroPurchase>=3)
			return true;
		
		else
			return false;
	}
	/* 
	public static double[]()
	{
	double[] 6MTotal
	}*/
	
	public static void main(String[] args) 
	{
		//SandiPointsEarnedB customer = new SandiPointsEarnedB(); //creates a variable to hold data using other class's methods
		double[] sixMTotal = new double[6];
		double averageCups = 0;
		
		if(loyaltyQA())		
		{	
				SandiPointsEarnedC customer = new SandiPointsEarnedC(10); //creates a variable to hold data using other class's methods while adding 10 pts
				System.out.println(" You have earned a free "+customer.getPts()+" points!");
				for(int i=0;i<6;i++)
				{
					customer.setCups(); //runs setcups method on customer to get cups purchased
					sixMTotal[i] = customer.getCupsIndex();
					averageCups += sixMTotal[i];
				}
			
			
				if(volumeBonus(sixMTotal) && averageCups/6>=5.1)
				{
					System.out.println("You have earned a volume bonus! Nine additional points have been added.");
					customer.setBonusPts(9);
				}
				
				System.out.printf("You have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());

		}
		
		else
		{
			SandiPointsEarnedC customer = new SandiPointsEarnedC(); //creates a variable to hold data using other class's methods
			for(int i=0;i<6;i++)
			{
				customer.setCups(); //runs setcups method on customer to get cups purchased
				sixMTotal[i] = customer.getCupsIndex();
				averageCups += sixMTotal[i];
			}
		
		
			if(volumeBonus(sixMTotal) && averageCups/6>=5.1)
			{
				System.out.println("You have earned a volume bonus! Nine additional points have been added.");
				customer.setBonusPts(9);
			}

			System.out.printf("\nYou have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());
		}
		
		//prints out customer's cup total and point total
	}
	/*
	 Output
	Please type Yes or Y if you would like to sign up for our loyalty program, or anything else to decline
		y
	Thank you for signing up to our loyalty program. You have earned a free 10.0 points!
	
	Please type amount of cups bought in a month
		50
	
	Please type amount of cups bought in a month
		1
	
	Please type amount of cups bought in a month
		0
	
	Please type amount of cups bought in a month
		-3
		
	Error: Invalid Number
	Try Again
	
		4
	
	Please type amount of cups bought in a month
		5
	
	Please type amount of cups bought in a month
		6
	
	You have earned a volume bonus! Nine additional points have been added.
	You have purchased 66 cups and have 983.035 points
	 */
}
