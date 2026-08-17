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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = inorderArray(root);
        int min =Integer.MAX_VALUE;
        for(int i=0;i<ans.size()-1;i++)
        {
            int minDiff= Math.abs(ans.get(i)-ans.get(i+1));
            min= Math.min(min,minDiff);
        }
        return min;
        
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