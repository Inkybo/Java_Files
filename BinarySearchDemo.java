public class BinarySearchDemo
{
	public void binarySearch(int[] nums, int low, int high, int target)
   	{
       	int pos = 0;
       	pos = (low + high) / 2;

     	while((nums[pos] != target) && (low <= high))
     	{
      	   if (nums[pos] > target)             
      	   {                                              
      	        high = pos - 1;  
      	   }                                                            
     	   else                                                  
           {                                                       
            	low = pos + 1;    
           }
       	    pos = (low + high) / 2;
     	}
     
     	if (low <= high)
     	{
           	System.out.println("Found at index #" + pos);
        }
     	else
     	{
     		System.out.println("not found.");
     	}
  	}

}
