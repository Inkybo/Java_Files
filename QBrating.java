public class QBrating
{
	public static void main (String[] args) 
		throws InterruptedException {
        String importantInfo[] = {
            "Calculating QB rating       5%",
            "Calculating QB rating.      10%",
            "Calculating QB rating..     15%",
            "Calculating QB rating...    20%",
            "Calculating QB rating       25%",
            "Calculating QB rating.      30%",
            "Calculating QB rating..     35%",
            "Calculating QB rating...    40%",
            "Calculating QB rating       45%",
            "Calculating QB rating.      50%",
            "Calculating QB rating..     55%",
            "Calculating QB rating...    60%",
            "Calculating QB rating       65%",
            "Calculating QB rating.      70%",
            "Calculating QB rating..     75%",
            "Calculating QB rating...    80%",
            "Calculating QB rating       85%",
            "Calculating QB rating.      90%",
            "Calculating QB rating..     95%",
            "Calculating QB rating...    98%",
            "Calculating QB rating       98%",
            "Calculating QB rating.      98%",
            "Calculating QB rating..     98%",
            "Calculating QB rating...    98%",
            "Calculating QB rating       98%",
            "Calculating QB rating.      98%",
            "Calculating QB rating..     98%",
            "~FATAL_SYSTEM_ERROR~ \n ERROR_MEMORY_HARDWARE \n 799(0x30b)"
            
        };
	
	double a = 0.0;
	double b = 0.0;
	double c = 0.0;
	double d = 0.0;
	double Comp = 0.0;
	double Att = 0.0;
	double Yards = 0.0;
	double TDs = 0.0;
	double Int = 0.0;
	double QBrating = 0.0;
	int ano = 0;
	String name ="";
	
	do
	{
	if (ano >= 3)
	{
		System.out.println ("WHY?");
	}
	System.out.println ("Enter a NFL QB's stats:");
	
	System.out.println ("Enter ammount of Completions:");
	
	Comp = SavitchIn.readLineInt();
	
	System.out.println ("Enter ammount of attempts:");
	
	Att = SavitchIn.readLineInt();
	
	System.out.println ("Enter ammount of yards:");
	
	Yards = SavitchIn.readLineInt();
	
	System.out.println ("Enter ammount of Touchdowns:");
	
	TDs = SavitchIn.readLineInt();
	
	System.out.println ("Enter ammount of interceptions:");
	
	Int = SavitchIn.readLineInt();
	
	a = (((Comp/Att) * 100) -30) / 20;
	b = ((TDs/Att) * 100) / 5;
	c = (9.5 - ((Int/Att) * 100))/4;
	d = ((Yards/Att) - 3) / 4;
	
	if (a >2.375)
	{
		a = 2.375;
	}
	if (b >2.375)
	{
		b = 2.375;
	}
	if (c >2.375)
	{
		c = 2.375;
	}
	if (d >2.375)
	{
		d = 2.375;
	}
	
	if (a <0)
	{
		a = 0;
	}
	if (b <0)
	{
		b = 0;
	}
	if (c <0)
	{
		c = 0;
	}
	if (d <0)
	{
		d = 0;
	}
	
	QBrating = ((a+b+c+d)/.06);
	
	if (QBrating > 120 || QBrating < 20)
	{
		for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(1000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
        break;
	}
	System.out.println ("QB rating is: "+QBrating);
	
	System.out.println ("would you like to look up another?");
		
		name = SavitchIn.readLine();
	
	if (name.equalsIgnoreCase("YES"))
	{
		ano++;
	}
	}while (name.equalsIgnoreCase("YES"));
	 System.out.println ("The above is not a real windows error, but a clever joke");

	


}
}