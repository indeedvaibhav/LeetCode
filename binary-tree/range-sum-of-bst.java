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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> ans = inorderArray(root);
        int i=0;
        while(ans.get(i)!=low)
            i++;
        int sum=0;
        while(ans.get(i)<=high)
        {
            sum+=ans.get(i);i++;
        }
        return sum;

        
    }
    public ArrayList<Integer> inorderArray(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> left = inorderArray(root.left);
        ArrayList<Integer> right = inorderArray(root.right);

        list.addAll(left);
        list.add(root.val);
        list.addAll(right);
        return list;

    }
}