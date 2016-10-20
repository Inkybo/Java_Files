public class SleepMessages {
    public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
 
        double qat = 0.0;
	double dim = 0.0;
	double nik = 0.0;
	double pen = 0.0;
	double qat_sum = 0.0;
	double dim_sum = 0.0;
	double nik_sum = 0.0;
	double pen_sum = 0.0;
	double total = 0.0;
	
	System.out.println ("How many quarters?");
	
	qat = SavitchIn.readDouble();
	
	System.out.println ("How many dimes?");
	
	dim = SavitchIn.readDouble();
	
	System.out.println ("How many nickels?");
	
	nik = SavitchIn.readDouble();
	
	System.out.println ("How many pennies?");
	
	pen = SavitchIn.readDouble();
	
	qat_sum = qat*.25;
	dim_sum = dim*.10;
	nik_sum = nik*.05;
	pen_sum = pen*.01;
	
	
	total = qat_sum+dim_sum+nik_sum+pen_sum;
	
	
	
	System.out.println ("Jar contains: $"+total);
        
        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}
