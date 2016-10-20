public class NestedLoop
{
	public static void main (String[] args) {
	
	System.out.println ("There are 4 students. Each student took 3 tests. Enter their scores.");
	
	int score = 0;
	
	for (int x = 1; x<=4; x++)
	{
		for(int y = 1; y<=3; y++)
		{
			System.out.print("Enter score #" + y + " for student #" + x + ": ");
			score = SavitchIn.readLineInt();
			
			if (score == 999)
			{
				System.out.println ("no more scores for this student!");
				break;
			}
			
			
			
		}
		System.out.println ();
	}
	
		
}
}