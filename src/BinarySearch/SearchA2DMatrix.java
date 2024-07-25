//Question:74
//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.

package BinarySearch;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;
        
        while (l < r) {
        	int m = (l + r) / 2;
        	if (matrix[m][0] > target) {
        		r = m;
        	}
        	else 
        	{
        		if (l + 1 == r) {
        			break;
        		}
        		l++;
        	}
        }
        for (int i = 0; i < matrix[l].length; i++) {
        	if (matrix[l][i] == target) {
        		return true;
        	}
        }
        return false;
    }
    
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix.length == 0)
//          return false;
//
//        final int m = matrix.length;
//        final int n = matrix[0].length;
//        int l = 0;
//        int r = m * n;
//
//        while (l < r) {
//          final int mid = (l + r) / 2;
//          final int i = mid / n;
//          final int j = mid % n;
//          if (matrix[i][j] == target)
//            return true;
//          if (matrix[i][j] < target)
//            l = mid + 1;
//          else
//            r = mid;
//        }
//
//        return false;
//      }
}
