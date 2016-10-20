public class Person
{
	public String name="";
	
	public Person()
	{
		
	}
	
	
	public void setName()
	{
		System.out.println("what is the person's name?");
		name = SavitchIn.readLine();
	}
	
	public void displayName()
	{
		System.out.println("The person's name is: " + name);
	}
}