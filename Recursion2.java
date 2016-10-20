public class Recursion2
{
	private int result = 0;
	private int result_2 = 0;
//////////////////////////////////////////////
	
	public int factorial(int x)
	{
       	if(x==0 || x==1)
       	{
       		return 1;
       	}

       result = factorial(x-1) * x;
       return result;	
	}
//////////////////////////////////////////////

	public int exponent(int k, int j)
	{
		if(j == 0)
		{
			return 1;
		}
		else if (j == 1)
		{
			return k;
		}
		else if (j % 2 == 0)
		{
			result_2 = exponent(k, j / 2);
	        return result_2 * result_2;
		}
		else
		{
			int x = exponent(k, (j - 1) / 2);
        	result_2 = x * x * k;
		}
		return result_2;
	}
}