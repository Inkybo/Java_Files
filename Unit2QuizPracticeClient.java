public class Unit2QuizPracticeClient
{
	public static void main (String[] args) {
		
		int num_1 = 0;
		int num_2 = 0;
		int num_3 = 0;
		int num_4 = 0;
		int mul = 0;
		String word = "";
		String drome = "";
		char letter = ' ';
		
Unit2QuizPractice name = new Unit2QuizPractice();
	
	System.out.println (name.DisplayName());
	
Unit2QuizPractice multi = new Unit2QuizPractice();
	
	System.out.println ("Enter 3 numbers:");
	
	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	num_3 = SavitchIn.readLineInt();
	
	System.out.println (multi.Mult3Nums(num_1,num_2,num_3));
	
Unit2QuizPractice add = new Unit2QuizPractice();

	System.out.println ("Enter 4 numbers:");

	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	num_3 = SavitchIn.readLineInt();
	num_4 = SavitchIn.readLineInt();
	
	System.out.println (add.Add4Nums(num_1,num_2,num_3,num_4));	
	
Unit2QuizPractice b = new Unit2QuizPractice();

	System.out.println ("Enter a word:");
	
		word = SavitchIn.readLine();
		
		System.out.println (b.ContainsB(word));	
	
Unit2QuizPractice odd = new Unit2QuizPractice();

	System.out.println ("Enter 2 number(largest first):");
	
	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	
	System.out.println (odd.SumOdd(num_1,num_2));
	
Unit2QuizPractice twice = new Unit2QuizPractice();

	System.out.println ("Enter a number:");
	
	num_1 = SavitchIn.readLineInt();
	
	System.out.println ("\n");
	
	System.out.println (twice.PrintDouble(num_1));
	
Unit2QuizPractice cuve = new Unit2QuizPractice();

	System.out.println ("Enter a letter:");
	
	letter = SavitchIn.readNonwhiteChar();
	
	System.out.println (cuve.GotCurves(letter));
	
Unit2QuizPractice PAL = new Unit2QuizPractice();

	System.out.println ("Enter a word:");
	
	word = SavitchIn.readLine();
	
	System.out.println (PAL.Palindrome(word));
	
	

}
}