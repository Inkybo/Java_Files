public class CardClass
{
	private int hand_num = 0;
	private int hand_suite = 0;
	private String card_s = "";
	private String suite_name = "";
///////////////////////////////////////
	public String number ()
	{
		hand_num = ((int)(Math.random()*13+1));
		
		if (hand_num == 1)
		{
			card_s = Integer.toString(hand_num);
			card_s = "Ace";
		}
		if (hand_num == 2)
		{
			card_s = Integer.toString(hand_num);
			card_s = "2";
		}
		if (hand_num == 3)
		{
			card_s = Integer.toString(hand_num);
			card_s = "3";
		}
		if (hand_num == 4)
		{
			card_s = Integer.toString(hand_num);
			card_s = "4";
		}
		if (hand_num == 5)
		{
			card_s = Integer.toString(hand_num);
			card_s = "5";
		}
		if (hand_num == 6)
		{
			card_s = Integer.toString(hand_num);
			card_s = "6";
		}
		if (hand_num == 7)
		{
			card_s = Integer.toString(hand_num);
			card_s = "7";
		}
		if (hand_num == 8)
		{
			card_s = Integer.toString(hand_num);
			card_s = "8";
		}
		if (hand_num == 9)
		{
			card_s = Integer.toString(hand_num);
			card_s = "9";
		}
		if (hand_num == 10)
		{
			card_s = Integer.toString(hand_num);
			card_s = "10";
		}
		if (hand_num == 11)
		{
			card_s = Integer.toString(hand_num);
			card_s = "King";
		}
		if (hand_num == 12)
		{
			card_s = Integer.toString(hand_num);
			card_s = "Queen";
		}
		if (hand_num == 13)
		{
			card_s = Integer.toString(hand_num);
			card_s = "Jack";
		}
		
		return (card_s);
	}
///////////////////////////////////////
	public String suite ()
	{
		hand_suite = ((int)(Math.random()*4+1));
		
		if (hand_suite == 1)
		{
			suite_name = "Spades";
		}
		if (hand_suite == 2)
		{
			suite_name = "Diamonds";
		}
		if (hand_suite == 3)
		{
			suite_name = "Hearts";
		}
		if (hand_suite == 4)
		{
			suite_name = "Clubs";
		}
		
		return (suite_name);
	}
}