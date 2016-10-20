public class P242Client
{
	public static void main (String[] args) {
	
	float avg = 0;
	int num_1 = 0;
	int num_2 = 0;
	int num_3 = 0;
	int num_4 = 0;
	String multiple = "";
	String word = "";
	char letter = ' ';
	boolean alf = false;
	
P242Class num13 = new P242Class();
	
	System.out.println ("Enter first number:");
	
	num_1 = SavitchIn.readLineInt();
		
	System.out.println ("Enter second number:");
	
	num_2 = SavitchIn.readLineInt();
	
	avg = num13.average(num_1,num_2);
	
	System.out.println (avg);

P242Class num14 = new P242Class();

	System.out.println ("Enter first number:");
	
	num_1 = SavitchIn.readLineInt();
		
	System.out.println ("Enter second number:");
	
	num_2 = SavitchIn.readLineInt();
	
	System.out.println ("Enter third number:");
	
	num_3 = SavitchIn.readLineInt();
	
	avg = num14.average(num_1,num_2,num_3);
	
	System.out.println (avg);
	
P242Class num15 = new P242Class();
	
	System.out.println ("Enter first number:");
	
	num_1 = SavitchIn.readLineInt();
		
	System.out.println ("Enter second number:");
	
	num_2 = SavitchIn.readLineInt();
	
	System.out.println ("Enter third number:");
	
	num_3 = SavitchIn.readLineInt();
	
	System.out.println ("Enter fourth number:");
	
	num_4 = SavitchIn.readLineInt();
	
	avg = num15.average(num_1,num_2,num_3,num_4);
	
	System.out.println (avg);
	
P242Class num16 = new P242Class();
	
	System.out.println ("Enter first number:");
	
	num_1 = SavitchIn.readLineInt();
	
	System.out.println ("Enter a word:");
	
	multiple = SavitchIn.readLine();
	
	word = num16.multiConcat(multiple,num_1);
	
	System.out.println ();
	System.out.println (word);
	
P242Class num17 = new P242Class();

	word = "";
	
	System.out.println ("Enter a word:");
	
	multiple = SavitchIn.readLine();
	
	word = num16.multiConcat(multiple);
	
	System.out.println ();
	System.out.println (word);

P242Class num18 = new P242Class();
	
	System.out.println ("enter a letter");
	
	letter = SavitchIn.readLineNonwhiteChar();		
	
	alf = num18.isAlpha(letter);	

	System.out.println ("Is the character UPPERCASE?");
	
	System.out.println ("~~~~~~~~");
	System.out.println (alf);
	System.out.println ();
	System.out.println ("~~~~~~~~");




}
}