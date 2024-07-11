//Given an integer array nums, find the 
//subarray
// with the largest sum, and return its sum.
//
// 
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

package ArrayString;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums.length == 1)
        {
        	return nums[0];
        }
        
        for (int i = 0; i < nums.length; i++)
        {
        	int j = nums.length;
        	while ( j > i)
        	{
        		System.out.println("Range from " + i + " to " + j);
        		int sum = IntStream.range(i, j).map(k -> nums[k]).sum();
        		System.out.println("sum = " + sum + " max = " + max);
        		max = Math.max(max, sum);
        		j--;
        	}
        }
        
    	return max;
    }
    
//    public int maxSubArray(int[] nums) {
//        int ans = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for (final int num : nums) {
//          sum = Math.max(num, sum + num);
//          ans = Math.max(ans, sum);
//        }
//
//        return ans;
//      }
    
    public static void main(String[] args)
    {
    	MaximumSubarray ms = new MaximumSubarray();
    	int[] nums = {-2,-1};
    	System.out.println(ms.maxSubArray(nums));
    }
}
