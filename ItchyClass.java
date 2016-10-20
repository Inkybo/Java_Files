public class ItchyClass
{
/////////////////////////////////////////////////////////////////////////////////
	public void DisplayBoard(char[][] boar)
	{
		for(int c = 0; c < boar.length; c++)
		{
			for(int r = 0; r < boar[c].length; r++)
			{
				System.out.print(boar[c][r]);
			}
			System.out.println ();
		}	
	}
}