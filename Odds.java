public class Odds
{
	public static void main (String[] args) {
	
	int num_1 = 1;
	int num_2 = 7;
	int num_3 =20;
	
	while (num_1<=21)
	{
		System.out.println (num_1);
		num_1++;
		if (num_1 ==22)
		{
			break;
		}
		
	}
	System.out.println ();
	
	while (num_2<=29)
	{
		System.out.println (num_2);
		num_2+=2;
		if (num_2 ==31)
		{
			break;
		}	
	}
	System.out.println ();
	
	while (num_3>=4)
	{
		System.out.println (num_3);
		num_3-=1;
	}
	System.out.println ();
}
}