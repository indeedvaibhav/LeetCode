

class Solution {
    private int[][] maxST;
    private int[][] minST;
    private int[] lg;

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        // Precompute logarithms
        lg = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            lg[i] = lg[i / 2] + 1;
        }

        int maxLog = lg[n] + 1;
        maxST = new int[n][maxLog];
        minST = new int[n][maxLog];

        // Initialize sparse tables
        for (int i = 0; i < n; i++) {
            maxST[i][0] = nums[i];
            minST[i][0] = nums[i];
        }

        // Build sparse tables
        for (int j = 1; j < maxLog; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                maxST[i][j] = Math.max(
                    maxST[i][j - 1],
                    maxST[i + (1 << (j - 1))][j - 1]
                );

                minST[i][j] = Math.min(
                    minST[i][j - 1],
                    minST[i + (1 << (j - 1))][j - 1]
                );
            }
        }

        PriorityQueue<long[]> maxHeap =
            new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));

        // Push initial intervals
        for (int i = 0; i < n; i++) {
            long val = queryValue(i, n - 1);
            maxHeap.offer(new long[]{val, i, n - 1});
        }

        long totalValue = 0;

        // Extract top k values
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            long[] current = maxHeap.poll();

            long val = current[0];
            int l = (int) current[1];
            int r = (int) current[2];

            totalValue += val;

            if (l < r) {
                long nextVal = queryValue(l, r - 1);
                maxHeap.offer(new long[]{nextVal, l, r - 1});
            }
        }

        return totalValue;
    }

    private long queryValue(int l, int r) {
        int len = r - l + 1;
        int k = lg[len];

        int maximum = Math.max(
            maxST[l][k],
            maxST[r - (1 << k) + 1][k]
        );

        int minimum = Math.min(
            minST[l][k],
            minST[r - (1 << k) + 1][k]
        );

        return (long) maximum - minimum;
    }
}