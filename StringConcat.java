public class StringConcat
{
	public static void main(String[] args)
	{
		String word = "";
		char letter = ' ';
		int x = 0;
		
		System.out.print("How many letters are in the word? ");
		x = SavitchIn.readLineInt();
		
		
		System.out.println();
		
		for(int i=0; i<x; i++)
		{
			System.out.print("Type letter #" + i + ": ");
			letter = SavitchIn.readLineNonwhiteChar();
			
			word += letter;  //****THIS IS STRING CONCATENATION
			
		}
				
		
		System.out.println("\nThe word is: " + word + "\n\n");
		
	}
}