public class CoreAssessmentPractice
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	String num_list = "";
	int total = 0;
	int total_2 = 0;
	
	total = 1;
	
	for(int x = 1; x < 7; x++)
	{
		total = total * x;
		System.out.println (total);
		
		for(int y = 1; y < 7; y++)
		{
			total_2 = total_2 +	y;
			System.out.println (total_2);
		}	
	}
	System.out.println ();
	
	for(int y = 1; y < 7; y++)
	{
		total_2 = total_2 +	y;
		System.out.println (total_2);
	}
	
	
}
}