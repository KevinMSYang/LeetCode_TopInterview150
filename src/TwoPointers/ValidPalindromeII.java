//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
// 
//
//Example 1:
//
//Input: s = "aba"
//Output: true
//Example 2:
//
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
//Example 3:
//
//Input: s = "abc"
//Output: false

package TwoPointers;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        if (s.length() == 1) {
        	return true;
        }
        StringBuilder sb = new StringBuilder(s);
        if (!palindrom(s)) {
        	for (int i = 0; i < s.length(); i++) {
        		if (!palindrom(sb.deleteCharAt(i).toString())) {
        			sb = new StringBuilder(s);
        		}
        		else {
        			return true;
        		}
        	}
        }
        else {
        	return true;
        }
        return false;
    }
    
    private boolean palindrom(String str) {
    	StringBuilder sb = new StringBuilder(str);
    	if (sb.reverse().toString().equals(str)) {
    		return true;
    	}
    	return false;
    }
    
//    public boolean validPalindrome(String s) {
//        for (int l = 0, r = s.length() - 1; l < r; ++l, --r)
//          if (s.charAt(l) != s.charAt(r))
//            return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
//        return true;
//      }
//
//      private boolean validPalindrome(final String s, int l, int r) {
//        while (l < r)
//          if (s.charAt(l++) != s.charAt(r--))
//            return false;
//        return true;
//      }
    
    
    public static void main(String[] args) {
    	ValidPalindromeII vp = new ValidPalindromeII();
    	
    	String s = "abca";
    	System.out.println("Final= " + vp.validPalindrome(s));
    }
}
