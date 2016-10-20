public class ReturnInsideLoopDemo
{
	
	public boolean primeNum(int number)
	{
			
		for (int x=2; x<number; x++)
		{
			if (number % x == 0)
			{
				return false;  // breaks loop
			}
		}
		return true; // only executes if loop is complete
	}
		
		

}