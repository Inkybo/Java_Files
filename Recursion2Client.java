public class Recursion2Client
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	int num_2 = 0;
	int x = 1;
	int factor = 0;
	int expon = 0;
	
	System.out.println ("Enter a Number:");
	num_1 = SavitchIn.readLineInt();
	
	Recursion2 math = new Recursion2();
	
	factor = math.factorial(num_1);
	System.out.println ();
	System.out.println (num_1+"! = "+ factor);
	
	
	System.out.println ("Enter 2 numbers:");
	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	
	while(num_2 < 0)
	{
		System.out.println ("Number is less than 0 try again");
		num_2 = SavitchIn.readLineInt();
	}
	
	expon = math.exponent(num_1, num_2);
	
	System.out.println ();
	System.out.println (num_1+"^"+num_2+" = "+expon);
	System.out.println ();

}
}