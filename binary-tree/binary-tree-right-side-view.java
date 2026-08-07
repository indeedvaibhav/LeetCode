import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // Base case: if the tree is empty, return an empty list
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while (!Q.isEmpty()) {
            // Get the size of the current level
            int level_size = Q.size();
            List<Integer> curr_level = new ArrayList<>();

            // Process all nodes at the current level
            for (int i = 0; i < level_size; i++) {
                // Dequeue a node
                TreeNode node = Q.poll();
                
                // Add the node's value to the current level list
                curr_level.add(node.val);

                // Enqueue the left child if it exists
                if (node.left != null) {
                    Q.add(node.left);
                }
                
                // Enqueue the right child if it exists
                if (node.right != null) {
                    Q.add(node.right);
                }
            }
            // After processing all nodes for this level, add the level list to the final answer
           ans.add(curr_level.get(curr_level.size() - 1));
        }
        return ans;
    }
}
