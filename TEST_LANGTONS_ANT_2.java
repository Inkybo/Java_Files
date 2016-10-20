public class TEST_LANGTONS_ANT_2
{
	public static void main (String[] args) {
	
	int start_vert = 26;
	int start_horiz = 26;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	boolean north = false;
	boolean south = false;
	boolean east = false;
	boolean west = false;	
	char[][] board = new char[52][52];
	
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			board[c][r]=' ';
		}
	}
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			System.out.print(board[c][r]);
		}
		System.out.println (c);
	}
	do
	{
		if(board[start_vert-1][start_horiz]==((char)(32)))
		{
			north = true;	
		}
		if(board[start_vert+1][start_horiz]==((char)(32)))
		{
			south = true;	
		}
		System.out.println ("\n\n");
		if(board[start_vert][start_horiz]==((char)(32)))
		{
			board[start_vert][start_horiz]=((char)(219));
			start_vert-=1;
			start_horiz-=1;	
		}
		for(int c = 0; c < board.length; c++)
		{
			for(int r = 0; r < board[c].length; r++)
			{
				System.out.print(board[c][r]);
			}
			System.out.println (c);
		}
	}while(0 != 1);
}
}