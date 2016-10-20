public class Demo2dArray
{
	public static void main(String[] args)
	{
		// this creates a 2-by-5 table (2-D array)
		String[][] table= new String[2][5];
		
		
		//table.length = length of each row (how many columns)
		
		// this nested for-loop sets every "cell" to 0
		for(int r=0; r<table.length; r++)		  // outer loop = rows
		{
			for(int c=0; c<table[r].length; c++)  // inner loop = columns
			{
				table[r][c]="Moo";
			}
		}
		
		
		
		
		
		// this nested for-loop DISPLAYS the table
		for(int r=0; r<table.length; r++)		  // outer loop = rows
		{
			for(int c=0; c<table[r].length; c++)  // inner loop = columns
			{
				System.out.print(table[r][c]);
			}			
			System.out.println();				  // after each row,
												  // move to the next line
		}
		
		
		
		
		int row = 0, column = 0;
		
		System.out.println("\nWhere would you like to place a 1?");
		
		System.out.print("Row: ");
		row=SavitchIn.readLineInt();
		
		System.out.print("Column: ");
		column=SavitchIn.readLineInt();
		
		table[row][column]="1";    
		
		System.out.println("\nHere is the new table:");
		
		
		
		// this nested for-loop DISPLAYS the table
		for(int r=0; r<table.length; r++)		  // outer loop = rows
		{
			for(int c=0; c<table[r].length; c++)  // inner loop = columns
			{
				System.out.print(table[r][c]);
			}			
			System.out.println();				  // after each row,
												  // move to the next line
		}
		
		
		
		System.out.println("\n\n");
	}
}