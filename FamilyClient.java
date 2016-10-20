public class FamilyClient
{
	public static void main (String[] args) {
	
		int average_2 = 0;
		int old_2 = 0;
		int young_2 = 0;
		int child_2 = 0;
		int teen_2 = 0;
		int Adult_2 = 0;
		int even_2 = 0;
		int odd_2 = 0;
		
		
		FamilyClass family = new FamilyClass();
		
		family.setData();
		
		average_2 = family.getAvg();
		old_2 = family.getOldest();
		young_2 = family.getYoungest();
		child_2 = family.getNumKids();
		teen_2 = family.getNumTeens();
		Adult_2 = family.getNumAdults();
		even_2 = family.getNumEvens();
		odd_2 = family.getNumOdds();
		
		System.out.println("The average age is " +average_2);
		System.out.println("The oldest age is " +old_2);
		System.out.println("The youngest age is " +young_2);
		System.out.println("The number of children is " +child_2);
		System.out.println("The number of teens is " +teen_2);
		System.out.println("The nuber of adults is " +Adult_2);
		System.out.println("The amount of even ages is " +even_2);
		System.out.println("The amount of odd ages is " +odd_2);	

}
}