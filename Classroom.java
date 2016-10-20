public class Classroom
{
	public static void main (String[] args) {
		
		int row = 0;
		int column = 0;
	
	char[][] classroom= new char[5][6];
	
	for(int x = 0; x < classroom.length; x++)
	{
		for(int y = 0; y < classroom[x].length; y++)
		{
			classroom[x][y]='-';
		}
	}
	
	for(int x = 0; x < classroom.length; x++)
	{
		for(int y = 0; y < classroom[x].length; y++)
		{
			System.out.print(classroom[x][y]);
		}
		System.out.println ();
	}
	
	
	
	for(int z = 0; z < 3; z++)
	{
		row = 0;
		column = 0;
		
		System.out.println("\nWhere would you like to place a student?");
		
		System.out.print("Row: ");
		row = SavitchIn.readLineInt();
		
		System.out.print("Column: ");
		column = SavitchIn.readLineInt();
		
		while((row < 0 || row > 5) || (column < 0 || column > 6))
		{
			System.out.println ("Not a valid seat, try again");
			
			System.out.print("Row: ");
			row = SavitchIn.readLineInt();
			
			System.out.print("Column: ");
			column = SavitchIn.readLineInt();
			
			while(classroom[row][column]=='s')
			{
				System.out.println ("seat taken, try again");
				
				System.out.print("Row: ");
				row = SavitchIn.readLineInt();
				
				System.out.print("Column: ");
				column = SavitchIn.readLineInt();
			}
		}
		
		classroom[row][column]='s';    
	}
	
	System.out.println("\nHere is the new chart:");
	
	for(int x = 0; x < classroom.length; x++)
	{
		for(int y = 0; y < classroom[x].length; y++)
		{
			System.out.print(classroom[x][y]);
		}
		System.out.println ();
	}
}
}