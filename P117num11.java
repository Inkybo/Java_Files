public class P117num11
{
	public static void main (String[] args) {
	
	double gal = 0.0;
	double mpg = 0.0;
	double od_st = 0.0;
	double od_en = 0.0;
	double od_sum = 0.0;
	
	System.out.println ("How many Gallons?");
	
	gal = SavitchIn.readDouble();
	
	System.out.println ("odometer starting number:");
	
	od_st = SavitchIn.readDouble();
	
	System.out.println ("odometer ending number:");
	
	od_en = SavitchIn.readDouble();
	
	od_sum = od_en - od_st;
	
	mpg = od_sum / gal;
	
	System.out.println ("you MPG is "+mpg);
	
	
	
	

}
}