public class P241Client
{
	public static void main (String[] args) {
	
	int num_alarm = 0;
	String sound = "";
	int num_1 = 0;
	int num_2 = 0;
	int num_3 = 0;
	int comp = 0;
	int sum = 0;
	int range = 0;
	int range_1 = 0;
	int range_2 = 0;
	String count = "";
	int coun_1 = 0;
    int even_1 = 0;
    int even_2 = 0;
    int rev = 0;
    String rev_1 = "";
    int rev_2 = 0;
    String rev_3 = "";
    int side = 0;
    int side_1 = 0;
    int side_2 = 0;
    int side_3 = 0;
    int range_num_1 = 0;
    int range_num_2 = 0;
    int range_num_3 = 0;

	
P241Class num6 = new P241Class();
	
	num_alarm = SavitchIn.readInt();
	
		sound = num6.alarm(num_alarm);

	for (int x = 0; x < num_alarm; x++)
	{
		System.out.println (sound);
		System.out.println ("\n");
	}
	
P241Class num7 = new P241Class();

	num_3 = num7.sum100();
	
	
	
P241Class num8 = new P241Class();
	
	System.out.println ("enter first number:");
	
	num_1 = SavitchIn.readLineInt();
	
	System.out.println ("enter second number:");

	num_2 = SavitchIn.readLineInt();
	
	comp = num8.maxOfTwo(num_1, num_2);
	
	System.out.println ("The larger number is "+comp);
	
P241Class num9 = new P241Class();
	
	System.out.println ("Enter 2 numbers:");
	
	System.out.println ("First number:");
	
	range_1 = SavitchIn.readLineInt();
	
	System.out.println ("Second number");
	
	range_2 = SavitchIn.readLineInt();

	range = num9.sumRange(range_1, range_2);
	
	if (range_2 < range_1)
	{
		System.out.println ("Error: second number is too small");
	}
	else
	{
		range_1 = 0;
		for (int x = range; x <= range_2; x++)
		{
			range_1 = range_1 + x;
		}
		System.out.println ("sum = "+range_1);
	}
P241Class num11 = new P241Class();
	
	System.out.println ("Enter a word:");
	
	count = SavitchIn.readLine();
	
	coun_1 = num11.countA(count);
	
	System.out.println ("The letter a appeared "+coun_1+" times");
P241Class num12 = new P241Class();     
    System.out.println("enter First number");
    
    even_1 = SavitchIn.readLineInt();

    System.out.println("enter second number");

    even_2 = SavitchIn.readLineInt();  

    if(num12.evenlyDivisible(even_1, even_2) == true)
    {
    	System.out.println("true");
    }
    else
    {
     System.out.println("false");
    }
P241Class num20 = new P241Class();
    System.out.println("Enter a word:"); 

    rev_1 = SavitchIn.readLine();

    rev_3 = num20.reverse(rev_1);
    
    System.out.println (rev_3);

P241Class num21 = new P241Class();

    System.out.println("Side 1 length:");

    side_1 = SavitchIn.readLineInt();

    System.out.println("Side 2 length:");

    side_2 = SavitchIn.readLineInt();
    
    System.out.println("Side 3 length:");
    
    side_3 = SavitchIn.readLineInt();
 
    if(num21.isIsosceles(side_1, side_2, side_3));
    {
     
    }
P241Class num22 = new P241Class();

	System.out.println ("Enter first number:");
	
	range_num_1 = SavitchIn.readLineInt();
	
	System.out.println ("Enter second number:");
	
	range_num_2 = SavitchIn.readLineInt();
	
	range_num_3 = num22.randomInRange(range_num_1, range_num_2);
        
        System.out.println(range_num_3);


	
	
	
	
	
		

}
}