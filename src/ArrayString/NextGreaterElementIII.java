//Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.
//
//Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.
//
// 
//
//Example 1:
//
//Input: n = 12
//Output: 21
//Example 2:
//
//Input: n = 21
//Output: -1

package ArrayString;

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        String numberStr = Integer.toString(n);
        int[] digit = new int[numberStr.length()];
        for (int i = 0; i < digit.length; i++) {
        	digit[i] = numberStr.charAt(i) - '0';
        }
        int index = -1;
        for (int i = digit.length-2 ; i >= 0; i--) {
        	if (digit[i] < digit[i+1]) {
        		index = i;
        		break;
        	}
        }
        if (index == -1) {
        	return -1;
        }
        
        for (int i = index +1; i < digit.length; i++) {
        	if (digit[index] < digit[i]) {
        		
        	}
        }
    }
}
