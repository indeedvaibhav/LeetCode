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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>();
        Set<Integer> Children= new HashSet<>();

        for(int[] desc: descriptions)
        {
            int parentVal=desc[0];
            int childVal=desc[1];
            int isLeft=desc[2];

            if(!map.containsKey(parentVal))
            {
                map.put(parentVal,new TreeNode(parentVal));
            }
            if(!map.containsKey(childVal))
            {
                map.put(childVal,new TreeNode(childVal));
            }
            TreeNode parentNode=map.get(parentVal);
            TreeNode childNode=map.get(childVal);
            
            if(isLeft==1)
            {
                parentNode.left=childVal;
            }
            else
            {
                parentNode.right=childVal;
            }
            children.add(childVal);
        }
        for(Integer val: map.keySet())
        {
            if(!Children.conatins(val))
            {
                return val;
            }
        }
        return null;    
    }
}