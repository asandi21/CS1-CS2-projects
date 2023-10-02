import java.util.Scanner;

public class SandiLab6B
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
	
	public static void main(String[] args) 
	{
		//SandiPointsEarnedB customer = new SandiPointsEarnedB(); //creates a variable to hold data using other class's methods
		if(loyaltyQA())
		
		{	
			SandiPointsEarnedB customer = new SandiPointsEarnedB(10); //creates a variable to hold data using other class's methods while adding 10 pts
			System.out.println("You have earned a free "+customer.getPts()+" points!\n");
			customer.setCups(); //runs setcups method on customer to get cups purchased
			System.out.printf("You have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());
		}
		else
		{
			SandiPointsEarnedB customer = new SandiPointsEarnedB(); //creates a variable to hold data using other class's methods
			customer.setCups(); //runs setcups method on customer to get cups purchased
			System.out.printf("You have purchased %d cups and have %.3f points", customer.getCups(), customer.getPts());
		}
		
		
		//prints out customer's cup total and point total
	}
	/*
	 Output
		Please type Yes or Y if you would like to sign up for our loyalty program, or anything else to decline
		yes
		Thank you for signing up to our loyalty program.You have earned a free 10.0 points!
		
		Please type amount of cups bought in a month
		10
		You have purchased 10 cups and have 38.950 points
	 */
}
