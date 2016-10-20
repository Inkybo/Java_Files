public class P241num6class
{

	private String sound = "";

////////////////////////////////////////////////
	public String alarm(int x)
	{
		if (x < 1)
		{
			sound = "ERROR: Try again!";
		}	
		else
		{
			sound = "ALARM!";
		}
		
		return sound;
	}



}	