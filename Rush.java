public class Rush
{
	public static void main (String[] args) {
	
	String name = "";
	String letter = "";
	int num1 = 0;
	
	System.out.println ("enter a word:");
	
	name = SavitchIn.readLine();
	
	if (name.equalsIgnoreCase("neil"))
	{
		System.out.println ("Enter a letter:");
		
		letter = SavitchIn.readLine();
		
		if (letter.equals('a') || letter.equals('b'))
		{
			System.out.println ("Peart");	
		}
		else
		{
			System.out.println ("Xanadu");
		}
	}
	if (name.equalsIgnoreCase("Geddy"))
	{
		System.out.println ("Enter a number:");
		num1 = SavitchIn.readLineInt();
		
		if (num1%1 ==0 && num1%9 ==0)
		{
			System.out.println ("Lee");
		}
		if (num1 <0 || num1 ==2112)
		{
			System.out.println ("YYZ");
		}
	}	
	else 
	{
		System.out.println ("the third letter of the word is: "+name.charAt(2));
		System.out.println ("The length of the word is: "+name.length());
	}
}
}