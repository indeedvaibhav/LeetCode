class Solution {
    public int[] nextGreaterElements(int[] nums) {
       HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums.length-1) {
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    map.put(stack.pop(), nums[i]);
                }
                stack.push(nums[i]);
            }
            else
            {
                int x=i%nums.length;
                while(x<nums.length-1)
                {
                    if(nums[i]>stack.peek())
                        map.put(stack.pop(), nums[i]);
                }
            }
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(),-1);
        }

        int[] ans= new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}