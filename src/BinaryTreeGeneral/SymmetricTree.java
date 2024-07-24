//Question: 101
//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

package BinaryTreeGeneral;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }
    private boolean helper (TreeNode l, TreeNode r) {
    	if (l == null || r == null) {
    		return l == r;
    	}
    	return l.val == r.val && helper(l.left, r.right) && helper(l.right, r.left);
    }
}
