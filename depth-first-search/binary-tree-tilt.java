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
    int ans=0,leftSum=0,rightSum=0;
    public int findTilt(TreeNode root) {
        return calcSum(root);
    }

    public int calcSum(TreeNode node)
    {
        leftSum = calcSum(node.left);
        rightSum= calcSum(node.right);
        int tilt = Math.abs(leftSum-rightSum);
        ans+=tilt;
        return leftSum+rightSum+node.val;
    }
}