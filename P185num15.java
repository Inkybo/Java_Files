public class P185num15
{
	public static void main (String[] args) {
	
		String word1 = "";
		String word2 = "";
		char quit = ' ';
		int you = 0;
		int opp = 0;
		int comp_1 = 0;
		int comp_2 = 0;
		int num2 = 0;
		int num3 = 0;
		int num_4 = 0;
		int players = 0;
		boolean play_again = true;
		
		System.out.println ("how many players(0,1,2)?");
		
		players = SavitchIn.readLineInt();
		
		if (players == 0)
			{
				while (num_4<20)
				{
					System.out.println("===================================================================");
	                System.out.println("          __      ||    ______    ||     \\/");
	                System.out.println("         /  \\     ||   | ~~~~ |   ||     /\\");
	                System.out.println("        /    \\    ||   | ~~~~ |   ||    //\\\\");
	                System.out.println("       /______\\   ||   |______|   ||   ( )( )");
	                System.out.println("");
	                System.out.println("        -ROCK-          -PAPER-       -SCISSORS-");
	                System.out.println("           1                2               3   ");
	                System.out.println("===================================================================");
	
					System.out.println("Rock, paper, or scissors? ");
					comp_1 = (int) (Math.random()*3+1);
					comp_1 = (int) (Math.random()*3+1);
					
					if (comp_1 == 1)
					{
						word1 = ("Rock");
					}
					else if (comp_1 == 2)
					{
						word1 = ("Paper");
					}
					else if (comp_1 == 3)
					{
						word1 = ("Scissors");
					}
					
					if (comp_2 == 1)
					{
						word2 = ("Rock");
					}
					else if (comp_2 == 2)
					{
						word2 = ("Paper");
					}
					else if (comp_2 == 3)
					{
						word2 = ("Scissors");
					}
				
					
					if (word1.equalsIgnoreCase("Rock") && comp_1 == 1)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 2)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 3)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Rock") && comp_1 == 2)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Rock") && comp_1 == 3)
					{
						System.out.println("You won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 1)
					{
						System.out.println("You won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 3)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 1)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 2)
					{
						System.out.println("You won. ");
						num2++;
					}
					
					System.out.println("Your wins: " + num2 + " Computer wins: " + num3 + "\n");
				
				num2 = 0;
				num3 = 0;
				num_4++;
			}
			System.out.println ();
			System.out.println ();
			System.out.println ();
			System.out.println ();
			System.out.println (" \t WINNER: NONE \n the only winning move is not to play.");
			System.out.println ();
			System.out.println ();
			System.out.println ();
			System.out.println ();
			}
		if (players == 1)
			{
				do
				{
					System.out.println("===================================================================");
	                System.out.println("          __      ||    ______    ||     \\/");
	                System.out.println("         /  \\     ||   | ~~~~ |   ||     /\\");
	                System.out.println("        /    \\    ||   | ~~~~ |   ||    //\\\\");
	                System.out.println("       /______\\   ||   |______|   ||   ( )( )");
	                System.out.println("");
	                System.out.println("        -ROCK-          -PAPER-       -SCISSORS-");
	                System.out.println("           1                2               3   ");
	                System.out.println("===================================================================");
	
					System.out.println("Rock, paper, or scissors? ");
					you = SavitchIn.readLineInt();
					
					if (you == 1)
					{
						word1 = ("Rock");
					}
					else if (you == 2)
					{
						word1 = ("Paper");
					}
					else if (you == 3)
					{
						word1 = ("Scissors");
					}
					
					comp_1 = (int) (Math.random()*3+1);
					
					if (comp_1 == 1)
					{
						word2 = ("Rock");
					}
					else if (comp_1 == 2)
					{
						word2 = ("Paper");
					}
					else if (comp_1 == 3)
					{
						word2 = ("Scissors");
					}
					
					System.out.println("You chose " + word1 + " and the computer chose " + word2);
					
					if (word1.equalsIgnoreCase("Rock") && comp_1 == 1)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 2)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 3)
					{
						System.out.println("You tied. ");
					}
					else if (word1.equalsIgnoreCase("Rock") && comp_1 == 2)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Rock") && comp_1 == 3)
					{
						System.out.println("You won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 1)
					{
						System.out.println("You won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && comp_1 == 3)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 1)
					{
						System.out.println("You lost. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && comp_1 == 2)
					{
						System.out.println("You won. ");
						num2++;
					}
					
					System.out.println("Your wins: " + num2 + " Computer wins: " + num3 + "\n");
				
				System.out.println("Play again? ");
				quit = SavitchIn.readNonwhiteChar();
				
				num2 = 0;
				num3 = 0;
				
				if (quit == 'Y' || quit =='y')
				{
					play_again = true;
				}
				if (quit == 'N' || quit == 'n')
				{
					play_again = false;
				}
				}while (play_again == true);
			}
		if (players == 2)
			{
				do
				{
					System.out.println("===================================================================");
	                System.out.println("          __      ||    ______    ||     \\/");
	                System.out.println("         /  \\     ||   | ~~~~ |   ||     /\\");
	                System.out.println("        /    \\    ||   | ~~~~ |   ||    //\\\\");
	                System.out.println("       /______\\   ||   |______|   ||   ( )( )");
	                System.out.println("");
	                System.out.println("        -ROCK-          -PAPER-       -SCISSORS-");
	                System.out.println("           1                2               3   ");
	                System.out.println("===================================================================");
					System.out.println ("Player 1");
					System.out.println("Rock, paper, or scissors? ");
					you = SavitchIn.readLineInt();
					
					if (you == 1)
					{
						word1 = ("Rock");
					}
					else if (you == 2)
					{
						word1 = ("Paper");
					}
					else if (you == 3)
					{
						word1 = ("Scissors");
					}
					
					System.out.println("===================================================================");
	                System.out.println("          __      ||    ______    ||     \\/");
	                System.out.println("         /  \\     ||   | ~~~~ |   ||     /\\");
	                System.out.println("        /    \\    ||   | ~~~~ |   ||    //\\\\");
	                System.out.println("       /______\\   ||   |______|   ||   ( )( )");
	                System.out.println("");
	                System.out.println("        -ROCK-          -PAPER-       -SCISSORS-");
	                System.out.println("           1                2               3   ");
	                System.out.println("===================================================================");
					System.out.println ("player 2");
					System.out.println("Rock, paper, or scissors? ");
					opp = SavitchIn.readLineInt();
					
					if (opp == 1)
					{
						word2 = ("Rock");
					}
					else if (opp == 2)
					{
						word2 = ("Paper");
					}
					else if (opp == 3)
					{
						word2 = ("Scissors");
					}
					
					System.out.println("Player 1 chose " + word1 + " and Player 2 chose " + word2);
					
					if (word1.equalsIgnoreCase("Rock") && opp == 1)
					{
						System.out.println("tied. ");
					}
					else if (word1.equalsIgnoreCase("Paper") && opp == 2)
					{
						System.out.println("tied. ");
					}
					else if (word1.equalsIgnoreCase("Scissors") && opp == 3)
					{
						System.out.println("tied. ");
					}
					else if (word1.equalsIgnoreCase("Rock") && opp == 2)
					{
						System.out.println("Player 2 won. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Rock") && opp == 3)
					{
						System.out.println("Player 1 won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && opp == 1)
					{
						System.out.println("Player 1 won. ");
						num2++;
					}
					else if (word1.equalsIgnoreCase("Paper") && opp == 3)
					{
						System.out.println("Player 2 won. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && opp == 1)
					{
						System.out.println("Player 2 won. ");
						num3++;
					}
					else if (word1.equalsIgnoreCase("Scissors") && opp == 2)
					{
						System.out.println("Player 1 won. ");
						num2++;
					}
					
					System.out.println("Player 1 won: " + num2 + " Player 1 won: " + num3 + "\n");
				
				System.out.println("Play again? ");
				quit = SavitchIn.readNonwhiteChar();
				
				num2 = 0;
				num3 = 0;
				
				if (quit == 'Y' || quit =='y')
				{
					play_again = true;
				}
				if (quit == 'N' || quit == 'n')
				{
					play_again = false;
				}
				}while (play_again == true);
			}
	}
}