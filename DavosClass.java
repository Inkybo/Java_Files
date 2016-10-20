public class DavosClass
{
	private int age = 0;
	private int absol = 0;
	private int times = 0;
	private int ind = 0;
	private int ind_2 = 0;
	private int fin = 0;
	private int prim_num = 0;
	private int sum_dig = 0;
	private int sam = 0;
	private int bin_num = 0;
	private int lower = 0;
	private String full_name = "";
	private String word = "";
	private char letter = ' ';
	private boolean div = false;
	private boolean prime = false;
	private boolean prime_num_boo = false;
	private boolean same = false;

///////////////////////////////////////////////////////////////////////	
	public DavosClass(int x, String z, int w, String v)
	{
		age = x;
		full_name = z;
		times = w;
		word = v;
		
		if ((full_name != " "))
		{
		getName();
		}
		else
		{
		displayStuff();
		}
	}
///////////////////////////////////////////////////////////////////////	
	public DavosClass()
	{
		age = 42;	
	}
///////////////////////////////////////////////////////////////////////	
	public boolean ageDiv()
	{
		div = false;
		
		if(age%5 == 0)
		{
			div = true;
		}
		else
		{
			div = false;
		}
		return div;
	}
///////////////////////////////////////////////////////////////////////	
	public int abs(int y)
	{
		if(y < 0)
		{
			absol = y*(-1);
		}
		else
		{
			absol = y;
		}
		return absol;		
	}
///////////////////////////////////////////////////////////////////////	
	public int abs(int x, int y)
	{
		if(y>x)
		{
			if(x < 0)
			{
			absol = x*(-1);
			}
			else
			{
			absol = x;
			}	
		}
		if(y<x)
		{
			if(y < 0)
			{
				absol = y*(-1);
			}
			else
			{
				absol = y;
			}	
		}
		return absol;	
	}
///////////////////////////////////////////////////////////////////////		
	public char nextToLast(String x)
	{
		return x.charAt(x.length()-2);	
	}
///////////////////////////////////////////////////////////////////////		
	public void getName()
	{
		System.out.println ("You suck " + full_name);		
	}
///////////////////////////////////////////////////////////////////////		
	private void displayStuff()
	{
		for (int z = times; z > 0; z--)
		{
			System.out.println (word);
		}
	}
///////////////////////////////////////////////////////////////////////		
	public int findIndex(String x, char y)
	{
		for (int z = 0; z < x.length(); z++)
		{
			ind_2 = y;
			ind = x.charAt(z);
			
			if (ind == ind_2)
			{
				fin = ind_2;
				break;		
			}
			else
			{
				fin = 999;
			}	
		}
		return fin;		
	}
///////////////////////////////////////////////////////////////////////		
	public boolean primeNum(int x)
	{		
	        prime = true;
	        if (x <= 1) 
	        {
	        	prime = false;
	        }
	        else
	        {
	        	for (int i = 2; i < x; i++) 
	        	{
			        if (x % i == 0) 
			        {
			            prime = false;
			            break;
			        }
		    	}
	        }
		return prime;
	}	
///////////////////////////////////////////////////////////////////////		
	public int getPrimez(int x, int y)
	{
		prime_num_boo = true;
		
		for (int s = x; s <= y; s++)
		{
		    	prime_num_boo = true;
		    	for (int i = 2; i < s; i++) 
	        	{
			        if (s % i == 0) 
			        {
			            prime_num_boo = false;
			            break;
			        }
		    	}
		    	if(prime_num_boo == true)
			        {
			        	prim_num++;
			        }

		}
		return prim_num;
	}
///////////////////////////////////////////////////////////////////////		
	public int sumOfDigits(int x)
	{
		while (x != 0)
		{
			sam += x % 10;
			x /=10;
		} 
		
		return sam;
	}
///////////////////////////////////////////////////////////////////////		
	public boolean same(String x, String y)
	{
		same = false;
		
		if (x.equals(y))
		{
			same = true;
		}
		return same;
	}
///////////////////////////////////////////////////////////////////////		
	public boolean same(String x)
	{
		if(x.equals("bird"))
		{
			same = true;
		}
		return same;
	}
///////////////////////////////////////////////////////////////////////		
	public int converToDecimal(String x)
	{	
	//128
		if (x.charAt(0) == ('1'))
		{
			bin_num+=128;
		}
		else
		{
			bin_num+=0;
		}
	//64
		if (x.charAt(1) == ('1'))
		{
			bin_num+=64;
		}
		else
		{
			bin_num+=0;
		}	
	//32
		if (x.charAt(2) == ('1'))
		{
			bin_num+=32;
		}
		else
		{
			bin_num+=0;
		}
	//16
		if (x.charAt(3) == ('1'))
		{
			bin_num+=16;
		}
		else
		{
			bin_num+=0;
		}
	//8
		if (x.charAt(4) == ('1'))
		{
			bin_num+=8;
		}
		else
		{
			bin_num+=0;
		}
	//4
		if (x.charAt(5) == ('1'))
		{
			bin_num+=4;
		}
		else
		{
			bin_num+=0;
		}
	//2
		if (x.charAt(6) == ('1'))
		{
			bin_num+=2;
		}
		else
		{
			bin_num+=0;
		}
	//1
		if (x.charAt(7) == ('1'))
		{
			bin_num+=1;
		}
		else
		{
			bin_num+=0;	
		}
		return bin_num;
	}
///////////////////////////////////////////////////////////////////////		
	private void displayGreeting()
	{
		System.out.println ("oh hey");
	}
///////////////////////////////////////////////////////////////////////		
	public void letterGame()
	{
		displayGreeting();
		
		lower = (char)(Math.random()*26 + 97);
		//System.out.println (lower);
		//System.out.println ((char)(lower));
	
		letter = SavitchIn.readLineNonwhiteChar();
		
		for (int x = 0; x < 10; x++)
		{
			if (letter == lower)
			{
				System.out.println ("You guessed correctly!");
				break;
			}
			else
			{
				System.out.println ("Try AGAIN");
				letter = SavitchIn.readLineNonwhiteChar();	
			}
		}
	}	
}