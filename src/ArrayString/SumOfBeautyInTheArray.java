//You are given a 0-indexed integer array nums. For each index i (1 <= i <= nums.length - 2) 
//the beauty of nums[i] equals:
//
//2, if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.
//1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
//0, if none of the previous conditions holds.
//Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 2
//Explanation: For each index i in the range 1 <= i <= 1:
//- The beauty of nums[1] equals 2.
//Example 2:
//
//Input: nums = [2,4,6,4]
//Output: 1
//Explanation: For each index i in the range 1 <= i <= 2:
//- The beauty of nums[1] equals 1.
//- The beauty of nums[2] equals 0.
//Example 3:
//
//Input: nums = [3,2,1]
//Output: 0
//Explanation: For each index i in the range 1 <= i <= 1:
//- The beauty of nums[1] equals 0.

package ArrayString;

public class SumOfBeautyInTheArray {
    public int sumOfBeauties(int[] nums) {
    	int sum = 0;
    	int[] minRight = new int[nums.length];
    	minRight[minRight.length-1] = nums[nums.length-1];
    	
    	for (int i = minRight.length-2; i > 1; i--)
    	{
    		minRight[i] = Math.min(nums[i], minRight[i+1]);
    	}
    	
    	int maxLeft = nums[0];
    	for (int i = 1; i < nums.length -1; i++)
    	{
    		if (maxLeft < nums[i] && nums[i] < minRight[i+1])
    		{
    			sum += 2;
    		}
    		else if (nums[i-1] < nums[i] && nums[i] < nums[i+1])
    		{
    			sum += 1;
    		}
    		maxLeft = Math.max(maxLeft, nums[i]);
    	}
    	
    	return sum;
    }
    
//    public int sumOfBeauties(int[] nums) {
//        final int n = nums.length;
//        int ans = 0;
//        int[] minOfRight = new int[n];
//        minOfRight[n - 1] = nums[n - 1];
//
//        for (int i = n - 2; i >= 2; --i)
//          minOfRight[i] = Math.min(nums[i], minOfRight[i + 1]);
//
//        int maxOfLeft = nums[0];
//
//        for (int i = 1; i <= n - 2; ++i) {
//          if (maxOfLeft < nums[i] && nums[i] < minOfRight[i + 1])
//            ans += 2;
//          else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1])
//            ans += 1;
//          maxOfLeft = Math.max(maxOfLeft, nums[i]);
//        }
//
//        return ans;
//      }   
    
    public static void main(String[] args)
    {
    	SumOfBeautyInTheArray sb = new SumOfBeautyInTheArray();
    	int[] arr = {55,36,68,97,1,20,5,50,53,21,15,66,93,12,31,14,13,3,24,97,30,14,28,4,67,86,60,59,40,69,83,49,28,88,98,27,94,56,55,66,3,75,76,7,54,68,75,24,13,85,62,47,3,67,16,79,47,38,89,48,40,3,88,53,13,14,40,26,100,87,3,58,8,53,82,63,60,27,76,79,10,1,37,4,48,40,93,10,29,97};
    	System.out.println("final:"+sb.sumOfBeauties(arr));
    }
}
