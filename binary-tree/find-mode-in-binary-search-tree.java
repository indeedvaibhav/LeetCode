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
    ArrayList<Integer> ans = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> ans = inorderArray(root);
        for (int num : ans) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public ArrayList<Integer> inorderArray(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> left = inorderArray(root.left);
        ArrayList<Integer> right = inorderArray(root.right);

        list.addAll(left);
        list.add(root.val);
        list.addAll(right);

        return list;
    }
}