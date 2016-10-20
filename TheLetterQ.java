public class TheLetterQ
{
	public static void main (String[] args) {
	
	String q = "";
	int miss = 0;
	
	System.out.println ("Enter a Word that begins with the letter Q:");
	
	q = SavitchIn.readLine();
	
	while (q.charAt(0)!=('q') || q.charAt(0) !=('Q'))
	{
		System.out.println ("How perposturous, TRY AGAIN:");
		q = SavitchIn.readLine();
		miss++;
		if(q.charAt(0)==('q') || q.charAt(0) ==('Q'))
		{
			System.out.println ("----------------------------------------------------");
			System.out.println ();
			System.out.println ("You entered "+miss+" words that did not begin with Q or q.");
			System.out.println ();
			System.out.println ("----------------------------------------------------");
			break;
		}
	}

}
}