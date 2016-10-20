public class ParametersDemo
{	

	private String answer = "";
	
////////////////////////////////////////////////
	public int times3(int x)
	{	
		return(3*x);
	}

/////////////////////////////////////////////////
	
	public String bigOrSmall(int x)
	{
		if (x<10)
		{
			answer = "small";
		}
		else
		{
			answer = "big";
		}
		
		return answer;		
	}
///////////////////////////////////////////

	public boolean IsFirstLarger(int x, int y)
	{	
		boolean bigger = false;
		
		if(x>y)
		{
			bigger = true;
		}
	
		return bigger;  // SHOW RETURN BOOLEAN EXPRESSION.....
	}





}




