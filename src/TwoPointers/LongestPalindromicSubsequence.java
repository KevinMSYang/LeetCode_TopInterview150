//Given a string s, find the longest palindromic subsequence's length in s.
//
//A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
//
// 
//
//Example 1:
//
//Input: s = "bbbab"
//Output: 4
//Explanation: One possible longest palindromic subsequence is "bbbb".
//Example 2:
//
//Input: s = "cbbd"
//Output: 2
//Explanation: One possible longest palindromic subsequence is "bb".

package TwoPointers;

public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        
    }
    
    private boolean isPalindrom(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	if (sb.reverse().toString().equals(s)) {
    		return true;
    	}
    	return false;
    }
}
