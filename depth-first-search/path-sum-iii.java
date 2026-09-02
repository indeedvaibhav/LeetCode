

class Solution {

    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) return 0;

        dfs(root, targetSum, 0);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }

    public void dfs(TreeNode root, int targetSum, long currentSum) {

        if (root == null) return;

        currentSum += root.val;

        if (currentSum == targetSum)
            count++;

        dfs(root.left, targetSum, currentSum);
        dfs(root.right, targetSum, currentSum);
    }
}