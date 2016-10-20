import java.text.DecimalFormat;

public class DecimalRound
{
	public static void main(String[] args)
	{
		double x = 0;
		
		x = 11234.3682;
		
		DecimalFormat celery = new DecimalFormat("#.##");
		
		System.out.println (celery.format(x));
		
		String word = "apple";
		System.out.println (word.length());
		System.out.println (word.charAt(0));
		
		if (word.charAt(0) =='a' || word.charAt(0) =='b')
		{
			System.out.println ("1st letter is a or b");
		}
		
		word = word.toUpperCase();
		System.out.println (word);
		
		System.out.println (word.indexOf('P'));
		
	
		
		
		
				
		
		
	}
}