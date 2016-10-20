public class Fifty
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	int num_3 = 0;
	int even = 0;
	int odd = 0;
	int thirty = 0;
	int sev = 0;
	int high = 0;
	int low = 50;
	int prime = 0;
	
	for(int num_2= 0; num_2 < 12; num_2++)
	{	
		num_1 = (int)(Math.random()*50+1);
		
		System.out.println (num_1);
	
		if (num_1%2 ==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
		if (num_1 >= 30 && num_1 < 40)
		{
			thirty++;
		}
		if (num_1 == 37)
		{
			sev++;	
		}
		if (num_1 > high)
		{
			high = 0;
			high = num_1;
		}
		if (num_1 < low)
		{
			low = 50;
			low = num_1;
		}
		if (num_1 == 2 || num_1 == 3 || num_1 == 5 || num_1 == 7 || num_1 == 11 || num_1 == 13 || num_1 == 17 || num_1 == 19 || num_1 == 23 || num_1 == 29 || num_1 == 31 || num_1 == 37 || num_1 == 41 || num_1 == 43 || num_1 == 47)
		{
			prime++;
		}
		num_3= num_3 + num_1;
	}
		
		System.out.println ("there are "+even+" even numbers");
		System.out.println ("there are "+odd+" odd numbers");
		System.out.println ("there are "+thirty+" numbers in the 30s");
		System.out.println ("the average was "+num_3);
		System.out.println ("the highest number was "+high);
		System.out.println ("the lowest number was "+low);
		System.out.println ("there was "+prime+" prime numbers");
}
}