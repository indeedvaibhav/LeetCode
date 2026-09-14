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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = inorder(root1);
        List<Integer> list2 = inorder(root2);
        List<Integer> ans  = new ArrayList<>();
        ans.addAll(list1);
        ans.addAll(list2);
        Collections.sort(ans);
        return ans;
        
    }
    public List<Integer> inorder(TreeNode root){
        if(root==null) 
        return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        List<Integer> left = inorder(root.left);
        ans.add(root.val);
        List<Integer> right = inorder(root.right);

        ans.addAll(left);
        ans.addAll(right);
        return ans;


    }
}