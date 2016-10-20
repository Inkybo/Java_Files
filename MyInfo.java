public class MyInfo

{
	public static void main (String[] args) {
		
	//Variables
		int age = 17;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int sum = 0;
		int sum_2 = 0;
		int avg = 0;
		int diff = 0;
		int pro = 0;
		double quo = 0;
		int x = 0;
		int y = 0;
		
	//Initialized variables	
		a = 12;
		b = 32;
		c = 35;
		d = 54;
		e = 65;
		f = 76;
		g = 98;
		
	//Equations
		sum = a+b+c+d+e+f+g;
		avg = sum / 7;
		sum_2 = a+g;
		diff = g-a;
		pro = a*g;
		quo = g/a;
		
	//Printed text	
		System.out.println ("several random numbers:");
		// print 7 random numbers
			while(y>7);
				{	
					x = (int)Math.random()*10+1;
					System.out.println (+ x );
					y = y+1;
				}
			do 
				{
					x = (int)Math.random()*10+1;	}
		System.out.println (+ x );
		System.out.println (+ b );
		System.out.println (+ c );
		System.out.println (+ d );
		System.out.println (+ e );
		System.out.println (+ f );
		System.out.println (+ g );
		System.out.println ("the average is "+ avg);
		System.out.println ("The sum, difference, product, and quotient of the first and last numbers:");
		System.out.println ("First number is "+ a);
		System.out.println ("the last number is "+ g);
		System.out.println ("the sum is "+ sum);
		System.out.println ("the difference is "+ diff);
		System.out.println ("the product is "+ pro);
		System.out.println ("the quotient is "+ quo);
		System.out.println ("My age is "+ age);
		System.out.println ("B");
		System.out.println ("my favorite book is COSMOS - By Carl Segan");	

}
}