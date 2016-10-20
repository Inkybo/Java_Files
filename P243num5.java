public class P243num5
{
	public static void main (String[] args) {
		
		char quit = ' ';
		boolean play_again = true;
		String roll_again = "";
		int dice_1 = 0;
		int dice_2 = 0;
		int player_score = 0;
		int num4 = 0;
		int comp_score = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;
		int num10 = 0;
		int num11 = 0;
		
		DieClass Pig = new DieClass();
		
		System.out.println ("Press 'R' to roll the dice:");
		SavitchIn.readLine();
		
		do
		{
			do
			{
				do
				{
					num11 = 0;
					dice_1 = Pig.getRoll(6);
					dice_2 = Pig.getRoll(6);
					num4 = dice_1 + dice_2;
					
					System.out.println("You rolled " + dice_1 + " and " + dice_2);
					
					if (dice_1 == 1 && dice_2 == 1)
					{
						player_score = 0;
						System.out.println("You lost all your points.");
						break;
					}
					else if (dice_1 == 1 || dice_2 == 1)
					{
						num4 = 0;
						System.out.println("You don't gain any points this round.");
						break;
					}
					else 
					{
						player_score = player_score + num4;
					}
					System.out.println("Your points: " + player_score + ". Would you like to contiue rolling?");
					roll_again = SavitchIn.readLine();
					
				}while (roll_again.equalsIgnoreCase("Yes") && player_score != 100);
					if (player_score >= 100)
					{
						break;
					}
				do
				{
					num6 = 0;
					
					num7 = (int) (Math.random()*6+1);
					num8 = (int) (Math.random()*6+1);
					num9 = num7 + num8;
					
					System.out.println("The computer rolled " + num7 + " and " + num8);
					System.out.println ("Computers points: "+num9);
					
					if (num7 == 1 && num8 == 1)
					{
						num10 = 0;
						System.out.println("The computer lost all its points.");
						num6 = 1;
					}
					else if (num7 == 1 || num8 == 1)
					{
						num9 = 0;
						System.out.println("The computer doesn't gain any points this round.");
						num6 = 1;
					}
					else 
					{
						num11 = num11 + num9;
						num10 = num10 + num9;
					}
					
					if (num11 >= 20)
					{
						num6 = 1;
					}
					
					
				}while (num6 != 0);
				if(comp_score >= 100 && player_score >= 100)
				{
					break;
				}
				
			}while (player_score + num4 <= 100 || comp_score <= 100);
			
			if (player_score >= 100)
			{
				System.out.println("You won!");
			}
			else if (comp_score >= 100)
			{
				System.out.println("You lost");
			}
			
			System.out.println("Play again?");
			
			quit = SavitchIn.readNonwhiteChar();
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