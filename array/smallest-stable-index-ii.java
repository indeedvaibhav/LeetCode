class Solution {
    public int firstStableIndex(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++)
        {
            int max = getMax(nums, 0, i);
            int min = getMin(nums, i, nums.length - 1);

            if((max - min) <= k) 
                return i;
        }

        return -1;
    }

    public int getMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;

        for(int i = start; i <= end; i++)
        {
            if(nums[i] > max)
                max = nums[i];
        }

        return max;
    }

    public int getMin(int[] nums, int start, int end) {
        int min = Integer.MAX_VALUE;

        for(int i = start; i <= end; i++)
        {
            if(nums[i] < min)
                min = nums[i];
        }

        return min;
    }
}