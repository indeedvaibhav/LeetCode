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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return DFS(root,targetSum);
    }
    public boolean DFS(TreeNode root , int remainingSum)
    {
        if(root==null)
            return false;
        
        remainingSum -= root.val;
        if(root.left==null && root.right==null)
            return remainingSum==0;
        return DFS(root.left,remainingSum) || DFS(root.right,remainingSum);
        
    }
}