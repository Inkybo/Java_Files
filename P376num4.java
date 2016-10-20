public class P376num4
{
	public static void main (String[] args) {
	
	int num = 0;
	int row_1_co = 0;
	int row_2_co = 0;
	int row_3_co = 0;
	int row_4_co = 0;
	int row_5_co = 0;
	int row_6_co = 0;
	int row_7_co = 0;
	int row_8_co = 0;
	int row_9_co = 0;
	int row_10_co = 0;
	String row_1 = "";
	String row_2 = "";
	String row_3 = "";
	String row_4 = "";
	String row_5 = "";
	String row_6 = "";
	String row_7 = "";
	String row_8 = "";
	String row_9 = "";
	String row_10 = "";
	
	System.out.println ("How many numbers will you enter:");
	num = SavitchIn.readLineInt();
	
	int[] num_list = new int[num];
	
	for (int x = 0; x < num_list.length; x++)
	{
		System.out.println ("Enter a number from 0 to 100");
		num_list[x] = SavitchIn.readLineInt();
	}
	
	int[] freq = new int[101];
	
	for(int x = 0; x < num_list.length; x++)
	{
		freq[ num_list[x] ]++;
		
		if ( num_list[x] >= 1 && num_list[x] <=10)
		{
			row_1_co++;
			if(row_1_co%5 == 0)
			{
				row_1+= "*";	
			}
		}
		if ( num_list[x] >= 11 && num_list[x] <=20)
		{
			row_2_co++;
			if(row_2_co%5 == 0)
			{
				row_2+= "*";	
			}	
		}
		if ( num_list[x] >= 21 && num_list[x] <=30)
		{
			row_3_co++;
			if(row_3_co%5 == 0)
			{
				row_3+= "*";	
			}	
		}
		if ( num_list[x] >= 31 && num_list[x] <=40)
		{
			row_4_co++;
			if(row_4_co%5 == 0)
			{
				row_4+= "*";	
			}		
		}
		if ( num_list[x] >= 41 && num_list[x] <=50)
		{
			row_5_co++;
			if(row_5_co%5 == 0)
			{
				row_5+= "*";	
			}	
		}
		if ( num_list[x] >= 51 && num_list[x] <=60)
		{
			row_6_co++;
			if(row_6_co%5 == 0)
			{
				row_6+= "*";	
			}	
		}
		if ( num_list[x] >= 61 && num_list[x] <=70)
		{
			row_7_co++;
			if(row_7_co%5 == 0)
			{
				row_7+= "*";	
			}	
		}
		if ( num_list[x] >= 71 && num_list[x] <=80)
		{
			row_8_co++;
			if(row_8_co%5 == 0)
			{
				row_8+= "*";	
			}	
		}
		if ( num_list[x] >= 81 && num_list[x] <=90)
		{
			row_9_co++;
			if(row_9_co%5 == 0)
			{
				row_9+= "*";	
			}	
		}
		if ( num_list[x] >= 91 && num_list[x] <=100)
		{
			row_10_co++;
			if(row_10_co%5 == 0)
			{
				row_10+= "*";	
			}	
		}			
	}
	
	System.out.println ((char)(233)+"================================"+(char)(233));
	System.out.println ("| 1-10   "+(char)(222)+" "+row_1);
	System.out.println ("| 11-20  "+(char)(222)+" "+row_2);
	System.out.println ("| 21-30  "+(char)(222)+" "+row_3);
	System.out.println ("| 31-40  "+(char)(222)+" "+row_4);
	System.out.println ("| 41-50  "+(char)(222)+" "+row_5);
	System.out.println ("| 51-60  "+(char)(222)+" "+row_6);
	System.out.println ("| 61-70  "+(char)(222)+" "+row_7);
	System.out.println ("| 71-80  "+(char)(222)+" "+row_8);
	System.out.println ("| 81-90  "+(char)(222)+" "+row_9);
	System.out.println ("| 91-100 "+(char)(222)+" "+row_10);
	System.out.println ((char)(233)+"================================"+(char)(233));
	
	
	
	
}
}