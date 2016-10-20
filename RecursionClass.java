public class RecursionClass
{
	public void cashMoney(int n)
	{
		if(n>0)
		{
			cashMoney(n-1);
			for(int i=1;i<=n;i++)
			{
				System.out.println("$");
			}
				
			System.out.println();
		}
	}
	
	//////////////////////////////////////////////
	
	public int findMiddleNum(int x, int y)
	{
		if (x==y)
		{
			return x;
		}
		else
		{
			return (findMiddleNum(x+1,y-1));
		}
	}
	
	//////////////////////////////////////
	
	public int someMath(int k)
	{
		if (k == 1)
		{
			return 0;
		}
		else
		{
			return (1+someMath(k/2));
		}
	}
	
	///////////////////////////////////
	
	public String reverser(String x,String y)
	{ 
 
   		if(x.length() == 0)
  		{ 
   		     return y; 
 		}
 		else
 		{ 
        	y+=x.charAt(x.length()-1); 
        	x=x.substring(0,x.length()-1); 
           	return reverser(x,y); 
    	} 
 
	}
	
	
	
}