public class ArrayDemo1
{
	public static void main(String[] args)
	{
		
		
		// There are 3 techniques for populating an array
		
		
		// -------technique #1----------------------------------
		
		
		int[] grades = {90,86,100,73,85};
		
	
		
		
		
		
		// -------technique #2----------------------------------
		
		 
		int[] numbers = new int[4];
		
		
		numbers[0] = 5;
		numbers[1] = 7;		
		numbers[2] = 14;
		numbers[3] = -6;
	
		
		
		
		
		// -------technique #3----------------------------------
		
		int size=0;
		System.out.print("how many ages will you enter?");
		size=SavitchIn.readLineInt();
		
		int[] ages = new int[size];
		
		for(int i = 0; i <= ages.length-1; i++)
		{
			System.out.print("Enter someone's age: ");
			ages[i] = SavitchIn.readLineInt();
		}
		
		
	
		////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		// use a for loop to display an array:
		
		for(int i = 0; i < ages.length; i++)
		{
			System.out.println("\nAge # " + i + ": " + ages[i]);
		}
		
		
		System.out.println("\n\n\n");
	}
}
