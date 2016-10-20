public class DiceClient
{
	public static void main (String[] args) {
	
	int num_1 = 0, sides = 0;
	
	DieClass Dice = new DieClass();
	
	System.out.println ("how many sides?");
	
	num_1 = SavitchIn.readLineInt();
	
	sides = Dice.getRoll(num_1);
	
	System.out.println ("you rolled a "+sides);
	
	  

}
}