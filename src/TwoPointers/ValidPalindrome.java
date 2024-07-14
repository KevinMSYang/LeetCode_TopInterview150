//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.

package TwoPointers;

public class ValidPalindrome {	
    public boolean isPalindrome(String s) {
        if (s == " " || s.length() == 1) {
        	return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

//        
//        [^a-zA-Z0-9]:
//        	[^...]: This is a negated character class, which matches any character that is not in the specified set.
//        	a-z: Matches any lowercase letter.
//        	A-Z: Matches any uppercase letter.
//        	0-9: Matches any digit.
        
        System.out.print("s= " +s);
        
        for (int i = 0, j = s.length()-1; i <= s.length() / 2 && j >= s.length() / 2; i++ , j--) {
        	System.out.println("I= " +i + " J= " + j);
        	System.out.println(s.charAt(i) +" vs " + s.charAt(j));
        	if (s.charAt(i) != s.charAt(j)) {
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
    	ValidPalindrome vp = new ValidPalindrome();
    	String s = "r.ace, a, car:";
    	vp.isPalindrome(s);
    }
}
