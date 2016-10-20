public class ForLoops

{
	public static void main (String[] args) {
	
	String word = "";
	
	for (int num_1 = 55; num_1 <= 61; num_1++)
	{
		System.out.println(num_1);
	}
	for (int num_2 = 40; num_2 <= 75; num_2+=5)
	{
		System.out.println (num_2);
	}
	for (int num_3 = 2; num_3 >=(-4); num_3-=1)
	{
		if (num_3 !=0 )
		{
			System.out.println (num_3);
		}
	}
	System.out.println ("enter a word");
	
		word = SavitchIn.readLine();
		
	System.out.println ();
		for (int num_4 = 0; word.length()> num_4; num_4++)
		{
			System.out.println (word.charAt(num_4));
		}
	System.out.println ();
}
}