public class Battleship
{
	public static void main (String[] args) {
		
		char column = ' ';
		int col_num = 0;
		int row = 0;
		int cruiser_P1 = 0;
		int destroyer_P1 = 0;
		int battleship_P1 = 0;
		int cruiser_P2 = 0;
		int destroyer_P2 = 0;
		int battleship_P2 = 0;
		boolean P1_sink_all = false;
		boolean P2_sink_all = false;
		boolean cruiser_sink_P1 = false;
		boolean destroyer_sink_P1 = false;
		boolean battleship_sink_P1 = false;
		boolean cruiser_sink_P2 = false;
		boolean destroyer_sink_P2 = false;
		boolean battleship_sink_P2 = false;
		String direction = "";
	
	char[][] P1_ship = new char[10][10];
	char[][] P1_tor = new char[10][10];
	char[][] P2_ship = new char[10][10];
	char[][] P2_tor = new char[10][10];
	
	System.out.println (""+(char)(233)+"==============="+(char)(233));
	System.out.println ((char)(222)+"              "+(char)(222));
	System.out.println ((char)(222)+" -BATTLESHIP- "+(char)(222));
	System.out.println ((char)(222)+"              "+(char)(222));
	System.out.println (""+(char)(233)+"==============="+(char)(233));
	System.out.println ("\n");
	
	System.out.println ("PLAYER 1 START");

	for(int c = 0; c < P1_ship.length; c++)
	{
		for(int r = 0; r < P1_ship[c].length; r++)
		{
			P1_ship[c][r]='-';
		}
	}	
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P1_ship.length; c++)
	{
		for(int r = 0; r < P1_ship[c].length; r++)
		{
			System.out.print(P1_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 1 START////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//PLAYER 1 PLACE CRUISER////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println ("PLAYER 1: Place cruiser:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P1_ship[row][col_num]!='-' || P1_ship[row-1][col_num]!='-'|| P1_ship[row-2][col_num]!='-'|| P1_ship[row-3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row-x][col_num] = 'C';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P1_ship[row][col_num]!='-' || P1_ship[row+1][col_num]!='-'|| P1_ship[row+2][col_num]!='-'|| P1_ship[row+3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+4 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row+x][col_num] = 'C';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num-1]!='-'|| P1_ship[row][col_num-2]!='-'|| P1_ship[row][col_num-3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row][col_num-x] = 'C';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num+1]!='-'|| P1_ship[row][col_num+2]!='-'|| P1_ship[row][col_num+3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row][col_num+x] = 'C';
			}	
		}
		
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P1_ship.length; c++)
	{
		for(int r = 0; r < P1_ship[c].length; r++)
		{
			System.out.print(P1_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 1 PLACE DESTROYER////////////////////////
	System.out.println ("PLAYER 1: Place destroyer:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P1_ship[row][col_num]!='-' || P1_ship[row-1][col_num]!='-'|| P1_ship[row-2][col_num]!='-'|| P1_ship[row-3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row-x][col_num] = 'D';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P1_ship[row][col_num]!='-' || P1_ship[row+1][col_num]!='-'|| P1_ship[row+2][col_num]!='-'|| P1_ship[row+3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+4 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row+x][col_num] = 'D';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num-1]!='-'|| P1_ship[row][col_num-2]!='-'|| P1_ship[row][col_num-3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row][col_num-x] = 'D';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num+1]!='-'|| P1_ship[row][col_num+2]!='-'|| P1_ship[row][col_num+3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P1_ship[row][col_num+x] = 'D';
			}	
		}
		
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P1_ship.length; c++)
	{
		for(int r = 0; r < P1_ship[c].length; r++)
		{
			System.out.print(P1_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 1 PLACE BATTLESHIP////////////////////////
	System.out.println ("PLAYER 1: Place battleship:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P1_ship[row][col_num]!='-' || P1_ship[row-1][col_num]!='-'|| P1_ship[row-2][col_num]!='-'|| P1_ship[row-3][col_num]!='-'|| P1_ship[row-4][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P1_ship[row-x][col_num] = 'B';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P1_ship[row][col_num]!='-' || P1_ship[row+1][col_num]!='-'|| P1_ship[row+2][col_num]!='-'|| P1_ship[row+3][col_num]!='-'|| P1_ship[row+4][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+5 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P1_ship[row+x][col_num] = 'B';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num-1]!='-'|| P1_ship[row][col_num-2]!='-'|| P1_ship[row][col_num-3]!='-'|| P1_ship[row][col_num-4]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P1_ship[row][col_num-x] = 'B';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P1_ship[row][col_num]!='-' || P1_ship[row][col_num+1]!='-'|| P1_ship[row][col_num+2]!='-'|| P1_ship[row][col_num+3]!='-'|| P1_ship[row][col_num+4]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P1_ship[row][col_num+x] = 'B';
			}	
		}
		System.out.println ("\n");
	
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P1_ship.length; c++)
	{
		for(int r = 0; r < P1_ship[c].length; r++)
		{
			System.out.print(P1_ship[c][r]);
		}
		System.out.println (c);
	}
	for(int c = 0; c < P2_ship.length; c++)
	{
		for(int r = 0; r < P2_ship[c].length; r++)
		{
			P2_ship[c][r]='-';
		}
	}
//PLAYER 2 START////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println ("\n");
	
	System.out.println ("PLAYER 2 START");
	System.out.println ();
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P2_ship.length; c++)
	{
		for(int r = 0; r < P2_ship[c].length; r++)
		{
			System.out.print(P2_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 2 PLACE CRUISER////////////////////////////
	System.out.println ("PLAYER 2: Place cruiser:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P2_ship[row][col_num]!='-' || P2_ship[row-1][col_num]!='-'|| P2_ship[row-2][col_num]!='-'|| P2_ship[row-3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row-x][col_num] = 'C';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P2_ship[row][col_num]!='-' || P2_ship[row+1][col_num]!='-'|| P2_ship[row+2][col_num]!='-'|| P2_ship[row+3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+4 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row+x][col_num] = 'C';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num-1]!='-'|| P2_ship[row][col_num-2]!='-'|| P2_ship[row][col_num-3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row][col_num-x] = 'C';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num+1]!='-'|| P2_ship[row][col_num+2]!='-'|| P2_ship[row][col_num+3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row][col_num+x] = 'C';
			}	
		}
		
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P2_ship.length; c++)
	{
		for(int r = 0; r < P2_ship[c].length; r++)
		{
			System.out.print(P2_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 2 PLACE DESTROYER////////////////////////
	System.out.println ("PLAYER 2: Place destroyer:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P2_ship[row][col_num]!='-' || P2_ship[row-1][col_num]!='-'|| P2_ship[row-2][col_num]!='-'|| P2_ship[row-3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row-x][col_num] = 'D';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P2_ship[row][col_num]!='-' || P2_ship[row+1][col_num]!='-'|| P2_ship[row+2][col_num]!='-'|| P2_ship[row+3][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+4 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row+x][col_num] = 'D';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num-1]!='-'|| P2_ship[row][col_num-2]!='-'|| P2_ship[row][col_num-3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row][col_num-x] = 'D';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num+1]!='-'|| P2_ship[row][col_num+2]!='-'|| P2_ship[row][col_num+3]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+4 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 4; x++)
			{		
				P2_ship[row][col_num+x] = 'D';
			}	
		}
		
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P2_ship.length; c++)
	{
		for(int r = 0; r < P2_ship[c].length; r++)
		{
			System.out.print(P2_ship[c][r]);
		}
		System.out.println (c);
	}
	System.out.println ();
//PLAYER 2 PLACE BATTLESHIP////////////////////////
	System.out.println ("PLAYER 2: Place battleship:");
	System.out.println ("column:");
	column = SavitchIn.readLineNonwhiteChar();
	System.out.println ("number:");
	row = SavitchIn.readLineInt();
	System.out.println ("Direction:");
	direction = SavitchIn.readLine();
	
	col_num = ((int)column-65);

	while(((col_num < 0 || col_num > 10)||(row < 0 || row > 10))||(!(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right"))))
	{
		System.out.println ("INVALID LOCATION: Try Again");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		System.out.println ("Direction:");
		direction = SavitchIn.readLine();	
	}

		//row-=1;
//  UP  //
		if(direction.equals("up"))
		{
//ERROR CHECK FOR SHIP UP
		while(P2_ship[row][col_num]!='-' || P2_ship[row-1][col_num]!='-'|| P2_ship[row-2][col_num]!='-'|| P2_ship[row-3][col_num]!='-'|| P2_ship[row-4][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS	
			if(row-5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P2_ship[row-x][col_num] = 'B';
			}	
		}
// DOWN //
		if(direction.equals("down"))
		{
//ERROR CHECK FOR SHIP DOWN
		while(P2_ship[row][col_num]!='-' || P2_ship[row+1][col_num]!='-'|| P2_ship[row+2][col_num]!='-'|| P2_ship[row+3][col_num]!='-'|| P2_ship[row+4][col_num]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(row+5 > 10)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P2_ship[row+x][col_num] = 'B';
			}
		}
// LEFT //
		if(direction.equals("left"))
		{
//ERROR CHECK FOR SHIP LEFT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num-1]!='-'|| P2_ship[row][col_num-2]!='-'|| P2_ship[row][col_num-3]!='-'|| P2_ship[row][col_num-4]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num-5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P2_ship[row][col_num-x] = 'B';
			}	
		}
// RIGHT// 
		if(direction.equals("right"))
		{
//ERROR CHECK FOR SHIP RIGHT
		while(P2_ship[row][col_num]!='-' || P2_ship[row][col_num+1]!='-'|| P2_ship[row][col_num+2]!='-'|| P2_ship[row][col_num+3]!='-'|| P2_ship[row][col_num+4]!='-')
		{
				System.out.println ("Ship in way, Try again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();	
			}
//ERROR CHECK OUT OF BOUNDS
			if(col_num+5 < 0)
			{
				System.out.println ("INVALID LOCATION: Try Again");
				System.out.println ("column:");
				column = SavitchIn.readLineNonwhiteChar();
				System.out.println ("number:");
				row = SavitchIn.readLineInt();
				System.out.println ("Direction:");
				direction = SavitchIn.readLine();
				//row-=1;	
			}
			for(int x = 0; x < 5; x++)
			{		
				P2_ship[row][col_num+x] = 'B';
			}	
		}
		
	System.out.println ("ABCDEFGHIJ");
	for(int c = 0; c < P2_ship.length; c++)
	{
		for(int r = 0; r < P2_ship[c].length; r++)
		{
			System.out.print(P2_ship[c][r]);
		}
		System.out.println (c);
	}
//PLAYER 1 BEGIN TORPEDO/ PLAYER 1 TURN ///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//P1 TORPEDO BOARD//////////	
		for(int c = 0; c < P1_tor.length; c++)
		{
			for(int r = 0; r < P1_tor[c].length; r++)
			{
				P1_tor[c][r]='-';
			}
		}
//P2 TORPEDO BOARD/////////
		for(int c = 0; c < P2_tor.length; c++)
		{
			for(int r = 0; r < P2_tor[c].length; r++)
			{
				P2_tor[c][r]='-';
			}
		}
	do
	{
		System.out.println ("\n");
		System.out.println ("PLAYER 1 TORPEDOS:");
		System.out.println ();	
		System.out.println ("ABCDEFGHIJ");
		for(int c = 0; c < P1_tor.length; c++)
		{
			for(int r = 0; r < P1_tor[c].length; r++)
			{
				System.out.print(P1_tor[c][r]);
			}
			System.out.println (c);
		}
//P1 SHIP BOARD////////////
		System.out.println ();
		System.out.println ("PLAYER 1 SHIPS:");
		System.out.println ();
		System.out.println ("ABCDEFGHIJ");
		for(int c = 0; c < P1_ship.length; c++)
		{
			for(int r = 0; r < P1_ship[c].length; r++)
			{
				System.out.print(P1_ship[c][r]);
			}
			System.out.println (c);
		}
		
		System.out.println ();
		System.out.println ("Where will you fire?");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		
		col_num = ((int)column-65);
		
		while((col_num < 0 || col_num > 10)||(row < 0 || row > 10))
		{
			System.out.println ("INVALID LOCATION: Try Again");
			System.out.println ("column:");
			column = SavitchIn.readLineNonwhiteChar();
			System.out.println ("number:");
			row = SavitchIn.readLineInt();	
		}
//PLAYER 1 ERROR CHECK TORPEDO LOCATIONS///////////////////////////
		while(P2_ship[row][col_num]== 'O'|| P2_ship[row][col_num]== 'X')
		{
			System.out.println ("Torpedo already sent, try again");
			System.out.println ("Where will you fire?");
			System.out.println ("column:");
			column = SavitchIn.readLineNonwhiteChar();
			System.out.println ("number:");
			row = SavitchIn.readLineInt();	
		}
//CHECK IF TORPEDO HIT/MISS////////////////////////////////
		System.out.println ();
		
		if(P2_ship[row][col_num]!= '-')
		{
			System.out.println ("HIT");
			
			P1_tor[row][col_num] = 'X';
			
			if(P2_ship[row][col_num]== 'C')
			{
				cruiser_P1++;	
			}
			if(P2_ship[row][col_num]== 'D')
			{
				destroyer_P1++;	
			}
			if(P2_ship[row][col_num]== 'B')
			{
				battleship_P1++;	
			}
			
			P2_ship[row][col_num] = 'X';
					
		}
		if(P2_ship[row][col_num]== '-')
		{
			System.out.println ("MISS");
			
			P1_tor[row][col_num] = 'O';
			
			P2_ship[row][col_num] = 'O';	
		}
//PLAYER 1 SINK SHIP///////////////////////////////////////////////
		if(cruiser_P1 == 4)
		{
			System.out.println ("you sunk PLAYER 2's cruiser");
			cruiser_sink_P1 = true;
		}
		if(destroyer_P1 == 4)
		{
			System.out.println ("you sunk PLAYER 2's destroyer");
			destroyer_sink_P1 = true;
		}
		if(battleship_P1 == 5)
		{
			System.out.println ("you sunk PLAYER 2's battleship");
			battleship_sink_P1 = true;
		}
		if(cruiser_sink_P1 == true && destroyer_sink_P1 == true && battleship_sink_P1 == true)
		{
			P1_sink_all = true;
			break;
		}
		
//PLAYER 2 BEGIN TORPEDO/ PLAYER 2 TURN ///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println ("\n");
		System.out.println ("PLAYER 2 TORPEDOS:");
		System.out.println ();	
		System.out.println ("ABCDEFGHIJ");
		for(int c = 0; c < P2_tor.length; c++)
		{
			for(int r = 0; r < P2_tor[c].length; r++)
			{
				System.out.print(P2_tor[c][r]);
			}
			System.out.println (c);
		}
//P2 SHIP BOARD////////////
		System.out.println ();
		System.out.println ("PLAYER 2 SHIPS:");
		System.out.println ();
		System.out.println ("ABCDEFGHIJ");
		for(int c = 0; c < P2_ship.length; c++)
		{
			for(int r = 0; r < P2_ship[c].length; r++)
			{
				System.out.print(P2_ship[c][r]);
			}
			System.out.println (c);
		}
		
		System.out.println ();
		System.out.println ("Where will you fire?");
		System.out.println ("column:");
		column = SavitchIn.readLineNonwhiteChar();
		System.out.println ("number:");
		row = SavitchIn.readLineInt();
		
		col_num = ((int)column-65);
		
		while((col_num < 0 || col_num > 10)||(row < 0 || row > 10))
		{
			System.out.println ("INVALID LOCATION: Try Again");
			System.out.println ("column:");
			column = SavitchIn.readLineNonwhiteChar();
			System.out.println ("number:");
			row = SavitchIn.readLineInt();	
		}
//PLAYER 2 ERROR CHECK TORPEDO LOCATIONS///////////////////////////
		while(P1_ship[row][col_num]== 'O'|| P1_ship[row][col_num]== 'X')
		{
			System.out.println ("Torpedo already sent, try again");
			System.out.println ("Where will you fire?");
			System.out.println ("column:");
			column = SavitchIn.readLineNonwhiteChar();
			System.out.println ("number:");
			row = SavitchIn.readLineInt();	
		}
//CHECK IF TORPEDO HIT/MISS////////////////////////////////
		System.out.println ();
		
		if(P1_ship[row][col_num]!= '-')
		{
			System.out.println ("HIT");
			
			P2_tor[row][col_num] = 'X';
			
			if(P1_ship[row][col_num]== 'C')
			{
				cruiser_P2++;	
			}
			if(P1_ship[row][col_num]== 'D')
			{
				destroyer_P2++;	
			}
			if(P1_ship[row][col_num]== 'B')
			{
				battleship_P2++;	
			}
			
			P1_ship[row][col_num] = 'X';
					
		}
		if(P1_ship[row][col_num]== '-')
		{
			System.out.println ("MISS");
			
			P2_tor[row][col_num] = 'O';
			
			P1_ship[row][col_num] = 'O';	
		}
//PLAYER 2 SINK SHIP///////////////////////////////////////////////
		if(cruiser_P2 == 4)
		{
			System.out.println ("you sunk PLAYER 1's cruiser");
			cruiser_sink_P2 = true;
		}
		if(destroyer_P2 == 4)
		{
			System.out.println ("you sunk PLAYER 1's destroyer");
			destroyer_sink_P2 = true;
		}
		if(battleship_P2 == 5)
		{
			System.out.println ("you sunk PLAYER 1's battleship");
			battleship_sink_P2 = true;
		}
		if(cruiser_sink_P2 == true && destroyer_sink_P2 == true && battleship_sink_P2 == true)
		{
			P2_sink_all = true;
			break;
		}

	
	}while(P1_sink_all == false || P2_sink_all== false);	
	
	if(P1_sink_all== true)
	{
		System.out.println (""+(char)(233)+"=================="+(char)(233));
		System.out.println ((char)(222)+"                 "+(char)(222));
		System.out.println ((char)(222)+" -PLAYER 1 WINS- "+(char)(222));
		System.out.println ((char)(222)+"                 "+(char)(222));
		System.out.println (""+(char)(233)+"=================="+(char)(233));
	}
	if(P2_sink_all== true)
	{
		System.out.println (""+(char)(233)+"=================="+(char)(233));
		System.out.println ((char)(222)+"                 "+(char)(222));
		System.out.println ((char)(222)+" -PLAYER 2 WINS- "+(char)(222));
		System.out.println ((char)(222)+"                 "+(char)(222));
		System.out.println (""+(char)(233)+"=================="+(char)(233));
	}
}
}