public class NullDemo
{
	public static void main (String[] args)
	{
		String name;		
						
		// these would cause compiler errors:
		// System.out.println (name);
		// System.out.println (name.length());
		// System.out.println (name.charAt(0));
		
		/////////////////////////////////////////////////////////////////////
		
		String x = null;
		
		// this is valid:
		System.out.println ("the value of x is: " + x);
				
		
		// these would cause run-time errors...
		// specifically, they would throw "NullPointerException":
		// System.out.println (x.length());
		// System.out.println (x.charAt(0));
		
			
		/////////////////////////////////////////////////////////////////////
		
		String[] a = new String[1];
		
		// this is valid:
		System.out.println ("The array is displayed here: " + a[0]);
		
		// but this would throw a NullPointerException
		// int len = a[0].length();
		
		/////////////////////////////////////////////////////////////////////
		
		String k=null;
		
		if(k==null)
		{
			System.out.println ("k does not yet have a real value.");
		}
		else
		{
			System.out.println ("the value of k is " + k);
		}
	}
}