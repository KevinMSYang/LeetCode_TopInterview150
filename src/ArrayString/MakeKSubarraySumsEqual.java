//You are given a 0-indexed integer array arr and an integer k. The array arr is circular. In other words, the first element of the array is the next element of the last element, and the last element of the array is the previous element of the first element.
//
//You can do the following operation any number of times:
//
//Pick any element from arr and increase or decrease it by 1.
//Return the minimum number of operations such that the sum of each subarray of length k is equal.
//
//A subarray is a contiguous part of the array.
//
// 
//
//Example 1:
//
//Input: arr = [1,4,1,3], k = 2
//Output: 1
//Explanation: we can do one operation on index 1 to make its value equal to 3.
//The array after the operation is [1,3,1,3]
//- Subarray starts at index 0 is [1, 3], and its sum is 4 
//- Subarray starts at index 1 is [3, 1], and its sum is 4 
//- Subarray starts at index 2 is [1, 3], and its sum is 4 
//- Subarray starts at index 3 is [3, 1], and its sum is 4 
//Example 2:
//
//Input: arr = [2,5,5,7], k = 3
//Output: 5
//Explanation: we can do three operations on index 0 to make its value equal to 5 and two operations on index 3 to make its value equal to 5.
//The array after the operations is [5,5,5,5]
//- Subarray starts at index 0 is [5, 5, 5], and its sum is 15
//- Subarray starts at index 1 is [5, 5, 5], and its sum is 15
//- Subarray starts at index 2 is [5, 5, 5], and its sum is 15
//- Subarray starts at index 3 is [5, 5, 5], and its sum is 15 

package ArrayString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeKSubarraySumsEqual {
    public long makeSubKSumEqual(int[] arr, int k) {
    	
    	long ans = 0;
    	boolean[] seen = new boolean[arr.length];
    	
    	for (int i = 0; i < arr.length; i++)
    	{
    		List<Integer> list = new ArrayList<>();
    		int j = i;
    		while (!seen[j])
    		{
    			list.add(arr[j]);
    			seen[j] = true;
    			j = (j + k) % arr.length;
    		}
    		Collections.sort(list);
    		for (int num : list)
    		{
    			ans = ans + Math.abs(num - list.get(list.size()/2));
    		}
    	}
    	return ans;
    }
    
//    public long makeSubKSumEqual(int[] arr, int k) {
//        // If the sum of each subarray of length k is equal, then `arr` must have a
//        // repeated pattern of size k. e.g. arr = [1, 2, 3, ...] and k = 3, to have
//        // sum([1, 2, 3)] == sum([2, 3, x]), x must be 1. Therefore, arr[i] ==
//        // arr[(i + k) % n] for every i.
//        final int n = arr.length;
//        long ans = 0;
//        boolean[] seen = new boolean[n];
//
//        for (int i = 0; i < n; ++i) {
//          List<Integer> groups = new ArrayList<>();
//          int j = i;
//          while (!seen[j]) {
//            groups.add(arr[j]);
//            seen[j] = true;
//            j = (j + k) % n;
//          }
//          Collections.sort(groups);
//          for (final int num : groups)
//            ans += Math.abs(num - groups.get(groups.size() / 2));
//        }
//
//        return ans;
//      }
}
