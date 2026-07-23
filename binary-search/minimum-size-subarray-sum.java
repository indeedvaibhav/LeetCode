class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        if(nums.length==1 )
            return (target==nums[0])?1:0;

        int sum = 0, min = Integer.MAX_VALUE, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        int first = 0, last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(first <= last) {
                if ((nums[last] - nums[first]) == target) {
                    ans = last - first;
                    min = Math.min(min, ans);
                }
                if(first==last && nums[first]==target) {
                    ans = last - first+1;
                    min = Math.min(min, ans);

                }
                else if ((nums[last] - nums[first]) > target) {
                    ans = last - first;
                    min = Math.min(min, ans);

                }
                if (nums[first] < target)
                    first++;
                else if(nums[last]>target)
                    last--;
            }
            else
                break;

        }
        if (min == Integer.MAX_VALUE)
            return 0;
        else
            return min;


    }
}