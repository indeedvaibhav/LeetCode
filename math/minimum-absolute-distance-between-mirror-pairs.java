class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                ans=Math.min(ans,i-map.get(nums[i]));
            }
            int rev= reverse(nums[i]);
            map.put(rev,i);
        }
        return ans==Integer.MAX_VALUE? -1:ans;
    }
    public int reverse(int x)
    {
        int sum=0;
        while(x!=0)
        {
            int t=x%10;
            sum=sum*10+t;
            x=x/10;
        }
        return sum;
    }
}