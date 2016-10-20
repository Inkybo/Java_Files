public class P183num6
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	int odd = 0;
	int even = 0;
	int zero = 0;
	
	System.out.println ("Enter a number:");
	
	num_1 = SavitchIn.readInt();

		System.out.println (num_1/100);
		if (num_1/100%2 ==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
		if (num_1/10%2 ==0)
		{
			even++;
		}
	 	else
		{
			odd++;
		}
		if (num_1/1%2 ==0)
		{
			even++;
		}
	 	else
		{
			odd++;
		}
		if (num_1/10%10 ==0)
		{
			zero++;
		}
			if (num_1/1%1 ==0)
		{
			zero++;
		}	
	System.out.println ("The number of odd digits is " +odd);
	System.out.println ("The number of even digits is " +even);
	System.out.println ("The number of zero digits is " +zero);
	
	
	
	
}
}