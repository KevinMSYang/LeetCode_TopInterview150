//Question:50
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//
//
//
//Example 1:
//
//Input: x = 2.00000, n = 10
//Output: 1024.00000
//Example 2:
//
//Input: x = 2.10000, n = 3
//Output: 9.26100
//Example 3:
//
//Input: x = 2.00000, n = -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25

package Math;

public class PowXY {
    public double myPow(double x, int n) {
        if (n > 0) {
        	return helper(x, n);
        }
        else {
        	return -1;
        }
    }
    
    private double helper(double x, int n) {
    	double sum = 1.0;
    	for (int i = 0; i < n; i++) {
    		sum *= x;
    	}
    	return sum;
    }
    
    public static void main (String[] args) {
    	PowXY p = new PowXY();
    	System.out.println(p.myPow(2.10000, 3));
    }
}
