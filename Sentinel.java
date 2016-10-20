public class Sentinel
{
	public static void main(String[] args)
	{
		int bananas = 0, total = 0;
		
		System.out.println ("BANANAS");
		
		do 
		{
			System.out.println(total + " total bananas so far.\n");
			
			System.out.println("How many bananas? (-1 to quit)");
			bananas = SavitchIn.readLineInt();
			
			if(bananas == -1)
			{
				break;
			}
			
			System.out.println(); 
			
			total += bananas;  // fix the bug...
			
			if (total >= 50)
			{
				System.out.println ("the loop will now end.");
				break;
				
			}
				 			// brackets?
			
		}while (bananas != -1);  // -1 is the sentinel. It stops the loop.
		
		System.out.println("Final total: " + (total+1) + ".");
		
		
	}
}