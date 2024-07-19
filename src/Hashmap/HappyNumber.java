//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//
// 
//
//Example 1:
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//
//Input: n = 2
//Output: false

package Hashmap;

public class HappyNumber {
    public boolean isHappy(int n) {
    	/*The code uses the Floyd's Tortoise and Hare cycle detection algorithm to determine whether a number is happy.
    	 *This setup is part of Floyd's Tortoise and Hare algorithm where slow moves one step at a time and fast moves two steps at a time.
    	 */
    	int slow = helper(n);
    	int fast = helper(helper(n));
    	
    	while (slow != fast) {
    		slow = helper(slow);
    		System.out.println("slow="+slow);
    		fast = helper(helper(fast));
    		System.out.println("fast="+fast);
    	}
    	return slow == 1;
    }
    
    private int helper (int n) {
    	int sum = 0;
        while (n > 0) {
        	sum += Math.pow(n % 10, 2);
        	n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
    	HappyNumber hn = new HappyNumber();
    	int n = 19;
    	hn.isHappy(n);
    }
}
