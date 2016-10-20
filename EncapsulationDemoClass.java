public class EncapsulationDemoClass     // this is a CLASS (no public static void main)
{
	private String name = "";
	private int favNumber = 0;
	private double gradePointAverage = 0;
	private char favLetter = ' ';
	private int powerLevel = 0, x=0;	
		// encapsulation: all instance variables should be private
	
	

////////////////////////////////////////////////////////////////////////////////

	public EncapsulationDemoClass(double GPA)  // this is the CONSTRUCTOR METHOD...
	{										
		gradePointAverage = GPA;
	}

//////////////////////////////////////////////////////////////////////////////



	public void setInfo()    		
	{		
		System.out.print("What is your name? ");
		name = SavitchIn.readLine();
	
		System.out.print("What is your favorite #? ");
		favNumber = SavitchIn.readLineInt();
		
	
		setLetter();  // this calls a private "helper" method
		
		
		powerLevel = getPowerLevel();
		
	}
	
	

//////////////////////////////////////////////////////////////////////////////
	
	
	public String getName()	
	{
		return name;	
	}

//////////////////////////////////////////////////////////////////////////////
	
	public int getFavNumber()	
	{
		return favNumber;		
	}
	
	
///////////////////////////////////////////////////////////////////////

	public char getFavLetter()	
	{
		return favLetter;		
	}
	
///////////////////////////////////////////////////////////////////////
	private void setLetter()
	{
		System.out.print("What is your favorite letter? ");
		favLetter = SavitchIn.readLineNonwhiteChar();	
	}
		//this is a "support" or "helper" method --> notice it's private
		
		
////////////////////////////////////////////////////////////////////////

	private int getPowerLevel()
	{
		System.out.print("What does the scouter say about his power level? ");
		x = SavitchIn.readLineInt();
		
		return x;
		
	}  // another helper method
///////////////////////////////////////////////////////////////////////	
	public String toString()
	{
		return("your gpa is " +gradePointAverage+" your name is " +name+ ", and your favorite letter is " +favLetter);
	}			
}