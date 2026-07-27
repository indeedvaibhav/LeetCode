class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long product = 1; // use long to avoid int overflow
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product < k)
                    count++;
                else
                    break; // because all nums are positive
            }
        }
        return count;
    }
}