public class CalcClass
{
 	private int y = 0;

////////////////////////////////////////////////////////////////////////////////
	public double add(double x, double y)
	{
		return (x + y);	
	}
////////////////////////////////////////////////////////////////////////////////
	public double subtract(double x, double y)
	{
		return (x - y);
	}
////////////////////////////////////////////////////////////////////////////////
	public double multiply(double x, double y)
	{
		return (x*y);
	}
////////////////////////////////////////////////////////////////////////////////
	public double divide(double x, double y)
	{
		return (x / y);
	}
////////////////////////////////////////////////////////////////////////////////
	public double modulus(double x, double y)
	{
		return (x % y);
	}
////////////////////////////////////////////////////////////////////////////////
	public int factorial(int x)
	{
		for(int z = x; z > 0; z++)
		{
			x = z;
			
		}
		return x;
	}
}