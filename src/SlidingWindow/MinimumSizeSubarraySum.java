//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
//subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//
// 
//
//Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Example 3:
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0

package SlidingWindow;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = Arrays.stream(nums).sum();
        
        if ( sum < target) {
        	return 0;
        }
        
        int ans = Integer.MAX_VALUE;
        int total = 0;
        
        for (int l = 0, r = 0; r < nums.length; r++) {
        	total += nums[r];
        	while (total >= target) {
        		ans = Math.min(ans, r - l +1);
        		total -= nums[l];
        		l++;
        	}
        }
        return ans != Integer.MAX_VALUE? ans : 0;
    }
    
//    public int minSubArrayLen(int s, int[] nums) {
//        int ans = Integer.MAX_VALUE;
//        int sum = 0;
//
//        for (int l = 0, r = 0; r < nums.length; ++r) {
//          sum += nums[r];
//          while (sum >= s) {
//            ans = Math.min(ans, r - l + 1);
//            sum -= nums[l++];
//          }
//        }
//
//        return ans != Integer.MAX_VALUE ? ans : 0;
//      }
}
