public class RandomNumberDemo
{
	public static void main(String args[])
	{
	
		int a = 0;
		
		
		// Random Number Formula:
		// (int)(Math.random()*howManyNumbers+smallest)
		
		for(int x = 1; x<=5; x++)
		{
			a = (int)(Math.random()*20+1);
			System.out.println("here is a random # between 1 and 20: " + a);
		}
		
		System.out.println ();
		
		// Random Number Formula:
		// (int)(Math.random()*howManyNumbers+smallest)
		
		a = (int)(Math.random()*26+100);
		System.out.println("here is a random # between 100 and 125: " + a);
	}
}