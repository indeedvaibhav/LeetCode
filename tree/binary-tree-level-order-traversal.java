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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); 

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> Q = new LinkedList<>(); 
        Q.add(root); 

        while (!Q.isEmpty()) { 
            
            int level_size = Q.size();
            List<Integer> curr_level = new ArrayList<>(); 

            for (int i = 0; i < level_size; i++) {
                TreeNode node = Q.poll();
                curr_level.add(node.val); 

                if (node.left != null) {
                    Q.add(node.left);
                }
                if (node.right != null) {
                    Q.add(node.right);
                }
            }
            ans.add(curr_level);
        }
        return ans;
    }
}
