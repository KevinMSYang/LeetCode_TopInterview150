//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//
// 
//
//Example 1:
//
//Input: s = "abab"
//Output: true
//Explanation: It is the substring "ab" twice.
//Example 2:
//
//Input: s = "aba"
//Output: false
//Example 3:
//
//Input: s = "abcabcabcabc"
//Output: true
//Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

package ArrayString;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
    	String ss = s+s;
    	return ss.substring(1, ss.length()-1).contains(s);
    }
    
//    // ** If s can be constructed by repeating a substring, then ss, when trimmed from both ends, 
//    should still contain the original string s somewhere in the middle. 
//    This is because any valid repeated pattern will overlap with itself when the first and last characters are removed.** 
    
//    public boolean repeatedSubstringPattern(String s) {
//        final String ss = s + s;
//        return ss.substring(1, ss.length() - 1).contains(s);
//      }
    

	public static void main(String[] args) {
    	RepeatedSubstringPattern rs = new RepeatedSubstringPattern();
    	String s = "bb";
    	System.out.println(rs.repeatedSubstringPattern(s));
    }
}
