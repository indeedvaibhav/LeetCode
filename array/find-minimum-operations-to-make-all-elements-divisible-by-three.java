class Solution {
    public int minimumOperations(int[] nums) {
        int min=0;
        int n=nums.length;
        for (int i=0;i<n;i++)
            {
                if(nums[i]%3==0) continue;
                else
                {
                    int k=3-nums[i];
                    k=k+nums[i];
                    if(k%3==0)
                        min++;
                }
                
                    
                
            }
        return min;
    }
}