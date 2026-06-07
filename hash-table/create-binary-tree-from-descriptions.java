class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(int[] desc : descriptions)
        {
            int parentVal = desc[0];
            int childVal = desc[1];
            int isLeft = desc[2];

            if(!map.containsKey(parentVal))
            {
                map.put(parentVal, new TreeNode(parentVal));
            }

            if(!map.containsKey(childVal))
            {
                map.put(childVal, new TreeNode(childVal));
            }

            TreeNode parentNode = map.get(parentVal);
            TreeNode childNode = map.get(childVal);

            if(isLeft == 1)
            {
                parentNode.left = childNode;
            }
            else
            {
                parentNode.right = childNode;
            }

            children.add(childVal);
        }

        for(Integer val : map.keySet())
        {
            if(!children.contains(val))
            {
                return map.get(val);
            }
        }

        return null;
    }
}