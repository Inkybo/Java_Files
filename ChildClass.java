public class ChildClass extends ParentClass
{
	
	public int curves;
	
	public ChildClass(int x, int y)
	{	
		super(x);    // this is the child class calling the
					 // parent class's constructor
		
		curves = y;
	}
	
	
	public void definitionMessage()
	{
		System.out.println ("# of letters with curves: " + curves);
		
		System.out.print ("# of letters without curves: ");
		System.out.println (letter - curves);   
			// notice that this class inherited the variable "pages"
	}
	
}