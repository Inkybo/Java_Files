public class DavosClient
{
	public static void main (String[] args) {
	
	int age = 0;
	int val = 0;
	int val_2 = 0;
	int time = 0;
	int find = 0;
	int prim_num_cl = 0;
	int num_1 = 0;
	int num_2 = 0;
	int prim_sum = 0;
	int try_1 = 0;
	int correct_letter_num = 0;
	String next = "";
	String name = "";
	String word_1 = "";
	String sam_1 = "";
	String sam_2 = "";
	String choice = "";
	String binary = "";
	char last = ' ';
	char check = ' ';
	char quess_letter = ' ';
	char correct_letter = ' ';
	boolean pri_num_boo = false;
	
	System.out.println ("What is your age?");
	
	age = SavitchIn.readLineInt();
	
	name = " ";
	
DavosClass dav = new DavosClass(age, name, time, word_1);
	
	System.out.println (dav.ageDiv());
	
	System.out.println ("Enter a number:");
	
	val = SavitchIn.readLineInt();
	
	System.out.println ("enter a second number?");
	
	choice = SavitchIn.readLine();
	
	if(choice.equalsIgnoreCase("yes"))
	{
		System.out.println ("Enter a second number:");
	
		val_2 = SavitchIn.readLineInt();
		
		System.out.println (dav.abs(val,val_2));	
	}
	else
	{
		System.out.println (dav.abs(val));	
	}
	
	System.out.println ("Enter a word:");
	
	next = SavitchIn.readLine();
	
	System.out.println (dav.nextToLast(next));
	
	System.out.println ("What is your name:");
	
	name = SavitchIn.readLine();
	
DavosClass dav_1 = new DavosClass(age, name, time, word_1);

	System.out.println ("Enter a number:");
	
	time = SavitchIn.readLineInt();
	
	System.out.println ("Enter a word:");
	
	word_1 = SavitchIn.readLine();
	
	name = " ";
	
	System.out.println ();
	
DavosClass dav_2 = new DavosClass(age, name, time, word_1);
	
	System.out.println ();
	
	System.out.println ("Enter a word:");
	
	word_1 = SavitchIn.readLine();
	
	System.out.println ("Enter a letter:");
	
	check = SavitchIn.readLineNonwhiteChar();
	
	find = dav_2.findIndex(word_1,check);
	
	System.out.println (find);
	
	System.out.println ("Enter a number:");
	
	prim_num_cl = SavitchIn.readLineInt();
	
	pri_num_boo = dav_2.primeNum(prim_num_cl);
	
	System.out.println ("# is prime: " +pri_num_boo);
	
	System.out.println ("Enter first number:");
	
	num_1 = SavitchIn.readLineInt();
	
	System.out.println ("Enter second number:");

	num_2 = SavitchIn.readLineInt();
	
	prim_sum = dav_2.getPrimez(num_1,num_2);
	
	System.out.println (prim_sum+ " prime number(s)");
	
	System.out.println ("Enter a number:");  
	
	num_1 = SavitchIn.readLineInt();
	
	System.out.println (dav_2.sumOfDigits(num_1));
	
	System.out.println ("Enter a word:");
	
	sam_1 = SavitchIn.readLine();
	
	System.out.println ("Enter a second word?");
	
	choice = SavitchIn.readLine();
	
	if(choice.equalsIgnoreCase("yes"))
	{
		System.out.println ("Enter a second word:");
	
		sam_2 = SavitchIn.readLine();
		
		System.out.println (dav_2.same(sam_1,sam_2));	
	}
	else
	{
		System.out.println (dav_2.same(sam_1));
	}
	
	System.out.println ("Enter a 8-bit binary number:");
	
	binary = SavitchIn.readLine();
	
	System.out.println ("converted binary number is:");
	System.out.println (dav_2.converToDecimal(binary)); 
	
	dav_2.letterGame();
	
}
}