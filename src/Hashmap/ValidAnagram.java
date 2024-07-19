//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
// 
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        	return false;
        }
        Map<Integer, Character> sMap = new HashMap<>();
        
        for (Integer i = 0; i < s.length(); i++) {
        	sMap.put(i, s.charAt(i));
        }
        for (Integer i = 0; i < t.length(); i++) {
        	if (sMap.containsValue(t.charAt(i))) {
        		for (Map.Entry<Integer, Character> entry : sMap.entrySet()) {
        			if (t.charAt(i) == entry.getValue()) {
        				sMap.remove(entry.getKey());
        				break;
        			}
        		}
        	}
        	else {
        		return false;
        	}
        }
        return true;
    }
    
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length())
//          return false;
//
//        int[] count = new int[26];
//
//        for (final char c : s.toCharArray())
//          ++count[c - 'a'];
//
//        for (final char c : t.toCharArray()) {
//          if (count[c - 'a'] == 0)
//            return false;
//          --count[c - 'a'];
//        }
//
//        return true;
//      }
}
