class Solution {
    TreeNode LCA = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return LCA;
    }

    boolean dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return false;

        boolean LS = dfs(node.left, p, q);
        boolean RS = dfs(node.right, p, q);
        boolean CS = (node == p || node == q);

        int trueCount = (LS ? 1 : 0) + (RS ? 1 : 0) + (CS ? 1 : 0);

        if (trueCount >= 2 && LCA == null) {
            LCA = node;
        }

        return LS || RS || CS;
    }
}