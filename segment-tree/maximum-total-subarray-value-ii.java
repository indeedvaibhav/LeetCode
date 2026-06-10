class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int l = 0; l < n; l++) {
            int mn = nums[l];
            int mx = nums[l];

            for (int r = l; r < n; r++) {
                mn = Math.min(mn, nums[r]);
                mx = Math.max(mx, nums[r]);

                long val = (long) mx - mn;

                if (pq.size() < k) {
                    pq.offer(val);
                } else if (val > pq.peek()) {
                    pq.poll();
                    pq.offer(val);
                }
            }
        }

        long ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        return ans;
    }
}