public class ItchyAndScratchy
{
	public static void main (String[] args) {
	
	int num_1_i = 0;
	int num_2_i = 0;
	int num_1_s = 0;
	int num_2_s = 0;
	char move = ' ';
	char play_again = ' ';
	Boolean Itchy_Win = false;
	
	do
	{
	char[][] board = new char[11][11];
	
	System.out.println ();
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			board[c][r]='-';
		}
	}
	ItchyClass boa = new ItchyClass();
	boa.DisplayBoard(board);
	System.out.println();
	
	num_1_i = (int)(Math.random()*10+0);
	num_2_i= (int)(Math.random()*10+0);
	
	num_1_s = (int)(Math.random()*10+0);
	num_2_s = (int)(Math.random()*10+0);
	
	board[num_1_i][num_2_i] = 'I';
	
	board[num_1_s][num_2_s] = 'S';
	
	System.out.println ("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	boa.DisplayBoard(board);
	
	do
	{
	move = SavitchIn.readLineNonwhiteChar();	

	if(move == 'l')
	{
		board[num_1_i][num_2_i] = '-';
		if(board[num_1_i][num_2_i-1] == 'S')
		{
			Itchy_Win = true;	
		}
		num_2_i-=1;
		board[num_1_i][num_2_i] = 'I';
		boa.DisplayBoard(board);	
	}
	if(move == 'r')
	{
		board[num_1_i][num_2_i] = '-';
		if(board[num_1_i][num_2_i+1] == 'S')
		{
			Itchy_Win = true;	
		}
		num_2_i+=1;
		board[num_1_i][num_2_i+1] = 'I';
		boa.DisplayBoard(board);	
	}
	if(move == 'u')
	{
		board[num_1_i][num_2_i] = '-';
		if(board[num_1_i-1][num_2_i] == 'S')
		{
			Itchy_Win = true;	
		}
		num_1_i-=1;
		board[num_1_i][num_2_i] = 'I';
		boa.DisplayBoard(board);	
	}
	if(move == 'd')
	{
		board[num_1_i][num_2_i] = '-';
		if(board[num_1_i+1][num_2_i] == 'S')
		{
			Itchy_Win = true;	
		}
		num_1_i+=1;
		board[num_1_i][num_2_i] = 'I';
		boa.DisplayBoard(board);	
	}
	}while(Itchy_Win == false);
	System.out.println ("YOU WIN");
	System.out.println ("PLAY AGAIN? Y/N:");
	
	play_again = SavitchIn.readLineNonwhiteChar();
	
	}while(play_again == 'y'|| play_again == 'Y');
}
}