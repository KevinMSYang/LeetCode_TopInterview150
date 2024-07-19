//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
// 
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]
//Example 3:
//
//Input: strs = ["a"]
//Output: [["a"]]

package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
   
        Map<String, List<String>> map = new HashMap<>();
        if (strs.length == 0) {
        	return new ArrayList<>();
        }
        
        for (String str : strs) {
        	char[] chars = str.toCharArray();
        	Arrays.sort(chars);
        	String tempStr = String.valueOf(chars);
        	map.computeIfAbsent(tempStr, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    
    public static void main(String[] args) {
    	GroupAnagrams ga = new GroupAnagrams();
    	String[] arr = {"eat","tea","tan","ate","nat","bat"};
    	ga.groupAnagrams(arr);
    }
}
