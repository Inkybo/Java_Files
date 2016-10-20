public class WhileLoop2
{
	public static void main(String[] args)
	{
	
		int score=0;
		int y=0;
		int aPlus = 0;
		double total=0;
		
		System.out.println("Please enter 10 test scores:");
		
		while (y<10)
		{	
			score = SavitchIn.readLineInt();
			
			if(score==47)
			{
				System.out.println ("end loop");
				break;
			}
			
			if(score==100)
			{
				aPlus++;
			}
			
			total += score;  // (same as total = total + score)
			y++;
		}

		
		
	
		
		double average = (total/y);

		System.out.println("The average is " + average);
		
		System.out.println (aPlus + " people got 100.");
	}
}