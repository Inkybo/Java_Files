public class Unit2QuizPractice
{
	private boolean B = false;
	private boolean curve = false;
	private boolean palen = false;
	private String name = "";
	private String b = "";
	private int z = 0;
	private int v = 0;
///////////////////////////////////////
	public String DisplayName()
	{
		name = "Nick Taddei";
		return name;	
	}
///////////////////////////////////////
	public int Mult3Nums(int x, int y, int z)
	{
		return x*y*z;
	}
///////////////////////////////////////
	public double Add4Nums(double w, double x, double y, double z)
	{
		return w+x+y+z;			
	}
///////////////////////////////////////
	public boolean ContainsB(String x)
	{
		B = false;
		for(int y = 0; y < x.length(); y++)
		{
			if (x.charAt(y)== 'b')
			{
				B = true;	
			}	
		}
		return B;
	}
///////////////////////////////////////
	public int SumOdd(int x, int y)
	{
		for (int w = x; w >= y;w--)
		{
			if (w%2 != 0)
			{
				v = v + w;  	
			}	
		}
		return v;		
	}
///////////////////////////////////////
	public String PrintDouble(int x)
	{
		b = ""+x+"\n"+x+""; 
		return b;
 
	}
///////////////////////////////////////
	public boolean GotCurves(char x)
	{
		curve = false;
		if(x == 'q' || x == 'r' || x == 'u' || x == 'o' || x == 'p' || x == 'a' || x == 's' || x == 'd' || x == 'g' || x == 'h' || x == 'j' || x == 'c' || x == 'b')
		{
			curve = true;	
		}
		return curve;
	}	
///////////////////////////////////////
	public boolean Palindrome(String x)
	{
		
		for (int z = 0; z < x.length(); z++)
		{
			for (int y = x.length();y > 0; y--)
			{
				if(x.charAt(z) == x.charAt(y))
				{
					palen = true;		
				}
				else
				{
					palen = false;
				}
			}
		}
		return palen;	
	}
	//bool isPalindrome(string s) {
  	//int n = s.length();
  	//for (int i=0;i<(n / 2) + 1;++i) 
  	//	{
    // 	if (s.charAt(i) != s.charAt(n - i - 1)) 
    // 		{
    //     	return false;
    // 		}
  	//	}
  	//	return true;
	//	}	
	
	
	
	
}