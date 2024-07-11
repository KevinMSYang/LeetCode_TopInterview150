//You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
//
//Return the array arr.
//
// 
//
//Example 1:
//
//Input: nums = [1,3,1,1,2]
//Output: [5,0,3,4,0]
//Explanation: 
//When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
//When i = 1, arr[1] = 0 because there is no other index with value 3.
//When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. 
//When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. 
//When i = 4, arr[4] = 0 because there is no other index with value 2. 
//
//Example 2:
//
//Input: nums = [0,5,3]
//Output: [0,0,0]
//Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.

package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfDistances {
	public long[] distance(int[] nums)
	{
		long[] arr = new long[nums.length];
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++)
		{
			map.putIfAbsent(nums[i], new ArrayList<>());
			map.get(nums[i]).add(i);
		}
		for (List<Integer> list : map.values())
		{
			if (list.size() == 1)
			{
				continue;
			}
			for (int j = 0; j < list.size(); j++)
			{

				int sum = 0;
				int k = 0;
				while(k < list.size())
				{
					sum = sum + Math.abs(list.get(j) - list.get(k));
					k++;
				}
				arr[list.get(j)] = sum;
			}
		}
		return arr;
	}
	
//	  public long[] distance(int[] nums) {
//		    long[] ans = new long[nums.length];
//		    Map<Integer, List<Integer>> numToIndices = new HashMap<>();
//
//		    for (int i = 0; i < nums.length; ++i) {
//		      numToIndices.putIfAbsent(nums[i], new ArrayList<>());
//		      numToIndices.get(nums[i]).add(i);
//		    }
//
//		    for (List<Integer> indices : numToIndices.values()) {
//		      final int n = indices.size();
//		      if (n == 1) {
//		        continue;
//		      }
//		      long sumSoFar = indices.stream().mapToLong(Integer::intValue).sum();
//		      int prevIndex = 0;
//		      for (int i = 0; i < n; ++i) {
//		        sumSoFar += (i - 1) * (indices.get(i) - prevIndex);
//		        sumSoFar -= (n - 1 - i) * (indices.get(i) - prevIndex);
//		        ans[indices.get(i)] = sumSoFar;
//		        prevIndex = indices.get(i);
//		      }
//		    }
//
//		    return ans;
//		  }
	
	public static void main(String[] args)
	{
		SumOfDistances sod = new SumOfDistances();
		int[] nums = {1, 3, 1, 1, 2};
		sod.distance(nums);
	}

}
