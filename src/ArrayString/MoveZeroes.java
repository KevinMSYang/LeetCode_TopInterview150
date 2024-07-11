//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
// 
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]

package ArrayString;

public class MoveZeroes {
	public void moveZeroes(int[] nums)
	{
		int j = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != 0)
			{
				nums[j] = nums[i];
				j++;
			}
		}
		while (j < nums.length)
		{
			nums[j] = 0;
			j++;
		}
	}

//	  public void moveZeroes(int[] nums) {
//		    int i = 0;
//		    for (final int num : nums)
//		      if (num != 0)
//		        nums[i++] = num;
//
//		    while (i < nums.length)
//		      nums[i++] = 0;
//		  }
	  
	public static void main(String[] args)
	{
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(new int[] {0, 0, 1});
	}
}
