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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder.length==0)
         return null;
         int root= preorder[0];
         if (preorder.length == 1)
            return new TreeNode(preorder[0]);
         int leftRoot= preorder[1];
         int index= 0;
         for(int i= 0 ;i< postorder.length;i++)
         {
            if(leftRoot==postorder[i])
            index=i;
         }
         int mid= index+1;

        TreeNode node = new TreeNode(root);
        node.left=constructFromPrePost(Arrays.copyOfRange(preorder,1,mid+1),Arrays.copyOfRange(postorder,0,mid));
        node.right=constructFromPrePost(Arrays.copyOfRange(preorder,mid+1,postorder.length),Arrays.copyOfRange(postorder,mid,postorder.length-1));

        return node;

        
    }
}