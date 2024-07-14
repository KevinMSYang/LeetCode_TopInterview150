//Given an input string s, reverse the order of the words.
//
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//Return a string of the words in reverse order concatenated by a single space.
//
//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
// 
//
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

package ArrayString;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
    	String[] str = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = str.length-1; i >= 0; i--) {
    		if ((i == 0 || i == str.length-1) && str[i].length() == 0) {
    			continue;
    		}
    		if (str[i].length() != 0) {
    			sb.append(str[i]+" ");
    			
    		}
    	}
    	String tempStr = sb.toString();
    	sb.deleteCharAt(tempStr.length()-1);
        return sb.toString();
    }
    
//    public String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder(s).reverse(); // Reverse the whole string.
//        reverseWords(sb, sb.length());                     // Reverse each word.
//        return cleanSpaces(sb, sb.length());               // Clean up the spaces.
//      }
//
//      private void reverseWords(StringBuilder sb, int n) {
//        int i = 0;
//        int j = 0;
//
//        while (i < n) {
//          while (i < j || i < n && sb.charAt(i) == ' ') // Skip the spaces.
//            ++i;
//          while (j < i || j < n && sb.charAt(j) != ' ') // Skip the spaces.
//            ++j;
//          reverse(sb, i, j - 1); // Reverse the word.
//        }
//      }
//
//      // Trim leading, trailing, and middle spaces
//      private String cleanSpaces(StringBuilder sb, int n) {
//        int i = 0;
//        int j = 0;
//
//        while (j < n) {
//          while (j < n && sb.charAt(j) == ' ') // Skip the spaces.
//            ++j;
//          while (j < n && sb.charAt(j) != ' ') // Keep non spaces
//            sb.setCharAt(i++, sb.charAt(j++));
//          while (j < n && sb.charAt(j) == ' ') // Skip the spaces.
//            ++j;
//          if (j < n) // Keep only one space.
//            sb.setCharAt(i++, ' ');
//        }
//
//        return sb.substring(0, i).toString();
//      }

      private void reverse(StringBuilder sb, int l, int r) {
        while (l < r) {
          final char temp = sb.charAt(l);
          sb.setCharAt(l++, sb.charAt(r));
          sb.setCharAt(r--, temp);
        }
      }
    
    
    public static void main(String[] args) {
    	ReverseWordsInAString rw = new ReverseWordsInAString();
    	String s = "a good   example";
    	System.out.println(rw.reverseWords(s));
    }
}
