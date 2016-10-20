public class Dictionary extends Book
{
	
	public int definitions;
	
	public Dictionary(int x, int y)
	{	
		super(x);    // this is the child class calling the
					 // parent class's constructor
		
		definitions = y;
	}
	
	
	public void definitionMessage()
	{
		System.out.println ("# of definitions: " + definitions);
		
		System.out.print ("# of definitions per page: ");
		System.out.println (definitions/pages);   
			// notice that this class inherited the variable "pages"
	}
	
}