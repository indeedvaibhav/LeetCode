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
    int maxDia=0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        dfs(root);
        return maxDia;


    }
    int dfs(TreeNode node)
    {
        if(node==null)
        return 0;
        int LP= dfs(node.left);
        int RP=dfs(node.right);
        int currDia=LP+RP;
        maxDia=Math.max(maxDia,currDia);
        return Math.max(LP,RP)+1;
    }
}