//Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
//
//The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [2,-1,2]
//Explanation: The first 1's next greater number is 2; 
//The number 2 can't find next greater number. 
//The second 1's next greater number needs to search circularly, which is also 2.
//Example 2:
//
//Input: nums = [1,2,3,4,3]
//Output: [2,3,4,-1,4]

package ArrayString;

import java.util.Arrays;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
        	int j = i + 1;
        	if (i == nums.length-1) {
        		j = 0;
        	}
        	for (;j < nums.length; j++) {
        		if (nums[j] > nums[i]) {
        			ans[i] = nums[j];
        			break;
        		}
        	}
        	if (ans[i] == Integer.MIN_VALUE) {
        		for (j = 0; j < i; j++) {
        			if (nums[j] > nums[i]) {
        				ans[i] = nums[j];
        				break;
        			}
        		}
        	}
        	if (ans[i] == Integer.MIN_VALUE) {
        		ans[i] = -1;
        	}
        }
        return ans;
    }
    
//    public int[] nextGreaterElements(int[] nums) {
//        final int n = nums.length;
//        int[] ans = new int[n];
//        Arrays.fill(ans, -1);
//        Deque<Integer> stack = new ArrayDeque<>(); // a decreasing stack storing indices
//
//        for (int i = 0; i < n * 2; ++i) {
//          final int num = nums[i % n];
//          while (!stack.isEmpty() && nums[stack.peek()] < num)
//            ans[stack.pop()] = num;
//          if (i < n)
//            stack.push(i);
//        }
//
//        return ans;
//      }
    
    
    public static void main(String[] args) {
    	NextGreaterElementII nge = new NextGreaterElementII();
    	int[] nums = {-1, 0};
    	nge.nextGreaterElements(nums);
    }
}
