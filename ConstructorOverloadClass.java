public class ConstructorOverloadClass
{
	public ConstructorOverloadClass(char w)
	{
		System.out.println ("the ascii value of " + w + " is " + (int)w);
	}
	
	public ConstructorOverloadClass()
	{
		System.out.println ("You did not enter a character.");
	}
	
	
}