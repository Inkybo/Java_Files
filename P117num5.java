public class P117num4
{
	public static void main (String[] args) {
	
	double  kilo = 0.0;
	double mile = 0.0;
	
	System.out.println ("How many miles?");
	mile = SavitchIn.readLineDouble();
	
	kilo = mile*1.60935; 
	
	System.out.println (+mile+" miles is "+kilo+" kilometers");

}
}