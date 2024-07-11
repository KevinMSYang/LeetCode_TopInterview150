//Given an integer array nums, return the most frequent even element.
//
//If there is a tie, return the smallest one. If there is no such element, return -1.
//
// 
//
//Example 1:
//
//Input: nums = [0,1,2,2,4,4,1]
//Output: 2
//Explanation:
//The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
//We return the smallest one, which is 2.
//Example 2:
//
//Input: nums = [4,4,4,9,2,4]
//Output: 4
//Explanation: 4 is the even element appears the most.
//Example 3:
//
//Input: nums = [29,47,21,41,13,37,25,7]
//Output: -1
//Explanation: There is no even element.

package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentEvenElement {
	public int mostFrequentEven(int[] nums)
	{
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 2 == 0)
			{
				map.putIfAbsent(nums[i], new ArrayList<>());
				map.get(nums[i]).add(i);
			}
		}
		System.out.println(map);
		int frequency = 0;
		int element = -1;
		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet())
		{
			if (entry.getValue().size() > frequency)
			{
				frequency = entry.getValue().size();
				element = entry.getKey();
			}
			else if (entry.getValue().size() == frequency)
			{
				element = Math.min(element, entry.getKey());
			}
		}
		return element;
	}
	
//	  public int mostFrequentEven(int[] nums) {
//		    int ans = -1;
//		    Map<Integer, Integer> count = new HashMap<>();
//
//		    for (final int num : nums) {
//		      if (num % 2 == 1)
//		        continue;
//		      final int newCount = count.merge(num, 1, Integer::sum);
//		      final int maxCount = count.getOrDefault(ans, 0);
//		      if (newCount > maxCount || newCount == maxCount && num < ans)
//		        ans = num;
//		    }
//
//		    return ans;
//		  }
	
	public static void main(String[] args)
	{
		MostFrequentEvenElement mfee = new MostFrequentEvenElement();
		int[] nums = {0, 1, 2, 2, 4, 4, 1};
		mfee.mostFrequentEven(nums);
	}
}
