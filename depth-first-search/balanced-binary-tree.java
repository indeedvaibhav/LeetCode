/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int height = 0;

    public boolean isBalanced(TreeNode root) {
        return height(root) != -2;
    }

    public int height(TreeNode node) {
        if (node == null)
            return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (leftHeight == -2 || rightHeight == -2 || Math.abs(leftHeight - rightHeight) > 1)
            return -2;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}