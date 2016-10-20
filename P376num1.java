public class P376num1
{
	public static void main (String[] args) {
	
	int num = 0;
	
	System.out.println ("How many number will you enter:");
	num = SavitchIn.readLineInt();
	
	int[] num_list = new int[num];
	
	for (int x = 0; x < num_list.length; x++)
	{
		System.out.println ("Enter a number from 0 to 50");
		num_list[x] = SavitchIn.readLineInt()+25;
	}
	
	int[] freq = new int[51];
	
	for(int x = 0; x < num_list.length; x++)
	{
		freq[ num_list[x] ]++;		
	}
	
	for (int x = 0; x < freq.length; x++)
	{
		System.out.println (x-25+" was entered "+freq[x]+ " time(s).");
	}
}
}