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
    
    public int countNodes(TreeNode root) {
        if(root==null) return 0;


        int leftH = leftheight(root.left);
        int rightH = rightheight(root.right);
        if(leftH==rightH)
            return (int)Math.pow(2,leftH+1)-1;

        return countNodes(root.left) + countNodes(root.right) +1;
        
    }
    public int leftheight(TreeNode node){

    int height = 0;

    while(node!=null)
        {
            height++;
            node = node.left;
        }

    return height;
    }
    public int rightheight(TreeNode node){

    int height = 0;

    while(node!=null)
        {
            height++;
            node = node.right;
        }

    return height;
    }

}