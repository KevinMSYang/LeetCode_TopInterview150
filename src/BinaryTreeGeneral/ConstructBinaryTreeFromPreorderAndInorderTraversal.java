//Question:105
//Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

package BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	int[] preOrder;
	int[] inOrder;
	Map<Integer, Integer> map = new HashMap<>();
	int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        inOrder = inorder;
        int n = preorder.length;
        
        for (int i = 0; i < n; i++) {
        	map.put(inorder[i], i);
        }
        ThreeNode root = dfs(0, n-1);
        return root;
    }
    private TreeNode dfs(int start, int end) {
    	if (start > end) {
    		return null;
    	}
    	
    	int curVal = preOrder[index++];
    	TreeNode cur = new TreeNode(curVal);
    	
    	int mid = map.get(curVal);
    	
    	cur.left = dfs(start, mid -1);
    	cur.right = dfs(mid + 1, end);
    	return cur;
    }
    
    
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        Map<Integer, Integer> inToIndex = new HashMap<>();
//
//        for (int i = 0; i < inorder.length; ++i)
//          inToIndex.put(inorder[i], i);
//
//        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inToIndex);
//      }
//
//      private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,
//                             int inEnd, Map<Integer, Integer> inToIndex) {
//        if (preStart > preEnd)
//          return null;
//
//        final int rootVal = preorder[preStart];
//        final int rootInIndex = inToIndex.get(rootVal);
//        final int leftSize = rootInIndex - inStart;
//
//        TreeNode root = new TreeNode(rootVal);
//        root.left = build(preorder, preStart + 1, preStart + leftSize, inorder, inStart,
//                          rootInIndex - 1, inToIndex);
//        root.right = build(preorder, preStart + leftSize + 1, preEnd, inorder, rootInIndex + 1, inEnd,
//                           inToIndex);
//
//        return root;
//      }
}
