public class P185num13
{
	public static void main (String[] args) {
		
		
	// A
		for (int num_1 = 10; num_1 >0; num_1-=1)
		{
			
			for (int num_2 = 0; num_2 <num_1; num_2++)
			{
				System.out.print("*");	
			}
			System.out.println ("\t");	
		}
	// B
		for (int num_1 = 10; num_1 >-1; num_1-=1)
		{
			for (int num_2 = 0; num_2 <num_1; num_2++)
			{
				System.out.print(" ");	
			}
			for (int num_2 = 10; num_2 >num_1; num_2-=1)
			{
				System.out.print("*");	
			}
			System.out.println ("\t");	
		}
	// C
		System.out.println ("");
		for (int num_1 = 0; num_1 <11; num_1++)
		{
			for (int num_2 = 0; num_2 <num_1; num_2++)
			{
				System.out.print(" ");	
			}
			for (int num_2 = 10; num_2 >num_1; num_2-=1)
			{
				System.out.print("*");	
			}
			System.out.println ("\t");	
		}
	//D
		for (int num_1 = 11; num_1 >-1; num_1-=2)
		{
			for (int num_2 = 0; num_2 <num_1; num_2+=2)
			{
				System.out.print(" ");	
			}
			for (int num_2 = 10; num_2 >num_1; num_2-=1)
			{
				System.out.print("*");	
			}
			for (int num_2 = 0; num_2 <num_1; num_2+=2)
			{
				System.out.print(" ");
			}
			System.out.println ("\t");	
		}
		for (int num_1 = -1; num_1 <11; num_1+=2)
		{
			for (int num_2 = 0; num_2 <num_1; num_2+=2)
			{
				System.out.print(" ");	
			}
			for (int num_2 = 10; num_2 >num_1; num_2-=1)
			{
				System.out.print("*");	
			}
			for (int num_2 = 0; num_2 <num_1; num_2+=2)
			{
				System.out.print(" ");
			}
			System.out.println ("\t");	
		}
		
			
		
	

}
}