public class ArrayFrequencyDemo
{
	public static void main(String[] args)
	{
		System.out.print("How many scores? ");
		int num = SavitchIn.readLineInt();
		
		
		
		int[] scores = new int[num];
		
		
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print("Enter a score (from 0 to 100): ");
			scores[i] = SavitchIn.readLineInt();
		}
		
		
		
		
		int[] freq = new int[101];
		
		
		
		
		for(int i = 0; i < scores.length; i++)
		{
		 	freq[ scores[i] ]++;	
		}
		   
		   
		   
		   
		
		for(int i = 0; i < freq.length; i++)
		{
			System.out.println(freq[i] + " people received a score of " + i + ".");	
		}
	
	
	}
}
