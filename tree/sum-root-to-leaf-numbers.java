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
    int totalSum=0,sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return sum;
        TreeNode node = root;
        if(node!=null)
        {
            sum=sum*10+node.val;
            totalSum+=sumNumbers(node.left);
            
        }
        
        
        sumNumbers(node.right);
        sum/=10;
        return totalSum;
       
        

    }
}