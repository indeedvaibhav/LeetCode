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
    TreeNode head = null, pred = null;

    public void flatten(TreeNode root) {
        preOrder(root);
        TreeNode curr = head;
        while (curr != null) {
            System.out.println(curr.val );
            System.out.print((curr.left == null ? "null" : curr.left.val));
            System.out.print(curr.right == null ? "null" : curr.right.val);
            curr = curr.right;
        }

    }

    public TreeNode preOrder(TreeNode node) {
        if (node == null)
            return null;

        TreeNode left = node.left;
        TreeNode right = node.right;
        if (pred == null) {
            head = node;
            head.left = null;
        } else {
            pred.right = node;
            node.left = null;
        }
        pred = node;

        preOrder(left);
        preOrder(right);

        return head;

    }
}