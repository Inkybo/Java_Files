public class MmmCelery
{
	public static void main (String[] args) {
	
	int num_ent = 0;
	int num_ent_num = 1;
	int entered_num = 0;
	int num_ent_con = 0;
	int odd = 0;
	int even = 0;
	int seven = 0;
	int add = 0;
	
	System.out.println ("How many numbers do you want to enter?");
	
	num_ent_con = SavitchIn.readLineInt();
	
	while (num_ent <= num_ent_con)
	{
		System.out.println ("enter number "+num_ent_num);
		num_ent++;
		
		entered_num = SavitchIn.readLineInt();
		add = add + entered_num;
		if (entered_num%1 ==0)
		{
			odd++;
		}
		if (entered_num%2 ==0)
		{
			even++;
		}
		if (entered_num >70 && entered_num%7 ==0)
		{
			seven++;
		}
		if (num_ent == num_ent_con)
		{
			break;
		}	
	}
	System.out.println ("The total was "+add);
	System.out.println ("ther were "+odd+" odd number(s)");
	System.out.println ("ther were "+even+" even number(s)");
	System.out.println ("ther were "+seven+" number(s) were both greater than 70 and divisible by 7");
	
	
	

}
}