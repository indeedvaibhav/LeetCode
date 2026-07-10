class Solution {
    public int[] nextGreaterElements(int[] nums) {
       HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<nums2.length;i++)
        {
            if(i!=nums2.length-1) {
                while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                    map.put(stack.pop(), nums2[i]);
                }
                stack.push(nums2[i]);
            }
            else
            {
                int x=i%nums2.length;
                while(x<nums2.length-1)
                {
                    if(nums2[i]>stack.peek())
                        map.put(stack.pop(), nums2[i]);
                }
            }
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(),-1);
        }

        int[] ans= new int[nums2.length];
        for(int i=0;i< nums2.length;i++)
        {
            ans[i]=map.get(nums2[i]);
        }
        return ans;
    }
}