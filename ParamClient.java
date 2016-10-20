public class ParamClient
{
	public static void main(String[] args)
	{
		int num=0, numTripled=0;
		
		ParametersDemo Q = new ParametersDemo();
		
		
		
		System.out.println("Enter a number and I'll triple it.");
		num = SavitchIn.readLineInt();
		
		numTripled = Q.times3(num);
		
		System.out.println("Your number tripled is " + numTripled + ".");
		
		
		
		
		
		System.out.println("Your number is " + Q.bigOrSmall(num) + ".");
		
		
		
		
		
		
		int a=0, b=0;
		
		System.out.println("Enter a #: ");
		a = SavitchIn.readLineInt();
		
		System.out.println("Enter another #: ");
		b = SavitchIn.readLineInt();
		
		if (Q.IsFirstLarger(a,b) == true)
		{
			System.out.println("The 1st # is bigger");
		}
		else
		{
			System.out.println("The 1st # is NOT bigger");
		}
		
		
	}
}
