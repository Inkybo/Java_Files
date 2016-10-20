public class compare
{
	public static void main(String[] args)
	{	
		
		System.out.print("Enter your first name: ");
		String first = SavitchIn.readLine();
		
		System.out.print("\nEnter your last name: ");
		String last = SavitchIn.readLine();
		
				
		System.out.println(first.compareTo(last)); // compareTo is a method in the String class, 
												   // and is an empty method in the Comparable interface.
												   // the String class implements the Comparable interface,
												   // and provides actual code inside the compareTo method.
												   // got all that? 
		
		
		if (first.compareTo(last)<0)
			System.out.println("\nYour first name comes before your last name alphabetically.\n");
		else if (first.compareTo(last)>0)
			System.out.println("\nYour last name comes before your first name alphabetically.\n");
		else
			System.out.println("\nYour first & last names are teh same.\n");
		
		// */
}
}