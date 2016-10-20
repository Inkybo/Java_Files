public class P242Class
{
	private String mult = "";
	private boolean let = false;
	private int letter = 0;
	private int let_vale = 0;
/////////////////////////////////////////////////////////////////	
	public float average (int x, int y)
	{
		return (x + y)/2;
			
	}
/////////////////////////////////////////////////////////////////	
	public float average (int x, int y, int z)
	{
		return (x + y + z)/3;
	}
/////////////////////////////////////////////////////////////////	
	public float average (int w, int x, int y, int z)
	{
		return (w + x + y + z)/4;
	}
/////////////////////////////////////////////////////////////////	
	public String multiConcat (String x, int y)
	{
		for(int v = y; v > 0;v--)
		{
			mult+= x;	
		}	
		return mult;
	}
/////////////////////////////////////////////////////////////////	
	public String multiConcat (String x)
	{
			mult+= x;
			mult+= x;		
		return mult;
	}
/////////////////////////////////////////////////////////////////	
	public boolean isAlpha (char y)
	{
		let = false;
		letter = 'y';
		
		let_vale = (int)y;
		
		if(let_vale >= 65 && let_vale <= 90)
		{
			let = true;	
		}	
		else
		{
			let = false;	
		}	
		return let;
	}
}