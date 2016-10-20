public class Numbaz
{
	public static void main (String[] args) {
	
	double score = 0.0;
	
	System.out.println ("Enter a test score between 0 and 100:");
	score = SavitchIn.readLineDouble();
	
	if (score >=90 && score <=100)
	{
		System.out.println ("thats an A");
	}
	if (score >=80 && score <=89)
	{
		System.out.println ("thats a B");
	}
	if (score >=70 && score <=79)
	{
		System.out.println ("thats a C");
	}
	if (score >=0 && score <=69)
	{
		System.out.println ("try harder");
	}
	// Even or Odd	
	if (score%2 ==0)
	{
		System.out.println ("Score is even");
		// prime number
		if (score <= 2 && score%2 ==0)
		{
			System.out.println ("Score is prime");
		}
		else 
		{
			System.out.println ("Score is not prime");
		}
	}
	else
	{
		System.out.println ("Score is odd");
	}
	// divisible by 7
	if (score%7 ==0)
	{
			System.out.println ("Score is Divisible by 7");
			if (score%14 == 0)
			{
				System.out.println ("Score is a multiple of 14");
			}
			else
			{
				System.out.println ("Score is not a multiple of 14");
			}
	}
	// score is 97
	if (score == 97)
	{
		System.out.println ("Yay");
	}
	// less than 0 or more than 100
	if (score <0 || score >100)
	{
		System.out.println ("Shame on you, please enter a number between 0 and 100");
	}
}
}