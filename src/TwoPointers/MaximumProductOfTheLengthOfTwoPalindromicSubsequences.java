//Given a string s, find two disjoint palindromic subsequences of s such that the product of their lengths is maximized. The two subsequences are disjoint if they do not both pick a character at the same index.
//
//Return the maximum possible product of the lengths of the two palindromic subsequences.
//
//A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters. A string is palindromic if it reads the same forward and backward.
//
//Input: s = "leetcodecom"
//Output: 9
//Explanation: An optimal solution is to choose "ete" for the 1st subsequence and "cdc" for the 2nd subsequence.
//The product of their lengths is: 3 * 3 = 9.
//Example 2:
//
//Input: s = "bb"
//Output: 1
//Explanation: An optimal solution is to choose "b" (the first character) for the 1st subsequence and "b" (the second character) for the 2nd subsequence.
//The product of their lengths is: 1 * 1 = 1.
//Example 3:
//
//Input: s = "accbcaxxcxx"
//Output: 25
//Explanation: An optimal solution is to choose "accca" for the 1st subsequence and "xxcxx" for the 2nd subsequence.
//The product of their lengths is: 5 * 5 = 25.

package TwoPointers;

public class MaximumProductOfTheLengthOfTwoPalindromicSubsequences {
	  public int maxProduct(String s) {
		    dfs(s, 0, new StringBuilder(), new StringBuilder());
		    return ans;
		  }

		  private int ans = 0;

		  private void dfs(final String s, int i, StringBuilder sb1, StringBuilder sb2) {
		    if (i == s.length()) {
		      if (isPalindrome(sb1) && isPalindrome(sb2))
		        ans = Math.max(ans, sb1.length() * sb2.length());
		      return;
		    }

		    final int sb1Length = sb1.length();
		    dfs(s, i + 1, sb1.append(s.charAt(i)), sb2);
		    sb1.setLength(sb1Length);

		    final int sb2Length = sb2.length();
		    dfs(s, i + 1, sb1, sb2.append(s.charAt(i)));
		    sb2.setLength(sb2Length);

		    dfs(s, i + 1, sb1, sb2);
		  }

		  private boolean isPalindrome(StringBuilder sb) {
		    int i = 0;
		    int j = sb.length() - 1;
		    while (i < j) {
		      if (sb.charAt(i) != sb.charAt(j))
		        return false;
		      ++i;
		      --j;
		    }
		    return true;
		  }
}
