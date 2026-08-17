/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        TreeNode curr = (root);
        if(curr== p || curr== q)
        return curr;
        TreeNode left= lowestCommonAncestor(curr.left, p,q);
        TreeNode right= lowestCommonAncestor(curr.right, p,q);

        if(left!=null && right!=null)
        return curr;
        if(left==null)
        return right;
        else 
        return left;
        
    }
}