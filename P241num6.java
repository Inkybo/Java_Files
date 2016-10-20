public class P241num6
{
	public static void main (String[] args) {
	
	int num_alarm = 0;
	String sound = "";
	
	P241num6class num6 = new P241num6class();
	
	num_alarm = SavitchIn.readInt();
	
		sound = num6.alarm(num_alarm);

	for (int x = 0; x <= num_alarm; x++)
	{
		System.out.println (sound);
		System.out.println ("\n");
	}
	










}
}