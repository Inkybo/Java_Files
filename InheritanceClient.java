public class InheritanceClient
{
	public static void main (String[] args)
	{
		Dictionary z = new Dictionary(1500, 52500);
		
		z.pageMessage();   // notice that this actually calls 
						   // a method in the Book class
		
		System.out.println ("\n\n");
		
						   
		z.definitionMessage();    // this calls a method in Dictionary
								
	}
}