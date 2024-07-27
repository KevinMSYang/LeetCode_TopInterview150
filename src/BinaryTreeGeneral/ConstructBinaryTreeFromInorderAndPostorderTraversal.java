//Question: 106
//Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

package BinaryTreeGeneral;

import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	int[] inOrder;
	int[] postOrder;
	Map<Integer, Integer> map = new Hashmap<>();
	int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrder = inorder;
        postOrder = postorder;
        int n = inorder.length;
        index = n - 1;
        
        for (int i = 0; i < n; i++) {
        	map.put(inorder[i], i);
        }
        
        TreeNode root = dfs(0, n-1);
        return root;
    }
    
    private TreeNode dfs(int start, int end) {
    	if (start > end) {
    		return null;
    	}
    	
    	int curVal = postOrder[index--];
    	TreeNode cur = new TreeNode(curVal);
    	
    	int mid = map.get(curVal);
    	cur.right = dfs(mid+1, end);
    	
    	cur.left = dfs(start, mid-1);
    	
    	return cur;
    }
}
