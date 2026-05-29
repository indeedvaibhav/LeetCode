/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        // Use Long.MIN_VALUE and Long.MAX_VALUE to handle edge cases
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long lower, long upper) {
        // Base case: empty node is valid
        if (node == null) return true;

        // Check current node value against bounds
        if (node.val <= lower || node.val >= upper) return false;

        // Left subtree: upper bound becomes current node value
        // Right subtree: lower bound becomes current node value
        return dfs(node.left, lower, node.val) &&
               dfs(node.right, node.val, upper);
    }
}
