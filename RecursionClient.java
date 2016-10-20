public class RecursionClient
{
	public static void main(String[] args)
	{
		RecursionClass a = new RecursionClass();
		
		////////////////////
		
		System.out.println ("result of cashMoney:");
		a.cashMoney(5);
		System.out.println ();
		
		////////////////////
		
		System.out.println ("result of findMiddleNum:");
		System.out.println (a.findMiddleNum(2,12)); // SHOW INF REC
		System.out.println ();
		
		////////////////////
		
		System.out.println ("result of someMath:");
		System.out.println (a.someMath(5));
		System.out.println ();		
		
		
		////////////////////
		
		String q = "Porzingis";
		System.out.println ("result of reverser:");
		System.out.println(a.reverser(q, ""));
		System.out.println ();
		
		////////////////////
		
		
	}
}