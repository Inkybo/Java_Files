public class ConstructorDemoClass     
{
	private int age = 0;
	private double GPA = 0;
	private String firstName = "";
	
///////////////////////////////////////////////////////////////////////



	//THIS IS THE CONSTRUCTOR!!!1
	
	public ConstructorDemoClass(int x, double y, String z)
	{
		age = x;
		GPA = y;
		firstName = z;
		
		sayHello();	    // this calls the PRIVATE "helper" method sayHello()
	}



////////////////////////////////////////////////////////////////////////////////

	private void sayHello()     // this is a PRIVATE "helper" method	
	{										
		System.out.println("Hello, " + firstName);
	}

//////////////////////////////////////////////////////////////////////////////

	public int getAge()    		
	{		
		return age;
	}

//////////////////////////////////////////////////////////////////////////////

	public double getGPA()    		
	{		
		return GPA;
	}

//////////////////////////////////////////////////////////////////////////////

	public String getFirstName()    		
	{		
		return firstName;
	}
	
}