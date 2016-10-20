public class Alpha
{
	public static void main (String[] args) {
	
	char[][] table= new char[9][16];
	
	for(int x = 0; x < table.length; x++)
	{
		for(int y = 0; y < table[x].length; y++)
		{
			table[x][y]='k';
		}
	}
	
	for(int x = 0; x < table.length; x++)
	{
		for(int y = 0; y < table[x].length; y++)
		{
			System.out.print (table[x][y]);
		}
		System.out.println ();
	}
	
	System.out.println ("\n");
	
	for(int x = 0; x < table.length; x++)
	{
		for(int y = 0; y < table[x].length; y++)
		{
			table[x][y]= (char)(Math.random()*26 + 97);
		}
	}
	
	for(int x = 0; x < table.length; x++)
	{
		for(int y = 0; y < table[x].length; y++)
		{
			System.out.print (table[x][y]);
		}
		System.out.println ();
	}


	//lower = (char)(Math.random()*26 + 97);
}
}