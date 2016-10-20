public class BinaryConverter
{
	public static void main (String[] args) {
	
	int dec = 0;
	int con_cho = 0;
	int binary = 0;
	int decimal = 0;
	int bit_8 = 0;
	int bit_7 = 0;
	int bit_6 = 0;
	int bit_5 = 0;
	int bit_4 = 0;
	int bit_3 = 0;
	int bit_2 = 0;
	int bit_1 = 0;
	int bit2 = 0;
	String bit = "";
	String dec_2 = "";
	char quit = ' ';
	boolean again = true;
	
	System.out.println ("how do you want to convert?:");
	System.out.println ();
	System.out.println ("for: Binary to decimal: Press '1'");
	System.out.println ("for: Decimal to Binary: Press '2'");
	
	con_cho = SavitchIn.readLineInt();
	
	if (con_cho == 1)
	{
	do
	{
		
		System.out.println ("Enter a 8-Bit number:");
		bit = SavitchIn.readLine()
	//128
		if (bit.charAt(0) == ('1'))
		{
			dec+=128;
		}
		else
		{
			dec+=0;
		}
	//64
		if (bit.charAt(1) == ('1'))
		{
			dec+=64;
		}
		else
		{
			dec+=0;
		}	
	//32
		if (bit.charAt(2) == ('1'))
		{
			dec+=32;
		}
		else
		{
			dec+=0;
		}
	//16
		if (bit.charAt(3) == ('1'))
		{
			dec+=16;
		}
		else
		{
			dec+=0;
		}
	//8
		if (bit.charAt(4) == ('1'))
		{
			dec+=8;
		}
		else
		{
			dec+=0;
		}
	//4
		if (bit.charAt(5) == ('1'))
		{
			dec+=4;
		}
		else
		{
			dec+=0;
		}
	//2
		if (bit.charAt(6) == ('1'))
		{
			dec+=2;
		}
		else
		{
			dec+=0;
		}
	//1
		if (bit.charAt(7) == ('1'))
		{
			dec+=1;
		}
		else
		{
			dec+=0;
		}	
		System.out.println ();
		System.out.println ("Binary: " +bit);
		System.out.println ("Decimal: "+dec);
		System.out.println ();
		dec = 0;
		bit = "";
		binary++;
		System.out.println ("Binaries converted:"+binary);
		System.out.println ("Decimals converted:"+decimal);
		System.out.println("Convert another Binary?");
		quit = SavitchIn.readNonwhiteChar();
		if (quit == 'Y' || quit =='y')
			{
				again = true;
			}
			if (quit == 'N' || quit == 'n')
			{
				again = false;
			}
	}while (again == true);
	System.out.println ("how do you want to convert?:");
	System.out.println ();
	System.out.println ("for: Binary to decimal: Press '1'");
	System.out.println ("for: Decimal to Binary: Press '2'");
	con_cho = SavitchIn.readLineInt();
	}
	
	if (con_cho == 2)
	{
	do
	{
		System.out.println ("Enter a number less than or equal to 255");
			
			dec = SavitchIn.readLineInt();
			
			while (dec > 255)
			{
				System.out.println ("Try Again");
				dec = SavitchIn.readLineInt();	
			}
		if (dec > 128 && dec-128 >= 0)
		{
			bit_8 = 1;
		}
		else
		{
			bit_8 =0;
		}
		if (dec > 64 && dec-64 >= 0)
		{
			bit_7 = 1;
		}
		else
		{
			bit_7 =0;
		}
		if (dec > 32 && dec-32 >= 0)
		{
			bit_6 = 1;
		}
		else
		{
			bit_6 =0;
		}
		if (dec > 16 && dec-16 >= 0)
		{
			bit_5 = 1;
		}
		else
		{
			bit_5 =0;
		}
		if (dec > 8 && dec-8 >= 0)
		{
			bit_4 = 1;
		}
		else
		{
			bit_4 =0;
		}
		if (dec > 4 && dec-4 >= 0)
		{
			bit_3 = 1;
		}
		else
		{
			bit_3 =0;
		}
		if (dec > 2 && dec-2 >= 0)
		{
			bit_2 = 1;
		}
		else
		{
			bit_2 =0;
		}
		if (dec > 1 && dec-1 >= 0)
		{
			bit_1 = 1;
		}
		else
		{
			bit_1 =0;
		}
		System.out.println ("Decimal: " +dec);
		System.out.println ("Binary: "+bit_8+""+bit_7+""+bit_6+""+bit_5+" "+bit_4+""+bit_3+""+bit_2+""+bit_1);	
		System.out.println ();
		dec = 0;
		bit = "";
		decimal++;
		System.out.println ("Binaries converted:"+binary);
		System.out.println ("Decimals converted:"+decimal);
		System.out.println("Convert another decimal?");
			quit = SavitchIn.readNonwhiteChar();
		if (quit == 'Y' || quit =='y')
			{
				again = true;
			}
			if (quit == 'N' || quit == 'n')
			{
				again = false;
			}
	}while (again == true);
	System.out.println ("how do you want to convert?:");
	System.out.println ();
	System.out.println ("for: Binary to decimal: Press '1'");
	System.out.println ("for: Decimal to Binary: Press '2'");
	}
	con_cho = SavitchIn.readLineInt();
	
}
}