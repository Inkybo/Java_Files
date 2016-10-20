import java.util.ArrayList;

public class NamesArray
{
	public static void main (String[] args) {
	
	int num_names = 0;
	String name_word = "";
	String name_remove = "";
	int age = 0;
	
	ArrayList names = new ArrayList();
	
	System.out.println ("How many names will you enter?");
	
	num_names = SavitchIn.readLineInt();
	
	for(int x = 0; x < num_names; x++)
	{
		System.out.println ("Enter name #"+(x+1));
		name_word = SavitchIn.readLine();
		names.add(name_word);
	}
	System.out.println ();
	System.out.println (names);
	System.out.println ("Please choose one of the names to remove:");
	name_remove = SavitchIn.readLine();
	
	int location  = names.indexOf(name_remove);
	names.remove(location);
	
	System.out.println (names);	
	
	System.out.println ();
	System.out.println ("-The name 'Mike Gordon' will now be added-");
	System.out.println ();
	
	names.add(num_names-1,"Mike Gordon");
	
	System.out.println (names);	
	
	System.out.println ("Please choose one of the names to remove:");
	name_remove = SavitchIn.readLine();
	
	int location_2  = names.indexOf(name_remove);
	System.out.println ("What name shall be added there?");
	name_word = SavitchIn.readLine();
	
	names.set(location_2, name_word);	
	
	System.out.println (names);
	
	for(int x = 0; x < num_names; x++)
	{
		System.out.println ("How old is "+names.get(x*2));
		age = SavitchIn.readLineInt();
		names.add(x*2+1, age);
		System.out.println (names);
	}
}
}