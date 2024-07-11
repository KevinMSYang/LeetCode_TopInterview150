//Given an integer array nums, find a 
//subarray
// that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
// 
//
//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

package ArrayString;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
    	double currentMax = nums[0];
    	double currentMin = nums[0];
    	double result = nums[0];
    	
    	for (int i = 1; i < nums.length; i++) {
    		double tempMax = currentMax;
    		currentMax = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
    		currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], currentMin * nums[i]));
    		result = Math.max(result, currentMax);
    	}
    	
    	return (int) result;
    }
    
    public static void main(String[] args) {
    	MaximumProductSubarray mp = new MaximumProductSubarray();
    	int[] arr = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
    	System.out.println(mp.maxProduct(arr));
    }
}
