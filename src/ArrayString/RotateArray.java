//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

package ArrayString;

public class RotateArray {
    public void rotate(int[] nums, int k) 
    {
//    	int count = 0;
//    	
//    	while (count < k)
//    	{   		
//    		int r = nums.length-1;
//    		int temp = nums[r];
//    		while (r > 0)
//    		{
//    			nums[r] = nums[r-1];
//    			r--;
//    		}
//    		nums[r] = temp;
//    		count++;
//    	}
    	k = k % nums.length;
    	System.out.println(k);
    	reverse(nums, 0, nums.length-1);
    	reverse(nums, 0, k-1);
    	reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int l, int r)
    {
    	while (l < r)
    	{
    		swap(nums, l++, r--);
    	}
    }
    
    public void swap(int[] nums, int l, int r)
    {
    	int temp = nums[l];
    	nums[l] = nums[r];
    	nums[r] = temp;
    }
    
    public void print(int[] nums)
    {
    	for(int i = 0; i < nums.length; i++)
    	{
    		System.out.print(nums[i] + " ");
    	}
    	System.out.println();
    }
    
//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//      }
//
//      private void reverse(int[] nums, int l, int r) {
//        while (l < r)
//          swap(nums, l++, r--);
//      }
//
//      private void swap(int[] nums, int l, int r) {
//        final int temp = nums[l];
//        nums[l] = nums[r];
//        nums[r] = temp;
//      }
    
    public static void main(String[] args)
    {
    	RotateArray ra = new RotateArray();
    	int[] nums = {-1, 1};
    	int k = 2;
    	ra.rotate(nums, k);
    }
}
