public class CLASSdemo     // this is a CLASS (no public static void main)
{
	private String n = "";
	private int a = 0;
	private char i = ' ';	
		// these are INSTANCE VARIABLES
	


////////////////////////////////////////////////////////////////////////////////

	public void displayHi()    		// this is a METHOD...
	{										// used to accomplish a task
		System.out.println("Welcome.\n\n");
	}

//////////////////////////////////////////////////////////////////////////////
	
	public void displayByeBye()    			// this is another METHOD...
	{										// used to accomplish a task
		System.out.println("See ya.\n\n");
	}

//////////////////////////////////////////////////////////////////////////////

	public void setInfo()    			// mutator method
	{		
		System.out.print("What is your name? ");
		n = SavitchIn.readLine();
		
		System.out.print("\n\nWhat is your age? ");
		a = SavitchIn.readLineInt();
		
		while(a<0)
		{
			System.out.println ("Try again.");
			a = SavitchIn.readLineInt();	
		}
		
		System.out.print("\n\nWhat is your middle initial? ");
		i = SavitchIn.readLineNonwhiteChar();
		
	}

		
		
///////////////////////////////////////////////////////////////////////////////		

	public String getName()		// an accessor method....this is the first one that actually returns something to the CLIENT
	{
		return n;
	}					// "public String" because this method returns a String
	

//////////////////////////////////////////////////////////////////////////////
	
	
	public int getAge()		// another accessor method
	{
		return a;	
	}

//////////////////////////////////////////////////////////////////////////////
	
	public char getInitial()		// another accessor method
	{
		return i;		
	}
	
	
///////////////////////////////////////////////////////////////////////


}