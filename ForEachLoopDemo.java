import java.util.ArrayList;

public class ForEachLoopDemo
{
	public static void main(String[] args)
	{
		// using a for-each loop with a 1D Array
		
		int[] numbers = {3, 4, 5, 6, 7};
		
		for(int x : numbers)
		{
			System.out.println(x);
		}
		
		System.out.println ();
			
		
		
		// using a for-each with a 2D Array
		
		int[][] z = new int[2][2];
		z[0][0] = 34;
		z[0][1] = 35;
		z[1][0] = 36;
		z[1][1] = 37;
		
		for (int[] y : z)		// assigns each row to y
			for(int a : y)		// assigns the ELEMENTS of each row to a
				System.out.println (a);
				
		
		System.out.println ();	
				
		// using a for-each with an ArrayList
		
		ArrayList words = new ArrayList();
		words.add("hello");
		words.add("goodbye");
		
		for (Object k : words)	
			System.out.println (k);	
				
		
		
	}
}