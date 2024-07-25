//Question: 35
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
// 
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4

package BinarySearch;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length;
		
		while (l < r) {
			int m = (l + r) / 2;
			
			if (nums[m] == target) {
				return m;
			}
			
			if(nums[m] > target) {
				r = m;
			}
			else {
				l++;
			}
		}
		return l;
	}
	
//	  public int searchInsert(int[] nums, int target) {
//		    int l = 0;
//		    int r = nums.length;
//
//		    while (l < r) {
//		      final int m = (l + r) / 2;
//		      if (nums[m] == target)
//		        return m;
//		      if (nums[m] < target)
//		        l = m + 1;
//		      else
//		        r = m;
//		    }
//
//		    return l;
//		  }
	
	public static void main(String[] args) {
		SearchInsertPosition si = new SearchInsertPosition();
		int[] nums = {1,3,5,6};
		int target = 2;
	}
}

