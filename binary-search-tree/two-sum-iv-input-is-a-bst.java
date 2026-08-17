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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> ans = inorderArray(root);
        int first=0;
        int second= ans.size()-1;

        while(first<second)
        {
            if((ans.get(first)+ans.get(second)==k))
                return true;
            else if((ans.get(first)+ans.get(second)>k))
                second--;
            else if((ans.get(first)+ans.get(second)<k))
                first++;
        }
        return false;

        
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