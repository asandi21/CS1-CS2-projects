import java.util.Scanner;

public class SandiLab8
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
	public static boolean volumeBonus(double average,double monthsMissed) //method to find the number of times data has been inputted
	{
		final double averageNeeded=5.1;
		final double monthsNeeded=3;
		
		if(average>averageNeeded && monthsMissed<=monthsNeeded)
		{
			System.out.println("You have earned a volume bonus! Nine additional points have been added.");
			return true;
		}
		else
			return false;
	}
	/* 
	public static double[]()
	{
	double[] 6MTotal
	}*/
	public static void cupsCapture(boolean loyalty)
	{
		double[] cups = new double[6];
		double averageCups=0;
		int zeroPurchase=0;
		
		if(loyalty)
			{
				SandiPointsEarnedC customer = new SandiPointsEarnedC(10); //creates a variable to hold data using other class's methods while adding 10 pts
				System.out.println(" You have earned a free "+customer.getPts()+" points!");
				for(int i=0;i<6;i++)
				{
					customer.setCups(); //runs setcups method on customer to get cups purchased
					cups[i] = customer.getCupsIndex();
					averageCups += cups[i];
					averageCups = averageCups/6;
					
					if(cups[i]<0)
						zeroPurchase++;
				}
				if(volumeBonus(averageCups,zeroPurchase))
					customer.setBonusPts(9);
				System.out.printf("You have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());
			}
			
		else
			{
				SandiPointsEarnedC customer = new SandiPointsEarnedC(); //creates a variable to hold data using other class's methods
				for(int i=0;i<6;i++)
				{
					customer.setCups(); //runs setcups method on customer to get cups purchased
					cups[i] = customer.getCupsIndex();
					averageCups += cups[i];
					averageCups = averageCups/6;
					
					if(cups[i]<0)
						zeroPurchase++;
				}
				if(volumeBonus(averageCups,zeroPurchase))
					customer.setBonusPts(9);
				System.out.printf("You have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());
			}
		
	}
	
	public static void main(String[] args) 
	{

		if(loyaltyQA())		
		{	
			cupsCapture(true);
		}
		
		else
		{
			cupsCapture(false);
		}
		
	}
	/*
		Please type Yes or Y if you would like to sign up for our loyalty program, or anything else to decline
		n
		
		Please type amount of cups bought in a month
		1
		
		Please type amount of cups bought in a month
		2
		
		Please type amount of cups bought in a month
		3
		
		Please type amount of cups bought in a month
		4
		
		Please type amount of cups bought in a month
		
		
		0
		
		Please type amount of cups bought in a month
		32
		You have earned a volume bonus! Nine additional points have been added.
		You have purchased 42 cups and have 216.109 points
	 */
}
