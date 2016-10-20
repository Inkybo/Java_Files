public class P117num4
{
	public static void main (String[] args) {
	
	double fah = 0.0;
	double cel = 0.0;
	
	System.out.println ("Enter temp. in Fahrenheit");
	
	fah = SavitchIn.readLineDouble();
	
	cel = (fah-32)*(5/9);
	
	System.out.println (+fah+" degrees fahrenheit is "+cel+" degrees celcius");
	
	


}
}