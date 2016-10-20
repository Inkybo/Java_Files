public class BoxCars
{
	public static void main (String[] args) {
	
	int die_one = 0;
	int die_two = 0;
	int boxcar = 0;
	
	DieClass Box = new DieClass();
		
		for (int z = 0; z <=1000; z++)
		{
			die_one = Box.getRoll(6);
			die_two = Box.getRoll(6);
			
			System.out.println ("Roll "+z+": you rolled a "+die_one+" and a "+die_two);
			
			if (die_one == 6 && die_two == 6)
			{
				boxcar++;
			}
		}
		System.out.println ();
		System.out.println ("Results");
		System.out.println ("======================================");
		System.out.println ();
		System.out.println ("you rolled box cars "+boxcar+" time(s)");	
		System.out.println ();
		System.out.println ("======================================");
		System.out.println ();
		
}
}