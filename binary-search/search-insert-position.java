class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int u = nums.length - 1;

        while (l <= u) {
            int m = l + (u - l) / 2;

            if (nums[m] == target)
                return m;

            if (nums[m] < target)
                l = m + 1;
            else
                u = m - 1;
        }

        return l;
    }
}