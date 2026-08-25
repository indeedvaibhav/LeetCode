class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x =getMax(nums);
        int ans=0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }
        for(int i=1;;i++)
        {
             int val= k*i;
            if(!set.contains(val) && val%k==0)
            {
                ans= val;
                break;
            }
            else 
                continue;

        }
        
        
        return ans;
    }
    public int getMax(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        for(int num: arr)
        {
            if(num>max)
                max=num;
        }
        return max;
    }
}