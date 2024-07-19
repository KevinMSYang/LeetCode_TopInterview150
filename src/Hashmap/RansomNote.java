//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//
// 
//
//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
        	return false;
        }
        
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
        	map.put(i, magazine.charAt(i));
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
        	if (map.containsValue(ransomNote.charAt(i))) {
        		for(Map.Entry<Integer, Character> entry : map.entrySet()) {
        			if (entry.getValue() == ransomNote.charAt(i)) {
        				map.remove(entry.getKey());
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
    
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] count = new int[26];
//
//        for (final char c : magazine.toCharArray())
//          ++count[c - 'a'];
//
//        for (final char c : ransomNote.toCharArray()) {
//          if (count[c - 'a'] == 0)
//            return false;
//          --count[c - 'a'];
//        }
//
//        return true;
//      }
    
    public static void main(String[] args) {
    	RansomNote rn = new RansomNote();
    	
    	String s1 = "aa";
    	String s2 = "aab";
    	rn.canConstruct(s1, s2);
    }
}
