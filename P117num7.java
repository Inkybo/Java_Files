public class P117num7
{
	public static void main (String[] args) {
	
	double hour = 0.0;
	double min = 0.0;
	double sec = 0.0;
	int hour_time = 0;
	int min_time = 0;
	int sec_time = 0;
	double totsec = 0.0; 
	
	System.out.println ("how many seconds?");
	
	totsec = SavitchIn.readLineDouble();
	
	
	hour = (Double)totsec/3600.0;
	min = (hour*60.0)%60;
	sec = (totsec%60)%60;
	
	 hour_time = 0;
	 min_time = 0;
	 sec_time = 0;
	
	
	System.out.println ("the time is "+hour+":"+min+":"+sec); 
 
	


}
}