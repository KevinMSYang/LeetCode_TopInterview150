//Given an array of non-negative integers arr, you are initially positioned at start index of the array. 
//When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
//
//Notice that you can not jump outside of the array at any time.
//
// 
//
//Example 1:
//
//Input: arr = [4,2,3,0,3,1,2], start = 5
//Output: true
//Explanation: 
//All possible ways to reach at index 3 with value 0 are: 
//index 5 -> index 4 -> index 1 -> index 3 
//index 5 -> index 6 -> index 4 -> index 1 -> index 3 
//Example 2:
//
//Input: arr = [4,2,3,0,3,1,2], start = 0
//Output: true 
//Explanation: 
//One possible way to reach at index 3 with value 0 is: 
//index 0 -> index 4 -> index 1 -> index 3
//Example 3:
//
//Input: arr = [3,0,2,1,2], start = 2
//Output: false
//Explanation: There is no way to reach at index 1 with value 0.

package ArrayString;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {
	
	public boolean canReach(int[] arr, int start) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] seen = new boolean[arr.length];
		
		q.add(start);

		
		while (!q.isEmpty()) {
			int current = q.poll();
			
			if (arr[current] == 0) {
				return true;
			}
			
			if (seen[current]) {
				continue;
			}
			
			if (current + arr[current] < arr.length) {
				q.add(current + arr[current]);
			}
			if (current - arr[current] >= 0) {
				q.add(current - arr[current]);
			}
			
			seen[current] = true;
		}
		
		return false;
		
	}
//    public boolean canReach(int[] arr, int start) {
//        if (arr.length <= 1 && arr[0] != 0) {
//        	return false;
//        }
//        boolean seen[] = new boolean[arr.length];
//        return helper(arr, start, seen);
//    }
//    
//    public boolean helper (int[] arr, int index, boolean[] seen) {
//    	if (arr[index] == 0) {
//    		return true;
//    	}
//    	if (seen[index]) {
//    		return false;
//    	}
//    	seen[index] = true;
//    	
//    	if (index + arr[index] < arr.length) {
//    		return helper(arr, index + arr[index], seen);
//    	} 
//    	if (index - arr[index] >= 0) {
//    		return helper(arr, index - arr[index], seen);
//    	}
//    	return false;
//    }
    
    public static void main(String[] args) {
    	JumpGameIII jg = new JumpGameIII();
    	int[] arr = {3, 0, 2, 1, 2};
    	int start = 2;
    	System.out.println(jg.canReach(arr, start));
    }
}
