public class Connect3
{
	public static void main (String[] args) {
		
	boolean check = false;
	boolean P1_win = false;
	boolean P2_win = false;
	boolean play_again = false;
	String play = "";
	
	do
	{	
	char[][] board = new char[3][4];
	
	System.out.println ();
	System.out.println ((char)(233)+"============"+(char)(233));
	System.out.println ((char)(222)+"  "+(char)(1)+" == P1  "+(char)(222));
	System.out.println ((char)(222)+"  "+(char)(2)+" == P2  "+(char)(222));
	System.out.println ((char)(233)+"============"+(char)(233));
	System.out.println ();
	
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			board[c][r]='-';
		}
	}
	
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			System.out.print(board[c][r]);
		}
		System.out.println ();
	}
		
	int column = 0;
	
	do
	{
//PLAYER 1
	System.out.println ("PLAYER 1:");
	System.out.println ("Enter a column:");
	column = SavitchIn.readLineInt();
		  		
	do
	{
		while(column > 4)
		{
			System.out.println ("Not a vilid column, Try again:");
			column = SavitchIn.readLineInt();
		}
		if(board[2][column]==(char)(1) || board[2][column]==(char)(2))
		{
			if(board[1][column]==(char)(1) || board[1][column]==(char)(2))
			{
				if(board[0][column]==(char)(1) || board[0][column]==(char)(2))
				{
					System.out.println ("column is full, select a different column");
					column = SavitchIn.readLineInt();
				}
				else
				{
					board[0][column]=(char)(1);
					check = true;
				}
			}
			else
			{
				board[1][column]=(char)(1);
				check = true;
			}
		}
		else
		{
			board[2][column]=(char)(1);
			check = true;
		}
	}while(check == false);  
	
	System.out.println("\nHere is the new table:");
	
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			System.out.print(board[c][r]);
		}
		System.out.println ();
	}
//VERTICAL PLAYER 1
int a = 0;
	for(int w = 0; w <=3; w++)
	{
		if(board[2][w]==(char)(1))
		{
			a++;
			if(board[1][w]==(char)(1))
			{
				a++;
				if(board[0][w]==(char)(1))
				{
					a++;
				}
			}
		}
	}
	if(a == 0)
	{
		P1_win = true;
		break;
	}	
//HORIZONTAL PLAYER 1
	int y = 0;
	for(int w = 0; w <=2; w++)
	{
		if(board[w][0]==(char)(1))
		{
			y++;
			if(board[w][1]==(char)(1))
			{
				y++;
				if(board[w][2]==(char)(1))
				{
					y++;	
				}
			}
		}
	}
	if(y == 3)
	{
		P1_win = true;
		break;
	}
	int t = 0;
	for(int w = 0; w <=2; w++)
	{
		if(board[w][1]==(char)(1))
		{
			t++;
			if(board[w][2]==(char)(1))
			{
				t++;
				if(board[w][3]==(char)(1))
				{
					t++;	
				}
			}
		}
	}
	if(t == 3)
	{
		System.out.println ("PLAYER 1 WINS");
		P1_win = true;
		break;
	}
//DIAGONAL DOWN FROM LEFT PLAYER 1
	int z = 0;
	for(int x = 0; x <= 2; x++)
	{
		if(board[x][x]==(char)(1))
		{
			z++;			
		}
	}
	if(z == 3)
	{
		P1_win = true;
		break;	
	}
	else
	{
		for(int x = 0; x <= 2; x++)
		{
			if(board[x][x+1]==(char)(1))
			{
				z++;			
			}
		}
		if(z == 3)
		{
			P1_win = true;
			break;	
		}	
	}
//DIAGONAL DOWN FROM RIGHT PLAYER 1
	int x = 0;
	if(board[0][3]==(char)(1))
	{
		x++;
		
		if(board[1][2]==(char)(1))
		{
			x++;
			
			if(board[2][1]==(char)(1))
			{
				x++;
			}	
		}	
	}
	else
	{
		if(board[0][2]==(char)(1))
		{
			x++;
		
			if(board[1][1]==(char)(1))
			{
				x++;
				
				if(board[2][0]==(char)(1))
				{
					x++;
				}	
			}	
		}		
	}
	if(x == 3)
	{
		P1_win = true;
		break;
	}
//PLAYER 2
	System.out.println ("PLAYER 2:");
	System.out.println ("Enter a column:");
	column = SavitchIn.readLineInt();

	do
	{
		while(column > 4)
		{
			System.out.println ("Not a vilid column, Try again:");
			column = SavitchIn.readLineInt();
		}
		if(board[2][column]==(char)(1) || board[2][column]==(char)(2))
		{
			if(board[1][column]==(char)(1) || board[1][column]==(char)(2))
			{
				if(board[0][column]==(char)(1) || board[0][column]==(char)(2))
				{
					System.out.println ("column is full, select a different column");
					column = SavitchIn.readLineInt();
				}
				else
				{
					board[0][column]=(char)(2);
					check = true;
				}
			}
			else
			{
				board[1][column]=(char)(2);
				check = true;
			}
		}
		else
		{
			board[2][column]=(char)(2);
			check = true;
		}
	}while(check = false); 	      
	
	System.out.println("\nHere is the new table:");
	
	for(int c = 0; c < board.length; c++)
	{
		for(int r = 0; r < board[c].length; r++)
		{
			System.out.print(board[c][r]);
		}
		System.out.println ();
	}
//VERTICAL PLAYER 1
int b = 0;
	for(int w = 0; w <=3; w++)
	{
		if(board[2][w]==(char)(2))
		{
			b++;
			if(board[1][w]==(char)(2))
			{
				b++;
				if(board[0][w]==(char)(2))
				{
					b++;
				}
			}
		}
	}
	if(b == 0)
	{
		P2_win = true;
		break;
	}	
//HORIZONTAL PLAYER 1
	int c = 0;
	for(int w = 0; w <=2; w++)
	{
		if(board[w][0]==(char)(2))
		{
			c++;
			if(board[w][1]==(char)(2))
			{
				c++;
				if(board[w][2]==(char)(2))
				{
					c++;	
				}
			}
		}
	}
	if(c == 3)
	{
		P2_win = true;
		break;
	}
	int d = 0;
	for(int w = 0; w <=2; w++)
	{
		if(board[w][1]==(char)(2))
		{
			d++;
			if(board[w][2]==(char)(2))
			{
				d++;
				if(board[w][3]==(char)(2))
				{
					d++;	
				}
			}
		}
	}
	if(d == 3)
	{
		P2_win = true;
		break;
	}
//DIAGONAL DOWN FROM LEFT PLAYER 2
	int e = 0;
	for(int g = 0; g <= 2; g++)
	{
		if(board[g][g]==(char)(2))
		{
			e++;			
		}
	}
	if(e == 3)
	{
		P2_win = true;
		break;	
	}
	else
	{
		for(int g = 0; g <= 2; g++)
		{
			if(board[x][x+1]==(char)(2))
			{
				e++;			
			}
		}
		if(e == 3)
		{
			P2_win = true;
			break;	
		}	
	}
//DIAGONAL DOWN FROM RIGHT PLAYER 2
	int f = 0;
	if(board[0][3]==(char)(2))
	{
		f++;
		
		if(board[1][2]==(char)(2))
		{
			f++;
			
			if(board[2][1]==(char)(2))
			{
				f++;
			}	
		}	
	}
	else
	{
		if(board[0][2]==(char)(2))
		{
			f++;
		
			if(board[1][1]==(char)(2))
			{
				f++;
				
				if(board[2][0]==(char)(2))
				{
					f++;
				}	
			}	
		}		
	}
	if(f == 3)
	{
		P2_win = true;
		break;
	}
	
	}while(P1_win == false || P2_win == false);
	
	if(P1_win == true)
	{
		System.out.println ("Player 1 wins");
	}
	if(P2_win == true)
	{
		System.out.println ("Player 2 wins");
	}
	System.out.println ("Play again?");
	play = SavitchIn.readLine();
	if(play = "yes")
	{
		play_again = true;
	}
	}while(play_again == true);
}
}
	
	//for(int c = 0; c < 3; c++)
	//{
	//	for(int z = 0; z < 3; z++)
	//	{
	//		if(board[z+c][z]==(char)(2))
	//		{
	//			z++;
	//		}
	//		else
	//		{
	//			
	//			break;
	//		}
	//	}
	//}
		
	//for(int c = 0; c < 3; c++)
	//{
	//	for(int z = 0; z < 3; z++)
	//	{
	//		if(board[z+c][z]==(char)(1))
	//		{
	//			z++;
	//		}
	//		else
	//		{
	//			break;
	//		}
	//	}
	//}