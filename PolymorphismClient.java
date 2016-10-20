public class PolymorphismClient
{
	public static void main(String[] args)
	{
		Animal x = null;
		//null reference
		// null because we don't want to give x a value YET. 
		
		Animal y = new Dog(); // polymorphism
		
		Animal z = new Cat(); // polymorphism
		
		System.out.println("What type of pet do you have?");
		String pet = SavitchIn.readLine();
		
		if(pet.equalsIgnoreCase("dog"))
		{
			x = y;
		}
		else if (pet.equalsIgnoreCase("cat"))
		{
			x = z;
		}
		else
		{
			x = new Animal();
		}
		
		
		x.speak();
		// DYNAMIC BINDING means that Java figures out which method to call --
		// there are 3 speak() methods; which one gets called depends on user input
		
		/////////////////////////////////////////////
		
		Animal a = new Dog();
		a.displayName();
		
		/* in this example, an object of Animal is created,
		 *	but instantiated as a Dog object. When dynamic
		 *	binding occurs, the "decision" is easy for
		 *	the compiler -- the method in Dog will be called. */
		
		a = new Cat();
		a.displayName();
		/* notice that we decided later on to change the 
		 * object a to a cat object. Polymorphism made this
		 * possible. It would have been impossible if it had
		 * been a declared as a dog object on line 35.   */
		
	}
}