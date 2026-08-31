class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        
        int[] suffixSums = new int[n];
        suffixSums[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSums[i] = suffixSums[i + 1] + piles[i];
        }
        
        int[][] memo = new int[n][n + 1];
        
        return dfs(0, 1, suffixSums, memo);
    }
    
    private int dfs(int index, int M, int[] suffixSums, int[][] memo) {
        if (index >= suffixSums.length) {
            return 0;
        }
        
        if (index + 2 * M >= suffixSums.length) {
            return suffixSums[index];
        }
        
        if (memo[index][M] != 0) {
            return memo[index][M];
        }
        
        int maxStones = 0;
        
        for (int X = 1; X <= 2 * M; X++) {
            int opponentScore = dfs(index + X, Math.max(M, X), suffixSums, memo);
            int currentScore = suffixSums[index] - opponentScore;
            maxStones = Math.max(maxStones, currentScore);
        }
        
        return memo[index][M] = maxStones;
    }
}
