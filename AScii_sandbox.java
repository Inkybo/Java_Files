public class AScii_sandbox
{
	public static void main (String[] args) {
	
	char x = ' ';
						
			int z = 0;
		
			
			x = 'A';
			z = 70;
			
			System.out.println("The letter A has this ascii value: " + (int)x);
			
			System.out.println("The number 70 is the ascii value of this letter: " + (char)(z));
			
			System.out.println ("smiley: " + (char)(13)+ "\n" + (char)(0x10000)+ "\n"+(char)(0x10FFFF) + "\n"+(char)(176) + "\n"+(char)(177) + "\n"+(char)(178) + "\n"+(char)(201) + "\n"+(char)(2554));
		
}
}