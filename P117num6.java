public class P117num6
{
	public static void main (String[] args) {
	
	double hour = 0.0;
	double min = 0.0;
	double sec = 0.0;
	double hour_sum = 0.0;
	double min_sum = 0.0;
	double totsec = 0.0; 
	
	System.out.println ("how many hours?");
	
	hour = SavitchIn.readLineDouble();
	
	System.out.println ("how many minutes?");
	
	min = SavitchIn.readLineDouble();
	
	System.out.println ("how many seconds?");
	
	sec = SavitchIn.readLineDouble();
	
	hour_sum = (hour*60)*60;
	min_sum = min*60;
	totsec = hour_sum+min_sum+sec;
	
	System.out.println (+hour+" hour(s) "+min+" minutes(s) and "+sec+" second(s) is equal to "+totsec+" seconds"); 
	
	



}
}