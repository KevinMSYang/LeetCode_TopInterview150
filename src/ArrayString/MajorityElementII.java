//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
// 
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//
//Input: nums = [1]
//Output: [1]
//Example 3:
//
//Input: nums = [1,2]
//Output: [1,2]

package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums)
	{
		List<Integer> list = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++)
		{
			map.putIfAbsent(nums[i], new ArrayList<>());
			map.get(nums[i]).add(i);
		}
		
		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet())
		{
			if (entry.getValue().size() > nums.length /3)
			{
				list.add(entry.getKey());
			}
		}
		return list;
	}

}
