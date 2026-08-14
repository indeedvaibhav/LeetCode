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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0)
            return null;

        int root = preorder[0];
        TreeNode node = new TreeNode(root);
        int mid = 0;
        for (int i = 1; i < preorder.length; i++) {
            if (preorder[i] > root) {
                mid = i;
                break;
            }
        }
        if(mid==0)
        {
            mid= preorder.length;
        }

        node.left = bstFromPreorder(Arrays.copyOfRange(preorder, 1, mid));
        node.right = bstFromPreorder(Arrays.copyOfRange(preorder, mid, preorder.length));

        return node;
    }
}