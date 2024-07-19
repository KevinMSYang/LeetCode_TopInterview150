//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
// 
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				arr[0] = i;
				arr[1] = map.get(target - nums[i]);
				return arr;
			}
			map.put(nums[i], i);
		}
		return arr;
	}
	
//	  public int[] twoSum(int[] nums, int target) {
//		    Map<Integer, Integer> numToIndex = new HashMap<>();
//
//		    for (int i = 0; i < nums.length; ++i) {
//		      if (numToIndex.containsKey(target - nums[i]))
//		        return new int[] {numToIndex.get(target - nums[i]), i};
//		      numToIndex.put(nums[i], i);
//		    }
//
//		    throw new IllegalArgumentException();
//		  }
	
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] arr = {2,7,11,15};
		int target = 9;
		ts.twoSum(arr, target);
	}
}
