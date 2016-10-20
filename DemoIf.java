public class DemoIf
{
	public static void main(String[] args)
	{
		
		int num = 0;
		
		System.out.print("What's your favorite number? ");
		num = SavitchIn.readLineInt();
		
		
		if (num == 23)
		{
			System.out.println("\nMine too.\n\n");	
		}	
		else	
		{
			System.out.println("OK.\n\n");
		}
		
		
		/////////////////////////////////////////////////////////
			
		
	
		
		
		
		int grade = 0;
		System.out.print("What grade did you get? ");
		grade = SavitchIn.readLineInt();
		
		
		if (grade >= 80 )		
		{
			System.out.println("Not bad..\n\n");
			// the following is a nested if statement
			if(grade == 100)
			{
				System.out.println ("wow");
			}	
		}
		else if (grade >= 0)  
		{
			System.out.println("\nWeak\n\n");
		}
		else  // simple error checking
		{
			System.out.println("Invalid answer.");
		}	
	
			
			
			
		//////////////////////////////////////////////////////////////////////	
			
		
		
		String name = "";
		System.out.print("What's your name? ");
		name = SavitchIn.readLine();
		
		if (name.equalsI("Ann"))  
		{
			System.out.println("Hi");
		}
		else if (name.equals("Joe"))
		{
			System.out.println("Hey.");  
		}
		else
		{
			System.out.println("ok.\n");
		}
		
		
			
		
		
		///////////////////////////////////////////////////////////////////
		
		
		String album = ""; 
		char answer = ' ';
		System.out.println("Which band is cooler?");
		System.out.println("     a = Led Zeppelin");
		System.out.println("     b = Pink Floyd");
		System.out.println("     c = Phish");
		System.out.println("     d = Third Eye Blind");
		
		answer = SavitchIn.readLineNonwhiteChar();
		
		if (answer == 'a')
		{
			System.out.println("Awesome band, but no.");
		}
		else if (answer == 'b')
		{
			System.out.println("Correct. What's your favorite Pink Floyd album?");
			
			album = SavitchIn.readLine();
			
			if (album.equalsIgnoreCase("Dark Side of the Moon"))
			{
				System.out.println("Great choice.");
			}
			else
			{
				System.out.println("Good, but not the best.");
			}	
		}
		else if (answer == 'c')
		{
			System.out.println("Close, but no cigar.");
		}
		else if (answer == 'd')
		{
			System.out.println("Don't talk to me for the rest of the year.");
		}
		else   // error checking
		{
			System.out.println("Invalid answer, moron.");
		}
		
		
		
		
			
		
	}
}
		
		