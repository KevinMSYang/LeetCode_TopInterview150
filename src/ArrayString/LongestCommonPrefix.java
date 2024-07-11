//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

package ArrayString;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	String prefix = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strs[0].length(); i++) {
        	int match = 1;
        	char c = strs[0].charAt(i);
        	for (int j = 1; j < strs.length && i < strs[j].length(); j++) {
        		if (c == strs[j].charAt(i)) {
        			match++;
        		}
        	}
        	if(match == strs.length) {
        		sb.append(c);
        	}
        	if (match != strs.length) {
        		break;
        	}
        }
        
        prefix = sb.toString();
        return prefix;
    }
    
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0)
//          return "";
//
//        for (int i = 0; i < strs[0].length(); ++i)
//          for (int j = 1; j < strs.length; ++j)
//            if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
//              return strs[0].substring(0, i);
//
//        return strs[0];
//      }
    
    
    public static void main(String[] args) {
    	LongestCommonPrefix lcp = new LongestCommonPrefix();
    	String[] strs = {"flower","flow","flight"};
    	System.out.println(lcp.longestCommonPrefix(strs));
    }
}
