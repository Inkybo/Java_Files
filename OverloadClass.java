public class OverloadClass
{
	public int add(int x, int y)
	{
		return (x+y);
	}	
	/////////////////////////////////////////////////////////////////
	
	public int add(int x, int y, int z) // this is called overloading the add method
	{
		return (x+y+z);
	}	
}