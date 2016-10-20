public class ErrorCheck
{
	public static void main(String[] args)
	{
		System.out.print("Please enter your age: ");
		int age=0;
		age =  SavitchIn.readLineInt();
		
		while (age > 120 || age < 0 )
		{
			System.out.println("That's impossible.");
			System.out.print("Please enter your age, and get it right this time: ");
			age =  SavitchIn.readLineInt();
		}
		
	
	}
}



