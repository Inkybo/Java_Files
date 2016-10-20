public class FamilyClass
{
	private int people = 0;
	private int age = 0;
	private int age_yon = 100;
	private int age_old = 0;
	private int avg = 0;
	private int Oldest = 0; 
	private int Youngest = 0;
	private int Child = 0;
	private int Teen = 0;
	private int Adult = 0;
	private int Even  = 0;
	private int Odd = 0;
		
////////////////////////////////////////////////////////////////////////////////
	
	public void setData()
	{
		System.out.println ("How many people are in your family?:");
		
		people = SavitchIn.readLineInt();
		
	for (int x = 0; x < people; x++)
	{	
		System.out.println ("What is their age?");
		
		age = SavitchIn.readLineInt();
		
		avg = avg + age;
		
		if (age < age_yon)
		{
			age_yon = age;
			Youngest = age;	
		}
		if (age >= age_old)
		{
			age_old = age;
			Oldest = age;	
		}
		if (age >= 0 && age <= 12)
		{
			Child++;		
		}
		if (age >= 13 && age <=19)
		{
			Teen++;
		}
		if (age >= 20)
		{
			Adult++;	
		}
		if (age%2 == 0)
		{
			Even++;
		}
		else 
		{
			Odd++;
		}
	}
		avg = avg / people;
	}
////////////////////////////////////////////////////////////////////////////////

	public int getAvg()
	{ 
		return avg; 	
	}

////////////////////////////////////////////////////////////////////////////////

	public int getOldest()
	{
		return Oldest;
	}

////////////////////////////////////////////////////////////////////////////////

	public int getYoungest()
	{
		return Youngest;	
	}

////////////////////////////////////////////////////////////////////////////////

	public int getNumKids() // Kids: age 0-12
	{
		return Child;
	}

////////////////////////////////////////////////////////////////////////////////

	public int getNumTeens()
	{
		return Teen;
	}

////////////////////////////////////////////////////////////////////////////////

	public int getNumAdults() // adults: age 20+
	{
		return Adult;
	}

////////////////////////////////////////////////////////////////////////////////

	public int getNumEvens()
	{
		return Even;
	}

////////////////////////////////////////////////////////////////////////////////

	public int getNumOdds()
	{
		return Odd;
	}

////////////////////////////////////////////////////////////////////////////////	
}