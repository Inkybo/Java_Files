public class P241Class
{

	private String sound = "";
	private String range_say = "";
	private String count = "";
	private String word = "";
	public int Range = 0;
	private int max = 0;
	private int sum = 0;
	private int z = 0;

////////////////////////////////////////////////
	public String alarm(int x)
	{
		if (x < 1)
		{
			sound = "ERROR: Try again!";
		}	
		else
		{
			sound = "ALARM!";
		}
		
		return sound;
	}
////////////////////////////////////////////////
	public int sum100()
	{
		for (int y = 0; y <= 100; y++)
	{
		System.out.println (sum);
		sum = sum + y ;
	}	
		return sum;
	}
////////////////////////////////////////////////
	public int maxOfTwo(int x, int y)
	{
		if (x > y)
		{
			max = x;
		}
		if (x < y)
		{
			max = y;
		}
		
		return max;
	}
////////////////////////////////////////////////
	public int sumRange(int x, int y)
	{
		if (y < x)
		{
			Range = 0;	
		}
		if (x > y )
		{
			Range = y - x;
		}
		return Range;
	}
////////////////////////////////////////////////
	public int countA (String x)
	{
		for (int y = 0; y < x.length();y++)
		{
			if (x.charAt(y)== 'a')
			{
				z++;
			}
			
		}
		return z;
	}
////////////////////////////////////////////////
	public boolean evenlyDivisible (int x, int z)
     {
     	boolean equal = false;
	
		if(x%z == 0 || z%x ==0 )
     	{
      		equal = true;
     	}
     return equal;
     }
//////////////////////////////////////////////////////////////
      public String reverse (String z)
      {
		int x = 0;
       for (int y = z.length()-1; y >= 0; y--)
       {
         word+=z.charAt(y);
     
       }
       return (word);
      }
/////////////////////////////////////////////////////////////
      public boolean  isIsosceles(int x, int y , int z)
      {
       
       Boolean iso = false;
       
       if (x == y || x == z || y==z)
       {
        	iso = true;
       }
       return iso;
      }
/////////////////////////////////////////////////////////////
	public int randomInRange (int x, int y)
      {
       return ((int)(Math.random()*x+y));
      }	
}