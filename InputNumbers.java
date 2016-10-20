public class InputNumbers
{
	public static void main (String[] args) {
	
	int num_1 = 0;
	int num_2 = 0;
	int pro = 0;
	double quo = 0;
	int sqr = 0;
	int cub = 0;
	
	System.out.println ("Enter First number");
	num_1 = SavitchIn.readLineInt();
	System.out.println ("Enter a second number");
	num_2 = SavitchIn.readLineInt();
	
	pro = num_1*num_2;
	quo = num_2/num_1;
	sqr = num_1*num_1;
	cub = num_2*num_2*num_2;
	
	System.out.println ("The product of "+num_1+" and "+num_2+" is "+ pro);
	System.out.println ("The quotient of "+num_1+" and "+num_2+" is "+ quo);
	System.out.println (""+num_1+" squared is "+ sqr);
	System.out.println (""+num_2+" cubed is "+ cub);
	System.out.println ("Neil Peart rules");
	
	

}
}