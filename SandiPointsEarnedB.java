import java.util.Scanner;

public class SandiPointsEarnedB 
{
	private double ptsEarned;
	private int cups;
	
	public SandiPointsEarnedB()
	{
		ptsEarned = 0;
	}
	
	public SandiPointsEarnedB(double pts)
	{
	        ptsEarned = pts;
	}
	
	public void setCups(String cupString)
    {
		int cupNum = Integer.parseInt(cupString);
		if(cupNum>=0)
        {            
			cups = cupNum;
            setPts();
        }
		else
        {
            System.out.println("Error: The provided string is not a valid number");
            setCups();
        }
    }
	
	public void setCups()
	{

		boolean validNum=true; //boolean for while loop
		Scanner kb = new Scanner(System.in); //scanner variable
		System.out.println("Please type amount of cups bought in a month"); //instructions
		while(validNum) //while loop to make sure user inputs valid number
		{
			cups = kb.nextInt(); //user input
			
				if (cups<0) // if statement to scour for invalid entries less than 0
				{
				System.out.println("Error: Invalid Number\nTry Again"); 
				validNum=true;
				}
				
				else
				{
				validNum=false; //if number is valid will end while loop
				}
		}
		setPts();
		/**
		@param
		sets the amount of cups and ensures is a valid number and also runs the setPts method once validated
		 */
		
	 }
	
	public int getCups()
	{
		return cups;
	}
	   /**
		@return
		returns the amount of cups inputted
	   */
	
	public double getPts()
	{
		return ptsEarned;
	}
	   /**
		@return
		returns the amount of pts calculated by setPts
	   */
	
	private void setPts() //calculates pts based on num of cups inputted
	{
		double pts=0; //Initialize
		
			if(cups==0) //nested if to assign pts
				{
				pts=0;
				}
			
			else if(cups==1)
				{
				pts=2;
				}
			
			else if(cups==2)
				{
				pts=5.15;
				}
			
			else if(cups==3)
				{
				pts=8.249;
				}
			
			else if(cups==4)
				{
				pts=11.555;
				}
			
			else if(cups>4) //5 or more cups trigger a mathematical calculation to determine points
				{
				pts=2.895*cups;
				}
			
			
			ptsEarned=ptsEarned+pts;
			/**
			@param
			calculates amt of pts based on cups
		    */
	}
	

}
