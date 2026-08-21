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
    int totaltilt=0;
    public int findTilt(TreeNode root) {
        totaltilt(root);
        return totaltilt;
            
    }
    public int totaltilt(TreeNode root)
    {
        if(root==null)
            return 0;
        int leftSum= totaltilt(root.left);
        int rightSum= totaltilt(root.right);
        totaltilt+= Math.abs(leftSum-rightSum);

        return leftSum+rightSum+root.val;
    }
}