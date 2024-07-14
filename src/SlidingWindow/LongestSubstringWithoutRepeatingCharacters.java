//Given a string s, find the length of the longest 
//substring
// without repeating characters.
//
// 
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        
        int len = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
        	System.out.println("R=" +r);
        	if (!list.contains(s.charAt(r))) {
        		list.add(s.charAt(r));
        		System.out.println(list);
        	}
        	else {
        		len = Math.max(len, r - l);
        		System.out.println("Len=" +len);
        		r--;
        		list.remove(0);
        		System.out.println(list);
        		System.out.println("L=" +l);
        		l++;
        	}
        }
        return Math.max(len, list.size());
    }
    
//    public int lengthOfLongestSubstring(String s) {
//        int ans = 0;
//        int[] count = new int[128];
//
//        for (int l = 0, r = 0; r < s.length(); ++r) {
//          ++count[s.charAt(r)];
//          while (count[s.charAt(r)] > 1)
//            --count[s.charAt(l++)];
//          ans = Math.max(ans, r - l + 1);
//        }
//
//        return ans;
//      }
    
    
    public static void main(String[] args) {
    	LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
    	String s = " ";
    	ls.lengthOfLongestSubstring(s);
    	
    }
}
