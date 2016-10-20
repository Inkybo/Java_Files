public class ConstructorDemoClient
{
	public static void main(String[] args)
	{
		ConstructorDemoClass dude1 = new ConstructorDemoClass(17, 2.85, "Jim");
		
		System.out.println("Your GPA is " + dude1.getGPA() + ".\n\n");
		
		
		
		
		ConstructorDemoClass dude2 = new ConstructorDemoClass(16, 4.01, "Dave");
		
		System.out.println("Your GPA is " + dude2.getGPA() + ".\n\n");
		
		
		
		
		
		ConstructorDemoClass dude3 = new ConstructorDemoClass(18, 0.06, "Bob");
		
		System.out.println("Your GPA is " + dude3.getGPA() + ".\n\n");
		
		
		
		

	}
}