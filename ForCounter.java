public class ForCounter
{
	public static void main (String[] args) {
	
	String sent = "";
	int name = 0;
	int e =0;
	
	System.out.println ("Enter a sentence:");
	
	sent = SavitchIn.readLine();
	
	while (sent.length() <= 10 || sent.length() >= 25 || sent.indexOf(' ') == -1)
	{
		System.out.println ("Enter a sentence:");
	
		sent = SavitchIn.readLine();
		
	}	
		for (int num_1 = 0; num_1 < sent.length(); num_1++)
		{
			if (sent.charAt(num_1) == ('n') || sent.charAt(num_1) == ('i') || sent.charAt(num_1) == ('c') || sent.charAt(num_1) == ('k'))
			{
				name++;
			}
			if (sent.charAt(num_1) == ('e'))
			{
				e++;
			}
		}
		System.out.println ("the letter e appeared "+e+" times");
		if (e%3 == 0)
		{
			System.out.println ("the amount of times the letter e appears is a multiple of 3");
		}
		else
		{
			System.out.println ("the amount of times the letter e appears is not a multiple of 3");
		}
		System.out.println (sent.substring(3, sent.length()-1));
		System.out.println ("the golden girls are: \n -Bea Arthur \n -Betty White \n -Estelle Getty \n -Rue McClanahan");	
		System.out.println ();			

	

}
}