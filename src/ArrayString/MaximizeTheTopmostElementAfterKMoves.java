//You are given a 0-indexed integer array nums representing the contents of a pile, where nums[0] is the topmost element of the pile.
//
//In one move, you can perform either of the following:
//
//If the pile is not empty, remove the topmost element of the pile.
//If there are one or more removed elements, add any one of them back onto the pile. This element becomes the new topmost element.
//You are also given an integer k, which denotes the total number of moves to be made.
//
//Return the maximum value of the topmost element of the pile possible after exactly k moves. In case it is not possible to obtain a non-empty pile after k moves, return -1.
//
// 
//
//Example 1:
//
//Input: nums = [5,2,2,4,0,6], k = 4
//Output: 5
//Explanation:
//One of the ways we can end with 5 at the top of the pile after 4 moves is as follows:
//- Step 1: Remove the topmost element = 5. The pile becomes [2,2,4,0,6].
//- Step 2: Remove the topmost element = 2. The pile becomes [2,4,0,6].
//- Step 3: Remove the topmost element = 2. The pile becomes [4,0,6].
//- Step 4: Add 5 back onto the pile. The pile becomes [5,4,0,6].
//Note that this is not the only way to end with 5 at the top of the pile. It can be shown that 5 is the largest answer possible after 4 moves.
//Example 2:
//
//Input: nums = [2], k = 1
//Output: -1
//Explanation: 
//In the first move, our only option is to pop the topmost element of the pile.
//Since it is not possible to obtain a non-empty pile after one move, we return -1.

package ArrayString;

import java.util.LinkedList;
import java.util.Queue;

public class MaximizeTheTopmostElementAfterKMoves {
    public int maximumTop(int[] nums, int k) {
    	int removeItem = 0;
    	
    	if (k == 0 || k == 1) {
    		if (nums.length == k) {
    			return -1;
    		}
    		else {
    			return nums[k];
    		}
    	}
    	
    	if (nums.length == 1) {
    		if (k % 2 == 0) {
    			return nums[0];
    		}
    		else {
    			return -1;
    		}
    	}
    	
    	for (int i = 0; i < k-1 && i < nums.length; i++) {
    		removeItem = Math.max(removeItem, nums[i]);
    	}
    	if (k >= nums.length) {
    		return removeItem;
    	}
    	return Math.max(removeItem, nums[k]);
    }
//    
//    public int maximumTop(int[] nums, int k) {
//        final int n = nums.length;
//        // After taking k elements, if there's something left, then return nums[k].
//        // Otherwise, return -1>
//        if (k == 0 || k == 1)
//          return n == k ? -1 : nums[k];
//        // Remove then add even number of times.
//        if (n == 1)
//          return k % 2 == 0 ? nums[0] : -1;
//        // Take min(n, k - 1) elements and put the largest one back.
//        final int max = firstKMax(nums, k - 1);
//        if (k >= n)
//          return max;
//        return Math.max(max, nums[k]);
//      }
//
//      private int firstKMax(int[] nums, int k) {
//        int max = 0;
//        for (int i = 0; i < nums.length && i < k; ++i)
//          max = Math.max(max, nums[i]);
//        return max;
//      }
}
