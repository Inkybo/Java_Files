public class BooleanDemo
{
	public static void main(String[] args)
	{
		boolean gameOver = false;
		char quit = ' ';
		
		do
		{
			System.out.print("This is a fun game");
			System.out.print("Would you like to quit the game? ");
			quit = SavitchIn.readLineNonwhiteChar();
			
			if (quit == 'y')
			{
				gameOver = true;
			}
			
			
		} while (gameOver==false);
		
	
	}
}