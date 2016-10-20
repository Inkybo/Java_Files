public class CardGame
{
	public static void main (String[] args) {
	
	String card = "";
	String suite = "";
	String hand = "";
	String hand_2 = "";
	String hand_reset = "";
	char play_again = ' ';
	int players = 0;
	int points = 0;
	int points_2 = 0;
	int point_comp = 0;
	int x = 0;
	boolean again = false;
	
	CardClass Game = new CardClass();
	
	System.out.println ("How many players?");
	
	players = SavitchIn.readLineInt();
	
	if (players == 1)
	{
		do
		{
			card = Game.number();
			suite = Game.suite();
			
			hand+= card;
			hand_2+= suite;
			
			
			System.out.println (+(x+1)+": Your hand is a "+hand+" of "+hand_2);
			
			x++;
			
			if (card == "3" || card == "5" || card == "7" || card == "9" || suite == "Hearts")
			{
				points = 0;
				System.out.println ("you lost all your points");
				System.out.println ("Current Score "+points);
			}
			if (card == "2" || card == "4" || card == "6" || card == "8" || card == "10")
			{
				points+= Integer.valueOf(card);
				System.out.println ("Current Score: "+points);
			}
			if (card == "king" || card == "Queen" || card == "Jack")
			{
				System.out.println ("you get 12 points");
				points+= 12;
				System.out.println ("Current Score: "+points);	
			}
			if (points >= 103)
			{
				break;
			}
			hand = hand_reset;
			hand_2 = hand_reset;
			
			card = Game.number();
			suite = Game.suite();
			
			System.out.println ("Draw another card?: Y/N");
			
			play_again = SavitchIn.readLineNonwhiteChar();
			
			if(play_again == 'y' || play_again == 'Y')
			{
				again = true;
			}
			if (play_again == 'n' || play_again == 'N')
			{
				again = false;
			}
		}while(again == true);
	
 //computer
		do
		{
			card = Game.number();
			suite = Game.suite();
			
			hand+= card;
			hand_2+= suite;
			
			
			System.out.println (+(x+1)+": Your hand is a "+hand+" of "+hand_2);
			
			x++;
			
			if (card == "3" || card == "5" || card == "7" || card == "9" || suite == "Hearts")
			{
				points = 0;
				System.out.println ("you lost all your points");
				System.out.println ("Current Score "+points);
			}
			if (card == "2" || card == "4" || card == "6" || card == "8" || card == "10")
			{
				points+= Integer.valueOf(card);
				System.out.println ("Current Score: "+points);
			}
			if (card == "king" || card == "Queen" || card == "Jack")
			{
				System.out.println ("you get 12 points");
				points+= 12;
				System.out.println ("Current Score: "+points);	
			}
			if (point_comp >= 103)
			{
				break;
			}
			hand = hand_reset;
			hand_2 = hand_reset;
			
			card = Game.number();
			suite = Game.suite();
		}while(point_comp < 103);
	}
	if(players == 2)
	{
		do
		{
			card = Game.number();
			suite = Game.suite();
			
			hand+= card;
			hand_2+= suite;
			
			
			System.out.println (+(x+1)+": Your hand is a "+hand+" of "+hand_2);
			
			x++;
			
			if (card == "3" || card == "5" || card == "7" || card == "9" || suite == "Hearts")
			{
				points = 0;
				System.out.println ("you lost all your points");
				System.out.println ("Current Score "+points);
			}
			if (card == "2" || card == "4" || card == "6" || card == "8" || card == "10")
			{
				points+= Integer.valueOf(card);
				System.out.println ("Current Score: "+points);
			}
			if (card == "king" || card == "Queen" || card == "Jack")
			{
				System.out.println ("you get 12 points");
				points+= 12;
				System.out.println ("Current Score: "+points);	
			}
			if (points >= 103)
			{
				break;
			}
			hand = hand_reset;
			hand_2 = hand_reset;
			
			card = Game.number();
			suite = Game.suite();
			
			System.out.println ("Draw another card?: Y/N");
			
			play_again = SavitchIn.readLineNonwhiteChar();
			
			if(play_again == 'y' || play_again == 'Y')
			{
				again = true;
			}
			if (play_again == 'n' || play_again == 'N')
			{
				again = false;
			}
		}while(again == true);
//player_2
		do
		{
			card = Game.number();
			suite = Game.suite();
			
			hand+= card;
			hand_2+= suite;
			
			
			System.out.println (+(x+1)+": Your hand is a "+hand+" of "+hand_2);
			
			x++;
			
			if (card == "3" || card == "5" || card == "7" || card == "9" || suite == "Hearts")
			{
				points_2 = 0;
				System.out.println ("you lost all your points");
				System.out.println ("Current Score "+points_2);
			}
			if (card == "2" || card == "4" || card == "6" || card == "8" || card == "10")
			{
				points_2+= Integer.valueOf(card);
				System.out.println ("Current Score: "+points_2);
			}
			if (card == "king" || card == "Queen" || card == "Jack")
			{
				System.out.println ("you get 12 points");
				points_2+= 12;
				System.out.println ("Current Score: "+points_2);	
			}
			if (points_2 >= 103)
			{
				break;
			}
			hand = hand_reset;
			hand_2 = hand_reset;
			
			card = Game.number();
			suite = Game.suite();
			
			System.out.println ("Draw another card?: Y/N");
			
			play_again = SavitchIn.readLineNonwhiteChar();
			
			if(play_again == 'y' || play_again == 'Y')
			{
				again = true;
			}
			if (play_again == 'n' || play_again == 'N')
			{
				again = false;
			}
		}while(again == true);
	}
	if (points >= 103)
	{
		System.out.println ("Player 1 wins");
	}
	if (point_comp >= 103)
	{
		System.out.println ("Computer wins");
	}
	if (points_2 >= 103)
	{
		System.out.println ("Player 2 wins");
	}
	
			

}
}