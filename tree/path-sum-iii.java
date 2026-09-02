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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;

        dfs(root,targetSum,0);

        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return count;
    }
    
    public void dfs(TreeNode root, int targetSum,int currentSum){

        if(root==null) return;

        
        currentSum += root.val;
        if(currentSum==targetSum) count++;
        dfs(root.left,targetSum,currentSum);
        dfs(root.right,targetSum,currentSum);

    }
}

