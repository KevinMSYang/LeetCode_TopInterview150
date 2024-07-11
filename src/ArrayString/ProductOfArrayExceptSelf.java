//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]


package ArrayString;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        int[] ans = new int[nums.length];
        
        L[0] = 1;
        R[nums.length-1] = 1;
        for (int i = 1; i < L.length; i++) {
        	L[i] = nums[i-1] * L[i-1];
        }
        
        for (int i = nums.length -2; i >= 0; i--) {
        	R[i] = nums[i+1] * R[i+1];
        }
        
        for (int i = 0; i < ans.length; i++) {
        	ans[i] = L[i] * R[i];
        }
        return ans;
    }
    
//    public int[] productExceptSelf(int[] nums) {
//        int[] ans = new int[nums.length];
//        
//        for (int i = 1; i < ans.length; i++) {
//        	ans[i] = nums[i-1] * ans[i-1];
//        }
//        
//        int R = 1;
//        for (int i = nums.length -1; i >= 0; i--) {
//        	ans[i] = nums[i] * R;
//        	R = R * nums[i];
//        }
//        return ans;
//    }
}
