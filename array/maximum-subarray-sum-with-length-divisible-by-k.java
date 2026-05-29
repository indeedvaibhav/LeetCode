class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPref = new long[k];

        // initialize to +∞
        Arrays.fill(minPref, Long.MAX_VALUE);

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        // prefix sum at index 0
        minPref[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix += nums[i - 1];
            int r = i % k;

            if (minPref[r] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix - minPref[r]);
            }

            // update minimum prefix for this remainder group
            minPref[r] = Math.min(minPref[r], prefix);
        }

        return ans;
    }
}
