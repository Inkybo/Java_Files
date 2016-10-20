public class P185num14
{
	public static void main (String[] args) {
	
	String word = "";
	int a = 0;
	int e = 0;
	int i = 0;
	int o = 0;
	int u = 0;
	int cons = 0;
	int exl = 0;
	int quest = 0;
	int per = 0;
	int com = 0;
	int aps = 0;
	int space = 0;
	
	System.out.println ("Enter a word:");
	
	word = SavitchIn.readLine();
	
	for (int num_1 = 0; num_1 < word.length(); num_1++)
	{
		if (word.charAt(num_1) == ('a'))
		{
			a++;
		}
		if (word.charAt(num_1) == ('e'))
		{
			e++;
		}
		if (word.charAt(num_1) == ('i'))
		{
			i++;
		}
		if (word.charAt(num_1) == ('o'))
		{
			o++;
		}
		if (word.charAt(num_1) == ('u'))
		{
			u++;
		}
		if (word.charAt(num_1) != ('a') && word.charAt(num_1) != ('e') && word.charAt(num_1) != ('i') && word.charAt(num_1) != ('o') && word.charAt(num_1) != ('u') && word.charAt(num_1) != (' ') && word.charAt(num_1) != ('!') && word.charAt(num_1) != ('?') && word.charAt(num_1) != (',') && word.charAt(num_1) != ('.') && word.charAt(num_1) != ('\''))
		{
			cons++;
		}
		if (word.charAt(num_1) == ('!'))
		{
			exl++;
		}
		if (word.charAt(num_1) == ('?'))
		{
			quest++;
		}
		if (word.charAt(num_1) == ('.'))
		{
			per++;
		}
		if (word.charAt(num_1) == (','))
		{
			com++;
		}
		if (word.charAt(num_1) == ('\''))
		{
			aps++;
		}
		if (word.charAt(num_1) == (' '))
		{
			space++;
		}
	}
		System.out.println ("there were " +a+" of the letter a");
		System.out.println ("there were " +e+" of the letter e");
		System.out.println ("there were " +i+" of the letter i");
		System.out.println ("there were " +o+" of the letter o");
		System.out.println ("there were " +u+" of the letter u");
		System.out.println ("there were " +cons+" consonants");
		System.out.println ("there were " +space+" spaces");
		System.out.println ("there were " +exl+" '!'");
		System.out.println ("there were " +quest+" '?'");
		System.out.println ("there were " +per+" '.'");
		System.out.println ("there were " +com+" ','");
		System.out.println ("there were " +aps+" '''");

}
}