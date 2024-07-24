//Question:66
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
// 
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

package Math;

public class PlusOne {
    public int[] plusOne(int[] digits) {
    	
    	if (digits[digits.length-1] + 1 < 10) {
    		digits[digits.length-1] += 1;
    		return digits;
    	}
    	 	
    	int[] ans = new int[digits.length+1];
    	ans[ans.length-1] = 0;
    	int incre = 1;
    	for (int i = ans.length-2; i >= 0; i--) {
    		if (digits[i] + incre > 10) {
    			ans[i] = 0;
    		}
    		else {
    			ans[i] = digits[i] + incre;
    			incre = 0;
    		}
    		if (incre == 0) {
    			ans[i] = digits[i];
    		}
    	}
    	ans[0] = 1;
    	return ans;
    }
    
//    public int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//          if (digits[i] < 9) {
//            ++digits[i];
//            return digits;
//          }
//          digits[i] = 0;
//        }
//
//        int[] ans = new int[digits.length + 1];
//        ans[0] = 1;
//        return ans;
//      }
}
