//According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
//
//The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
//
//Any live cell with fewer than two live neighbors dies as if caused by under-population.
//Any live cell with two or three live neighbors lives on to the next generation.
//Any live cell with more than three live neighbors dies, as if by over-population.
//Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
//The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
//
//		Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
//				Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
//						
//						Input: board = [[1,1],[1,0]]
//								Output: [[1,1],[1,1]]
		
package Matrix;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] nextGen = new int[m*n];
        
        int index = 0;
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.println("I="+i+" J="+j + " index=" + index);
        		helper(i, j, m, n, board, nextGen, index++);
        	}
        }
        print1D(nextGen);
        int k = 0;
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		board[i][j] = nextGen[k];       		
        		k++;
        	}
        }
        print2D(board);
    }
    
    private int[] helper(int i, int j, int m, int n, int[][] board, int[] nextGen, int index) {
    	int nei = 0;

    	if (i-1 >= 0 && j-1 >= 0) {
    		if (board[i-1][j-1] == 1) {
    			nei++;
    		}
    	}
    	if (i-1 >= 0 && j >= 0) {
    		if (board[i-1][j] == 1) {
    			nei++;
    		}
    	}
    	if (i >= 0 && j-1 >= 0) {
    		if (board[i][j-1] == 1) {
    			nei++;
    		}
    	}
    	if (i+1 < m && j+1 < n) {
    		if (board[i+1][j+1] == 1) {
    			nei++;
    		}
    	}
    	if (i < m && j+1 <n) {
    		if (board[i][j+1] == 1) {
    			nei++;
    		}
    	}
    	if (i+1 < m && j < n) {
    		if (board[i+1][j] == 1) {
    			nei++;
    		}
    	}
    	if (i-1 >=0 && j+1 < n) {
    		if (board[i-1][j+1] == 1) {
    			nei++;
    		}
    	}
    	if (i+1 < m && j-1 >= 0) {
    		if (board[i+1][j-1] == 1) {
    			nei++;
    		}
    	}
    	
    	System.out.println("nei=" + nei);
    	if (nei < 2 && board[i][j] == 1) {
    		nextGen[index] = 0;
    	}else if ((nei == 2 || nei == 3) && board[i][j] == 1) {
    		nextGen[index] = 1;
    	}else if (nei > 3 && board[i][j] == 1) {
    		nextGen[index] = 0;
    	}else if (nei == 3 && board[i][j] == 0) {
    		nextGen[index] = 1;
    	}
    	return nextGen;
    }
    private void print1D(int[] arr) {
    	System.out.println();
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i]+ ", ");
    	}
    	System.out.println();
    }
    private void print2D(int[][] arr) {
    	System.out.println();
    	for (int i = 0; i < arr.length;i++) {
    		System.out.println();
    		for (int j = 0; j < arr[0].length; j++) {
    			System.out.print(arr[i][j]+ ", ");
    		}
    	}
    	System.out.println();
    }
    
//    public void gameOfLife(int[][] board) {
//        final int m = board.length;
//        final int n = board[0].length;
//
//        for (int i = 0; i < m; ++i)
//          for (int j = 0; j < n; ++j) {
//            int ones = 0;
//            for (int x = Math.max(0, i - 1); x < Math.min(m, i + 2); ++x)
//              for (int y = Math.max(0, j - 1); y < Math.min(n, j + 2); ++y)
//                ones += board[x][y] & 1;
//            // Any live cell with two or three live neighbors lives on to the next
//            // generation.
//            if (board[i][j] == 1 && (ones == 3 || ones == 4))
//              board[i][j] |= 0b10;
//            // Any dead cell with exactly three live neighbors becomes a live cell,
//            // as if by reproduction.
//            if (board[i][j] == 0 && ones == 3)
//              board[i][j] |= 0b10;
//          }
//
//        for (int i = 0; i < m; ++i)
//          for (int j = 0; j < n; ++j)
//            board[i][j] >>= 1;
//      }
    
    public static void main(String[] args) {
    	GameOfLife gl = new GameOfLife();
    	int[][] arr = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
    	gl.gameOfLife(arr);
    }
}
