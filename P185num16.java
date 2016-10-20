public class P185num16
{
	public static void main (String[] args) {
		
		boolean play_again = true;
		char quit = ' ';
		int bet = 0;
		int num1 = 500;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
				do
				{
						
				for (num5 = num5; num5 < 3; num5++)
				{
					System.out.println ("how much do you want to bet:");
						bet = SavitchIn.readLineInt();
					while (bet<= num1)
					{
						System.out.println("Press the l key to pull the lever ");
						SavitchIn.readLine();
						
						num2 = (int) (Math.random()*9+1);
						num3 = (int) (Math.random()*9+1);
						num4 = (int) (Math.random()*9+1);
						System.out.println(num2 + " " + num3 + " " + num4);
						
						if (num2 == num3 || num2 == num4 || num3 == num4)
						{
							System.out.println("Two numbers match\n your bet has doubled ");
							num1 = num1 + (2*bet);
							System.out.println ("you total is $"+num1);
						}
						else if (num2 == num3 && num3 == num4 && num2 == num4)
						{
							System.out.println("All three numbers match\n you bet has quintupled ");
							num1 = num1 + (5*bet) ;
							System.out.println ("you total is $"+num1);
						}
						else
						{
							System.out.println("None match\n your bet has been lost ");
							num1 = num1- bet;
							System.out.println ("you total is $"+num1);
						}
					}
					System.out.println ("bet too high, try agian");
				}
				
				System.out.println("Would you like to play again? ");
				quit = SavitchIn.readNonwhiteChar();
				
				num1 = num1 + 10;
				num5 = 0;
				
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