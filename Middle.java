public class Middle
{
	public static void main (String[] args) {
	
	String name_mid = "";
	int start = 0;
	int end = 0;
	int sub_start = 0;
	int sub_end = 2;
	
	System.out.println ("Enter you middle name:");
	
	name_mid = SavitchIn.readLine();
	
	
	if (name_mid.charAt(0) =='a' || name_mid.charAt(0) =='e' || name_mid.charAt(0) =='i' || name_mid.charAt(0) =='o' || name_mid.charAt(0) =='o')
	{
		System.out.println ("Vowel");	
	}
	else
	{
		System.out.println ("consonant");
	}
	if (name_mid.length() > 9)
	{
		System.out.println ("Long");
	}
	if (name_mid.length() <=9 && name_mid.length() >=4)
	{
		System.out.println ("Medium");
	}
	else
	{
		System.out.println ("Short");
	}
	if (name_mid.length()%2 ==0)
	{
		System.out.println ("Even");
		if (name_mid.length()%4 ==0)
		{
			System.out.println ("Divisable by 4");
		}
		else
		{
			System.out.println ("Not divisable by 4");
		}
	}
	if (name_mid.length()%1 ==0)
	{
		System.out.println ("Odd");
		if (name_mid.length()%5 ==0)
		{
			System.out.println ("Divisable by 5");
		}
		else
		{
			System.out.println ("Not divisable by 5");
		}
	}
	if (name_mid.indexOf('a') != -1 || name_mid.indexOf('A') != -1)
	{
		System.out.println ("Letter a has been found at index #"+name_mid.indexOf('a'));
	}
	else 
	{
		System.out.println ("The letter a was not found");
	}
	if (name_mid.charAt(0) ==(name_mid.charAt(name_mid.length()-1)))
	{
		System.out.println ("same");
	}
	else
	{
		System.out.println ("different");
	}
	if (name_mid.charAt(1) ==(name_mid.charAt(name_mid.length()-2)))
	{
		System.out.println ("YES K");
	}
	System.out.println (name_mid.substring(0,3));
	System.out.println (name_mid.substring(1));
	


}
}