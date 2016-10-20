public class OverloadClient
{
	public static void main(String[] args)
	{
		OverloadClass quinn = new OverloadClass(); // instantiate the object
		int num1=0, num2=0, num3=0, answer=0;
		
		System.out.println("Would you like to add 2 or 3 numbers?");
		int howMany = SavitchIn.readLineInt();
		
		if (howMany == 2)
		{
			System.out.print("\nEnter the first number: ");
			num1 = SavitchIn.readLineInt();
			System.out.print("Enter the second number: ");
			num2 = SavitchIn.readLineInt();
			
			answer = quinn.add(num1, num2);
			
		}
		else
		{
			System.out.print("\nEnter the first number: ");
			num1 = SavitchIn.readLineInt();
			System.out.print("Enter the second number: ");
			num2 = SavitchIn.readLineInt();
			System.out.print("Enter the third number: ");
			num3 = SavitchIn.readLineInt();
			
			answer = quinn.add(num1, num2, num3);
		
		}
		
		System.out.println("The answer is " + answer + "\n\n");
		
		
	}
}
		