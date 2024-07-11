//You are given a 0-indexed binary string s and two integers minJump and maxJump. 
//In the beginning, you are standing at index 0, which is equal to '0'. 
//You can move from index i to index j if the following conditions are fulfilled:
//
//i + minJump <= j <= min(i + maxJump, s.length - 1), and
//s[j] == '0'.
//Return true if you can reach index s.length - 1 in s, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "011010", minJump = 2, maxJump = 3
//Output: true
//Explanation:
//In the first step, move from index 0 to index 3. 
//In the second step, move from index 3 to index 5.
//Example 2:
//
//Input: s = "01101110", minJump = 2, maxJump = 3
//Output: false

package ArrayString;

public class JumpGameVII {
//	public boolean canReach(String s, int minJump, int maxJump) {
//	    int count = 0;
//	    boolean dp[] = new boolean[s.length()];
//	    dp[0] = true;
//
//	    for (int i = minJump; i < s.length(); ++i) {
//	      count += dp[i - minJump] ? 1 : 0;
//	      if (i - maxJump > 0)
//	        count -= dp[i - maxJump - 1] ? 1 : 0;
//	      dp[i] = count > 0 && s.charAt(i) == '0';
//	    }
//
//	    return dp[dp.length - 1];
//	}
	
    public boolean canReach(String s, int minJump, int maxJump) {
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        boolean[] dp = new boolean[s.length()];
        dp[0] = true;
      
        for (int i = 0; i < arr.length-1; i++)
        {
        	int j = i + 1;
        	if (arr[i] == 0 && i + minJump <= j && j <= Math.min(i+maxJump, s.length()-1) ) {
        		i = j;
        		dp[i] = true;
        	}
        }
        return dp[arr.length-1];
    }
    
    public static void main(String[] args) {
    	JumpGameVII jg = new JumpGameVII();
    	String s = "011010";
    	int minJump = 2;
    	int maxJump = 5;
    	System.out.println(jg.canReach(s, minJump, maxJump));
    }
}
