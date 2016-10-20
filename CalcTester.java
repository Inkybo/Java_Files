public class CalcTester
{
	public static void main (String[] args) {
	
	double num_1 = 0.0;
	double num_2 = 0.0;
	int num_3 = 0;
	double addit = 0.0;
	double sub = 0.0;
	double multi = 0.0;
	double div = 0.0;
	double mod = 0.0;
	int fact = 0;
	
	CalcClass cac = new CalcClass();
	
	System.out.println ("Enter two numbers:");
	
	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	
	addit = cac.add(num_1,num_2);
	sub = cac.subtract(num_1,num_2);
	multi = cac.multiply(num_1,num_2);
	div = cac.divide(num_1,num_2);
	
	System.out.println (+num_1+" + "+num_2+" = "+addit);
	System.out.println (+num_1+" - "+num_2+" = "+sub);
	System.out.println (+num_1+" * "+num_2+" = "+multi);
	System.out.println (+num_1+" / "+num_2+" = "+div);
	
	System.out.println ("Enter two numbers:");
	
	num_1 = SavitchIn.readLineInt();
	num_2 = SavitchIn.readLineInt();
	
	mod = cac.modulus(num_1,num_2);
	
	System.out.println (+num_1+" % "+num_2+" = "+mod);
	
	System.out.println ("Enter a number:");
	
	num_3 = SavitchIn.readLineInt();
	
	fact = cac.factorial(num_3);
	
	System.out.println ("factorial of "+num_3+" is "+fact);
	
	
	
	
	
	
	
	
	
	
	
	
}
}