public class CLIENTdemo // THIS IS A CLIENT PROGRAM
{
	public static void main(String[] args)
	{
		int gpa = 0, number = 0;
		char letter = ' ';
		String banana = "";
		
		
		
		CLASSdemo quinn = new CLASSdemo();   // this is called INSTANTIATING the "quinn" OBJECT
			
		
		
		
		
		quinn.displayHi(); // this calls the method displayGreeting
		
		quinn.setInfo(); // notice: these 2 methods DO a task, they do not RETURN anything!

		 
		  
		  
		banana = quinn.getName();  // these methods RETURN some piece of information, hence the "banana =", so that the info is saved in banana		
		number = quinn.getAge(); 			
		letter = quinn.getInitial();   
		
		
		
		System.out.println("\n\n\n Hello, " + banana);
		System.out.println("\n Your favorite # is: " + number);
		System.out.println("\n Your favorite letter is " + letter);
		
		quinn.displayByeBye();

	}
}