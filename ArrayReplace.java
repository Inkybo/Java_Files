public class ArrayReplace
{
	public static void main (String[] args) 
	{
		int[] nums = new int[5];
		
		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 6;
		nums[3] = 7;
		nums[4] = 8;
		
		System.out.println ("before replacement:");
		for (int x : nums)
		{
			System.out.println (x);
		}
		
		int[] scores = {88, 90};
		nums = scores;
		
		System.out.println ("after replacement:");
		for (int x : nums)
		{
			System.out.println (x);
		}
		
		
		
		
	}
}