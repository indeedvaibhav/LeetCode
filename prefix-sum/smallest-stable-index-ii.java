class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return -1;

        int[] prefixMax = buildPrefixMax(nums);
        int[] suffixMin = buildSuffixMin(nums);

        for (int i = 0; i < n; i++) {
            if ((long) prefixMax[i] - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }

    private int[] buildPrefixMax(int[] nums) {
        int[] prefixMax = new int[nums.length];
        prefixMax[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        return prefixMax;
    }

    private int[] buildSuffixMin(int[] nums) {
        int[] suffixMin = new int[nums.length];
        suffixMin[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        return suffixMin;
    }
}