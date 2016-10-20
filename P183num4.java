public class P183num4
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	int num_3 = 0;
	
	num_1 = SavitchIn.readLineInt();
	
	while (num_1 < 2)
	{
		System.out.println ("entered number is less than 2, try again:");
		
		num_1 = SavitchIn.readLineInt();	
	}	
	for (int num_2 = 3; num_2 < num_1; num_2++)
	{
		if (num_2%2 == 0 )
		{
			num_3 = num_3 + num_2;
		}
	}
	System.out.println (num_3);
	
}
}