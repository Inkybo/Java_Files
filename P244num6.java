public class P244num6
{
	public static void main (String[] args) {
	
	String card = "";
	String suite = "";
	String hand = "";
	String hand_2 = "";
	String hand_reset = "";
	String suite_name = "";
	String faces = "";
	
	
	CardClass game = new CardClass();
	
	card = game.number();
	suite = game.suite();
	
	for(int x = 0; x < 20; x++)
	{
		
		hand+= card;
		hand_2+= suite;
		
		System.out.println (+(x+1)+": Your hand is a "+hand+" of "+hand_2);
	
		hand = hand_reset;
		hand_2 = hand_reset;
		
		card = game.number();
		suite = game.suite();
	}
}
}