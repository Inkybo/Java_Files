public class ForLoopDemo
{
public static void main(String[] args)
{
	

	for (int i=0; i < 10; i++)
	{
		System.out.println(i);
	}
	
	
	System.out.println();
	
	

	
	


	int score=0, students=0;
	double total=0, average=0;
	
	System.out.println("How many scores do you have to enter?");
	students = SavitchIn.readLineInt();
	
	System.out.println("Enter your scores now.");
	
	
	for (int i = 1; i <= students; i++)
	{
		score = SavitchIn.readLineInt();
		
		total += score;
		
		if (total>1000)
		{
			System.out.println("overload");
			break;
		}	
	}
	
	average = total/students;
	System.out.println("The average is " + average);
	
	
}
}
