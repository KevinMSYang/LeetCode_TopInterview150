//Question:226
//Given the root of a binary tree, invert the tree, and return its root.

package BinaryTreeGeneral;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
        	return root;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        
        return root;
    }
}
