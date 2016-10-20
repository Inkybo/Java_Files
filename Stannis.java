public class Stannis
{
	public static void main (String[] args) {
	
	String name ="";
	int nam = 0;
	int sep = 0;
	
	
	System.out.println ("Enter you name:");
	
	name = SavitchIn.readLine();
	
	while (name.indexOf(' ') == -1)
	{
		System.out.println ("Space is needed, TRY AGAIN:");
		name = SavitchIn.readLine();
		if (name.indexOf(' ') != -1)
		{
			break;
		}
	}
	nam = name.length()-1;
	System.out.println ("name contains: "+nam+" letters");
	System.out.println (name.charAt(0));
	System.out.println (name.charAt(2));
	System.out.println (name.charAt(nam));
	System.out.println (name.toUpperCase());
	if (name.indexOf('A')!=1 && name.indexOf('Z')!=1)
	{
		System.out.println ("both");
	}
	System.out.println (name.substring(4,7));
	System.out.println (name.substring(2));
	System.out.println ("-----");
	System.out.println ("Initials:");
	System.out.println (name.charAt(0));
	System.out.println (name.charAt(name.indexOf(' ')+1));
	System.out.println ("-----");
	do
	{
		System.out.println (name.charAt(sep));
		sep++;	
		
	} while (sep<= nam);
	System.out.println ();
	

}
}