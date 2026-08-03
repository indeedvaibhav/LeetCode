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
    TreeNode pred=null;
    TreeNode head=null;
    public TreeNode increasingBST(TreeNode root) {
        return inorder(root);
        
    }
    public TreeNode inorder(TreeNode node)
    {
        if(node==null) return null;

        inorder(node.left);
        if(pred==null)
        {
            head=node;
            head.left=null;
        }
        else
            {
                pred.right=node;
                pred.left=null;
            }
            pred=node;
            pred.right==null;

        inorder(node.right);
        return head;
    }
}