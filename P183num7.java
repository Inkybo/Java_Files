public class P183num7
{
	public static void main (String[] args) {
		
		int num_3 = 0;
	
	for (int num_1 = 1; num_1 <= 12; num_1++)
	{
		for (int num_2 = 1; num_2 <= 12; num_2++)
		{
			num_3= num_1*num_2;
			System.out.print(num_1+"*"+num_2+"="+num_3);System.out.println ("");
			if (num_2 ==12)
			{
				System.out.println ("\n");
			}
				
		}
	}

}
}