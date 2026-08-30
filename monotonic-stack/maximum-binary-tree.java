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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0)
            return null;

        int mid = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[mid]) {
                mid = i;
            }
        }
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, mid));
        TreeNode right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, mid + 1, nums.length));

        root.left = left;
        root.right = right;
        return root;
    }
}