class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int i=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(i<nums.length)
        {
            if(nums[i]<min)
{            min=nums[i];
}            if(nums[i]>max)
{            max=nums[i];
}            i++;
        }
        return (max-min)*k;
        
    }
}