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
    public TreeNode pruneTree(TreeNode root) 
    {
        return dfs(root)==true? root : null;
    }
    public boolean dfs(TreeNode node)
    {
        if(node==null)
        return false;
        boolean LS=dfs(node.left);
        boolean RS=dfs(node.right);
        if(LS==false )
        node.left=null;
        if(RS==false)
        node.right=null;

        return LS||RS||(node.val==1);
    }
}