//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
// 
//
//Example 1:
//
//Input: s = "egg", t = "add"
//Output: true
//Example 2:
//
//Input: s = "foo", t = "bar"
//Output: false
//Example 3:
//
//Input: s = "paper", t = "title"
//Output: true

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
        	return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        for (Integer i = 0; i < s.length(); i++) {
        	if (sMap.put(s.charAt(i), i) != tMap.put(t.charAt(i), i)) {
        		return false;
        	}
        }
        return true;
    }
    
//    public boolean isIsomorphic(String s, String t) {
//    Map<Character, Integer> charToIndex_s = new HashMap<>();
//    Map<Character, Integer> charToIndex_t = new HashMap<>();
//
//    for (Integer i = 0; i < s.length(); ++i)
//      if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
//        return false;
//
//    return true;
//    }
}
