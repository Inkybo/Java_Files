public class SayMyName
{
	public static void main (String[] args) {
	
	String name_first = "";
	String name_last = "";
	
	System.out.println ("Enter your first name");
	name_first = SavitchIn.readLine();
	
	System.out.println ("Enter your last name");
	name_last = SavitchIn.readLine();
	
	if (name_first.equalsIgnoreCase("Walter") && (name_last.equalsIgnoreCase("White")))
		{
			System.out.println ("Heisenberg");
		}
	else
	{
		if (name_first.equalsIgnoreCase("Walter") || (name_last.equalsIgnoreCase("Walter")))
	{
		System.out.println ("You shall recive copious ammounts of good fortune");
	}
	}
}
}