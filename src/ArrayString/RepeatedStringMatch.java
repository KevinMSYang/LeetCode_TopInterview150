//Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
//
//Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".
//
// 
//
//Example 1:
//
//Input: a = "abcd", b = "cdabcdab"
//Output: 3
//Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
//Example 2:
//
//Input: a = "a", b = "aa"
//Output: 2

package ArrayString;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
    	int repeat = 1;
    	String s = a;
    	while (s.length() < b.length()) {
    		if (s.length() < b.length()) {
    			s += a;
    			repeat++;
    		}
    	}
    	if (s.contains(b)) {
    		return repeat;
    	}
    	else if ((s+a).contains(b)) {
    		return repeat+1;
    	}
    	else {
    		return -1;
    	}
    }
    
//    public int repeatedStringMatch(String A, String B) {
//        final int n = (int) Math.ceil((double) B.length() / (double) A.length());
//        final String s = String.join("", Collections.nCopies(n, A));
//        if (s.contains(B))
//          return n;
//        if ((s + A).contains(B))
//          return n + 1;
//        return -1;
//      }
}
