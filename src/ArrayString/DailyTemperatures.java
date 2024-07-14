//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//
// 
//
//Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
//Example 2:
//
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
//Example 3:
//
//Input: temperatures = [30,60,90]
//Output: [1,1,0]

package ArrayString;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
//    public int[] dailyTemperatures(int[] temperatures) {
//    	int[] ans = new int[temperatures.length];
//    	ans[ans.length-1] = 0;
//    	for (int i = 0; i < temperatures.length -1; i++) {
//    		int j = i + 1;
//    		while(j < temperatures.length) {
//    			if (temperatures[i] < temperatures[j]) {
//    				ans[i] = j-i;
//    				break;
//    			}
//    			j++;
//    		}
//    	}
//    	return ans;
//    }
    
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>(); // a decreasing stack

        for (int i = 0; i < temperatures.length; ++i) {
        	System.out.println("I= " + i);
          while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        	  System.out.println("current peek= " + stack.peek() + " current i= " + i);
        	  System.out.println("stack= " + stack);
            final int index = stack.pop();
            System.out.println("index = " + index);
            ans[index] = i - index;
          }
          stack.push(i);
          System.out.println("push i=" + i);
        }

        return ans;
      }
    
    public static void main(String[] args) {
    	DailyTemperatures dt = new DailyTemperatures();
    	int[] arr = {73,74,75,71,69,72,76};
    	dt.dailyTemperatures(arr);
    }
}
