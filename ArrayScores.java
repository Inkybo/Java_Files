public class ArrayScores
{
	public static void main (String[] args) {
	
	int num_scores = 0;
	int num_sum = 0;
	double avg = 0.0;
	
	System.out.println ("How many scores will you enter?");
	
	num_scores = SavitchIn.readLineInt();
	
	int[] scores = new int[num_scores];
	
	for (int x = 0; x < scores.length; x++)
	{
		System.out.println ("Enter a score: (0 to 100)");
		scores[x] = SavitchIn.readLineInt();
	}
	
	for (int y = 1; y < scores.length; y++)
	{		
		if (scores[y] >= 90 && scores[y] <= 100)
		{
			System.out.println ("Score #" +y+" = "+scores[y]+"%, which is a A");	
		}
		if (scores[y] >= 80 && scores[y] <= 89)
		{
			System.out.println ("Score #" +y+" = "+scores[y]+"%, which is a B");	
		}
		if (scores[y] >= 60 && scores[y] <= 79)
		{
			System.out.println ("Score #" +y+" = "+scores[y]+"%, which is a C");	
		}
		if (scores[y] >= 0 && scores[y] <= 59)
		{
			System.out.println ("Score #" +y+" = "+scores[y]+"%, which is a F");	
		}	
	}
	for(int z = 0; z < scores.length; z++)
	{
		num_sum = num_sum + scores[z];
	}
	
	avg = num_sum / num_scores;
	
	System.out.println ("The average score was"+avg);
	
}
}