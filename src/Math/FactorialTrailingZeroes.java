//Question: 172
//Given an integer n, return the number of trailing zeroes in n!.
//
//Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
//
// 
//
//Example 1:
//
//Input: n = 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
//Example 2:
//
//Input: n = 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.
//Example 3:
//
//Input: n = 0
//Output: 0

package Math;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
    	long sum = helper(n);
    	if (sum == 0) {
    		return 0;
    	}
    	int numZero = 0;
    	String str = String.valueOf(sum);
    	char z = '0';
    	for (int i = str.length()-1; i >= 0 ; i--) {
    		if (str.charAt(i) == z) {
    			numZero++;
    		}
    		else {
    			break;
    		}
    	}
    	return numZero;
    }
    private long helper(int n) {
    	if (n == 0) {
    		return 1;
    	}
    	return n * helper(n-1);
    }
    
//    public int trailingZeroes(int n) {
//        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
//      }
    
//    public int trailingZeroes(int n) {
//        int count=0;
//        while(n>=5){
//            n/=5;
//            count+=n;
//        }
//        return count;
//    }
    
    
    public static void main(String[] args) {
    	FactorialTrailingZeroes ft = new FactorialTrailingZeroes();
    	System.out.println(ft.trailingZeroes(30));
    }
}
