class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left=0,right=1;
        int maxCount=Integer.MIN_VALUE,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length==1) return 1;
            if(nums[left]<nums[right])
            {
                count+=1;
                if((left+1)<nums.length && (right+1)<nums.length) {
                    left++;
                    right++;
                }
            }
            else {
                count += 1;
                maxCount = Math.max(maxCount, count);
                count = 0;
                if((left+1)<nums.length && (right+1)<nums.length) {
                    left++;
                    right++;
                }
            }
        }

        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}