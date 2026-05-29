public class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        // dp[c][rem] = number of ways to reach current row's column c with remainder rem
        int[][] dp = new int[n][k];

        // initialize for (0,0)
        dp[0][grid[0][0] % k] = 1;

        // first row (only from left)
        for (int c = 1; c < n; c++) {
            int val = grid[0][c];
            int[][] newDpTemp = new int[1][k]; // temporary to compute dp[c]
            for (int rem = 0; rem < k; rem++) {
                if (dp[c-1][rem] != 0) {
                    int newRem = (rem + val) % k;
                    newDpTemp[0][newRem] = (newDpTemp[0][newRem] + dp[c-1][rem]) % MOD;
                }
            }
            dp[c] = newDpTemp[0];
        }

        // process remaining rows
        for (int r = 1; r < m; r++) {
            // newRow[c][rem] will replace dp[c] after processing the row
            int[][] newRow = new int[n][k];

            // column 0 for this row: can only come from top (dp[0])
            int val0 = grid[r][0];
            for (int rem = 0; rem < k; rem++) {
                if (dp[0][rem] != 0) {
                    int newRem = (rem + val0) % k;
                    newRow[0][newRem] = (newRow[0][newRem] + dp[0][rem]) % MOD;
                }
            }

            // remaining columns: from top (dp[c]) and from left (newRow[c-1])
            for (int c = 1; c < n; c++) {
                int val = grid[r][c];

                // from top (old dp[c])
                for (int rem = 0; rem < k; rem++) {
                    int ways = dp[c][rem];
                    if (ways != 0) {
                        int newRem = (rem + val) % k;
                        newRow[c][newRem] = (newRow[c][newRem] + ways) % MOD;
                    }
                }
                // from left (newRow[c-1])
                for (int rem = 0; rem < k; rem++) {
                    int ways = newRow[c-1][rem];
                    if (ways != 0) {
                        int newRem = (rem + val) % k;
                        newRow[c][newRem] = (newRow[c][newRem] + ways) % MOD;
                    }
                }
            }

            // move newRow into dp for next iteration
            dp = newRow;
        }

        // answer is number of ways to reach bottom-right with remainder 0
        return dp[n-1][0];
    }
}
