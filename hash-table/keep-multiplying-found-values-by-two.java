class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {if(original==nums[j])
        original*=2;}
        
    }
    return original;
    }
}