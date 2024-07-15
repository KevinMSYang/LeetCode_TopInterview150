//Given an m x n matrix, return all elements of the matrix in spiral order.
//
//		Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//				Output: [1,2,3,6,9,8,7,4,5]		
//		
//						Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//								Output: [1,2,3,4,8,12,11,10,9,5,6,7]		
package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int r1 = 0;
        int c1 = 0;
        int r2 = matrix.length -1;
        int c2 = matrix[0].length -1;
        while (list.size() < matrix.length * matrix[0].length) {
        	for (int i = c1; i <= c2 && list.size() < matrix.length * matrix[0].length; i++) {
        		list.add(matrix[r1][i]);
        	}
        	for (int i = r1+1; i <= r2-1 && list.size() < matrix.length * matrix[0].length; i++) {
        		list.add(matrix[i][c2]);
        	}
        	for (int i = c2; i >= c1 && list.size() < matrix.length * matrix[0].length; i--) {
        		list.add(matrix[r2][i]);
        	}
        	for (int i = r2-1; i >= r1+1 && list.size() < matrix.length * matrix[0].length; i--) {
        		list.add(matrix[i][c1]);
        	}
        	r1++;
        	c1++;
        	r2--;
        	c2--;
        }
        return list;
        	
    }
    public static void main(String[] args) {
    	SpiralMatrix sm = new SpiralMatrix();
    	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    	sm.spiralOrder(arr);
    }
}
