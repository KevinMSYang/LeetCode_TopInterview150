//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
// 
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.

package ArrayString;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
    	if (haystack.length() < needle.length()) {
    		return -1;
    	}
    	
    	char[] hayArr = haystack.toCharArray();
    	char[] neeArr = needle.toCharArray();
    	int index = -1;
    	
    	for (int i = 0; i < hayArr.length; i++) {
    		System.out.println("I= " +i );
    		int k = i;
    		System.out.println("K= " +k);
    		for (int j = 0; j < neeArr.length&& k <hayArr.length; j++) {
    			System.out.println("J= " +j);
    			if (hayArr[k] != neeArr[j]) {
    				break;
    			}
    			else {
    				if (j == neeArr.length -1) {
    					return k - j;
    				}
    				k++;
    				System.out.println("k= " +k);
    			}
    		}
    	}
    	return index;
    }
    
    public static void main(String[] args) {
    	FindTheIndexOfTheFirstOccurrenceInAString ft = new FindTheIndexOfTheFirstOccurrenceInAString();
    	String str1 = "mississippi";
    	String str2 = "issipi";
    	ft.strStr(str1, str2);
    }
}
