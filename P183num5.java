public class P183num5
{
	public static void main (String[] args) {
	
	String word = "";
	
	System.out.println ("enter a word:");
	
	word = SavitchIn.readLine();
	
	for (int num_1 = 0; num_1 < word.length(); num_1++)
	{
		System.out.println (word.charAt(num_1));
	}
	System.out.println ();
	
	for (int num_2 = word.length(); 0 < num_2; num_2-=1)
	{
		System.out.println (word.charAt(num_2-1));
	}
	System.out.println ();
}
}