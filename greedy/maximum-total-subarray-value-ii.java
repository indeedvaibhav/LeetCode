
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        List<Long> values = new ArrayList<>();

        for (int l = 0; l < n; l++) {
            int mn = nums[l];
            int mx = nums[l];

            for (int r = l; r < n; r++) {
                mn = Math.min(mn, nums[r]);
                mx = Math.max(mx, nums[r]);

                values.add((long) (mx - mn));
            }
        }

        values.sort(Collections.reverseOrder());

        long ans = 0;
        for (int i = 0; i < k; i++) {
            ans += values.get(i);
        }

        return ans;
    }
}