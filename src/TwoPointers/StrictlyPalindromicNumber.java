//An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.
//
//Given an integer n, return true if n is strictly palindromic and false otherwise.
//
//A string is palindromic if it reads the same forward and backward.
//
// 
//
//Example 1:
//
//Input: n = 9
//Output: false
//Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
//In base 3: 9 = 100 (base 3), which is not palindromic.
//Therefore, 9 is not strictly palindromic so we return false.
//Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
//Example 2:
//
//Input: n = 4
//Output: false
//Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
//Therefore, we return false.

package TwoPointers;

public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
        	String tempStr = baseN(n, i);
        	if (!palindrom(tempStr)) {
        		return false;
        	}
        }
        return true;
    }
    
    private String baseN (int number, int base) {
    	StringBuilder sb = new StringBuilder();
    	
    	while (number != 0) {
    		int remainder = number % base;
    		sb.insert(0, remainder);
    		number = number / base;
    	}
    	return sb.toString();
    }
    
    private boolean palindrom (String str) {
    	for (int i = 0, j = str.length() -1; i <= str.length()/2 && j >= str.length()/2; i++, j--) {
    		if (str.charAt(i) != str.charAt(j)) {
    			return false;
    		}
    	}
    	return true;
    }
}
