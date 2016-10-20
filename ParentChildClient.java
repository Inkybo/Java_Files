public class ParentChildClient
{
	public static void main (String[] args)
	{
		ChildClass z = new ChildClass(26, 17);
		
		z.pageMessage();   // notice that this actually calls 
						   // a method in the Book class
		
		System.out.println ("\n\n");
		
						   
		z.definitionMessage();    // this calls a method in Dictionary
								
	}
}