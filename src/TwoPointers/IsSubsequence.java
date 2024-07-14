//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
// 
//
//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false

package TwoPointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
    	if (s.length() > t.length()) {
    		return false;
    	}
    	if (s.length() == 0 && t.length() != 0) {
    		return true;
    	}
    	if (s.length() == 0 && t.length() == 0) {
    		return true;
    	}
    	boolean[] match = new boolean[s.length()];
    	int index = 0;
    	for (int i = 0; i < s.length(); i++) {
    		System.out.println("I=" +i);
    		for (; index < t.length(); index++) {
    			System.out.println("INDEX=" + index);
    			System.out.println(s.charAt(i) + " vs " + t.charAt(index));
    			if (s.charAt(i) == t.charAt(index)) {
    				match[i] = true;
    				index++;
    				System.out.println("match=" + match[i]);
    				break;
    				
    			}
    		}
    	}
    	for (int i = 0; i < match.length; i++) {
    		if (match[i] == false) {
    			return false;
    		}
    	}
        return true;
    }
    
    public static void main(String[] args) {
    	IsSubsequence is = new IsSubsequence();
    	String s = "aaaaaa";
    	String t = "";
    	System.out.println(is.isSubsequence(s, t));
    }
}
