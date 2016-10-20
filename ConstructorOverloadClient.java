public class ConstructorOverloadClient
{
	public static void main (String[] args) 
	{
		char a = ' ';
		String choice = "";
		
		ConstructorOverloadClass lasagna;   // declare the object, no value yet
		
		System.out.println ("Would you like to enter a character?");
		choice = SavitchIn.readLine();
		
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.print("Enter a character: ");
			a = SavitchIn.readLineNonwhiteChar();
			
			lasagna = new ConstructorOverloadClass(a);   // give the object a value
														 // and send a parameter
		}
		else
		{
			lasagna = new ConstructorOverloadClass();   // give the object a value
		}												// but send no parameter

	}
}