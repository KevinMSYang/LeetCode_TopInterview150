//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
// 
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> pMap = new HashMap<>();
        Map<String, Integer> sMap = new HashMap<>();
        
        String[] str = s.split("\\s");
        if (pattern.length() != str.length) {
        	return false;
        }
        
        for (Integer i = 0; i < pattern.length(); i++) {
        	if (pMap.put(pattern.charAt(i), i) != sMap.put(str[i], i)) {
        		return false;
        	}
        }
        return true;
    }
}
