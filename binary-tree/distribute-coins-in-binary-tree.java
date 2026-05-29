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
    private int totalMoves = 0;

    /**
     * Main function to distribute coins and calculate the minimum moves.
     * @param root The root of the binary tree
     * @return The minimum number of moves
     */
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return totalMoves;
    }

    /**
     * Performs a post-order DFS to calculate the coin balance (excess/deficit) for each subtree.
     * The absolute value of the balance at each node contributes to the total moves.
     * @param node The current node
     * @return The net balance of coins for the subtree rooted at 'node'
     */
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the balance of left and right subtrees
        int leftBalance = dfs(node.left);
        int rightBalance = dfs(node.right);

        // The number of moves through the current node's edges is the sum of absolute balances from its children
        totalMoves += Math.abs(leftBalance) + Math.abs(rightBalance);

        // Calculate the balance for the current node to report to its parent.
        // Each node needs 1 coin.
        // Balance = coins at current node + balance from left + balance from right - 1 (for the coin that stays)
        return (node.val - 1) + leftBalance + rightBalance;
    }
}
