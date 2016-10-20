public class ArrayOfObjectsDemo
{
	public static void main(String[] args)
	{
		Person[] z = new Person[2];
		
		z[0] = new Person();
		z[1] = new Person();
		
		z[0].setName();
		z[1].setName();
		
		z[0].displayName();
		z[1].displayName();
		
	}
}