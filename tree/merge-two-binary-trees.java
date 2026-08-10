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
        
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
        return null;
        TreeNode ans = new TreeNode();
        if(root1 == null) ans.val= root2.val;
        if(root2 == null) ans.val= root1.val;

        ans.val = root1.val + root2.val;
        ans.left = mergeTrees(root1.left, root2.left);
        ans.right = mergeTrees(root1.right, root2.right);

        

        return ans;
    }
}