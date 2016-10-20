import java.util.ArrayList;


public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList people = new ArrayList(); // instantiate an ArrayList object
		
		people.add ("Brian");		// no wrapper class needed 
		people.add ("Leeroy");		// since Strings are Objects
		people.add ("Susan");
		people.add ("Annie");		  
		people.add(new Integer(42));  // wrapper class needed to add an int
		
				
		System.out.println(people);
		System.out.println("\nSize of the array: "+people.size());
		
		
		int x = ((Integer)people.get(4)).intValue();
		System.out.println("\nThe number " + x + " is also in the list");
		
		
		String a = (String)people.get(2); // convert the Object into a String
		a=a.toUpperCase();
		System.out.println("\nThe 3rd person's name in caps is " + a);
				
			
		int location = people.indexOf("Leeroy"); //finds where 'leeroy' is located
		people.remove(location);
		
		
		System.out.println("\n\nAfter removing Leeroy:");
		System.out.println(people);
		System.out.println("\nSize of the array: "+people.size());
		
		
		System.out.println("\nAt index #1: " + people.get(1));
		
			
		people.set (1, "Jen"); // replace index 1 with Jen
		System.out.println("\n\nSusan replaced by Jen:");
		System.out.println(people);		
		
		
		System.out.print("\nWhich person shall we add at index #2? ");
		String b = SavitchIn.readLine();
		
		people.add(2,b);
		System.out.println(people);
		System.out.println("\nSize of the array: "+people.size());
		
	
		System.out.println("\npeople printed on separate lines:");
		for (int i=0; i<people.size(); i++)
			System.out.println(people.get(i));
		
	
		people.add(new Integer(99));   // Integer wrapper class
		System.out.println("\nA number added to the list:");
		System.out.println(people);
			/*	*/
		System.out.println();
	}
}