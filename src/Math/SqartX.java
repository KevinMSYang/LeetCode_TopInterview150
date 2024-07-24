//Question:69
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
// 
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

package Math;

public class SqartX {
    public int mySqrt(int x) {
    	int base = 1;
    	while (helper(base) <= x) {
    		base += 1;
    	}
    	return base -1;
    }
    private int helper(int n) {
    	return n * n;
    }
    
//    public int mySqrt(long x) {
//        long l = 1;
//        long r = x + 1;
//
//        while (l < r) {
//          final long m = (l + r) / 2;
//          if (m > x / m)
//            r = m;
//          else
//            l = m + 1;
//        }
//
//        // l := the minimum number s.t. l * l > x
//        return (int) l - 1;
//      }
}