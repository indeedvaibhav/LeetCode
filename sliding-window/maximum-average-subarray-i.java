class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int windowSum=0;
        for(int i=0;i<k;i++)
            windowSum+=nums[i];

        double maxSum=windowSum;

        for(int i=0;i<nums.length-k;i++)
        {
            windowSum=windowSum-nums[i]+nums[k+i];
            if(windowSum>maxSum)
                maxSum=windowSum;
        }
        return maxSum/k;
    }
}