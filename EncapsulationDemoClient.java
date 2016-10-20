public class EncapsulationDemoClient // THIS IS A CLIENT PROGRAM
{
	public static void main(String[] args)
	{
		int number = 0;
		double gpa = 0;
		char letter = ' ';
		String name = "";
		
		
		System.out.println("enter your GPA:");
		gpa = SavitchIn.readLineDouble();
		
		EncapsulationDemoClass quinn = new EncapsulationDemoClass(gpa);
			
		
		
		
		
		quinn.setInfo();
		
		  
		  
		name = quinn.getName();   		
		number = quinn.getFavNumber(); 			
		letter = quinn.getFavLetter();   
		
		
		
		System.out.println("\n\n\n Hello, " + name);
		System.out.println("\n Your favorite # is: " + number);
		System.out.println("\n Your favorite letter is " + letter);
		
		System.out.println (quinn); // calls the toString method
	}
}