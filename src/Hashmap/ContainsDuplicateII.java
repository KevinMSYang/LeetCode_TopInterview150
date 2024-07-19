//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) {
        		map.get(nums[i]).add(i);
        	}
        	else {
        		List<Integer> list = new ArrayList<>();
        		list.add(i);
        		map.put(nums[i], list);
        	}
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
        	if (entry.getValue().size() >= 2) {
        		for (int i = 0, j = i + 1; i + 1 < entry.getValue().size(); i++, j++) {
        			if (Math.abs(entry.getValue().get(i) - entry.getValue().get(j)) <= k) {
        				return true;
        			}
        		}
        	}
        }
        return false;
    }
    
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> seen = new HashSet<>();
//
//        for (int i = 0; i < nums.length; ++i) {
//          if (!seen.add(nums[i]))
//            return true;
//          if (i >= k)
//            seen.remove(nums[i - k]);
//        }
//
//        return false;
//      }
    
    public static void main(String[] args) {
    	ContainsDuplicateII cd = new ContainsDuplicateII();
    	int[] nums = {1,2,3,1};
    	int k = 3;
    	cd.containsNearbyDuplicate(nums, k);
    }
}
