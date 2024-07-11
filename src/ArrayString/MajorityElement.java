//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
// 
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums)
	{
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			map.putIfAbsent(nums[i], new ArrayList<>());
			map.get(nums[i]).add(i);
		}
		int max = 0;
		int majority= 0;
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
		{
			int currentkey = entry.getKey();
			int frequency = entry.getValue().size();
			if (frequency > max)
			{
				max = frequency;
				majority = currentkey;
			}
		}
		return majority;	
	}
}
