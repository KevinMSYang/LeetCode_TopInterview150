//Question: 100
//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

package BinaryTreeGeneral;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p == null || q == null) {
    		return  p == q;
    	}
    	return p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
