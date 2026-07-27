class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

       int count=0;
        int product=1,left=0;
        if (k <= 1)
            return 0;
        for(int right=0;right<=nums.length-1;right++)
        {
            int windowLength=0;
            product*= nums[right];
            while(product>=k)
            {
                product= product /  nums[left];
                left++;
            }
            windowLength=right-left+1;
            count+=windowLength;
        }
        return count;
    }
}