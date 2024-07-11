//You are given a 0-indexed integer array nums and an integer k.
//
//You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
//
//You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.
//
//Return the maximum score you can get.
//
// 
//
//Example 1:
//
//Input: nums = [1,-1,-2,4,-7,3], k = 2
//Output: 7
//Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
//Example 2:
//
//Input: nums = [10,-5,-2,4,0,3], k = 3
//Output: 17
//Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
//Example 3:
//
//Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
//Output: 0

package ArrayString;

public class JumpGameVI {
	public int maxResult(int[] nums, int k) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int j = i +1;
			while (j <= k) {
				dp[j] = Math.max(dp[j], dp[i] + nums[j]);
				j++;
			}
		}
		return dp[nums.length-1];
	}
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		JumpGameVI jg = new JumpGameVI();
		int[] arr = {1, -1, -2, 4, -7, 3};
		int k = 2;
		System.out.println("Final Ans=" + jg.maxResult(arr, k));
	}
}
