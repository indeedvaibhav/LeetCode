import java.util.Arrays;

class Solution {
    // 3D array tracking total valid combinations for structural states
    // Memoization table structure:
    // [digit index][previous digit][pre-previous digit][is_tight flag][is_started flag]
    private long[][][][][] memoCount;
    
    // 3D array tracking the aggregated waviness contributions accumulated through transitions
    private long[][][][][] memoWaviness;

    public long totalWaviness(long num1, long num2) {
        // Standard prefix sum approach: totalWaviness[num1, num2] = count(num2) - count(num1 - 1)
        return getWavinessUpTo(num2) - getWavinessUpTo(num1 - 1);
    }

    private long getWavinessUpTo(long n) {
        if (n < 100) {
            return 0; // Numbers with fewer than 3 digits have a waviness of 0
        }
        
        String s = Long.toString(n);
        int len = s.length();
        
        // Initialize state tracking grids
        memoCount = new long[len][11][11][2][2];
        memoWaviness = new long[len][11][11][2][2];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 10; k++) {
                    Arrays.fill(memoCount[i][j][k][0], -1);
                    Arrays.fill(memoCount[i][j][k][1], -1);
                    Arrays.fill(memoWaviness[i][j][k][0], -1);
                    Arrays.fill(memoWaviness[i][j][k][1], -1);
                }
            }
        }
        
        // Compute transitions tracking state values
        long[] result = solve(0, 10, 10, 1, 0, s);
        return result[1];
    }

    /**
     * Recursive Digit DP method returning a 2-element long array:
     * index 0 -> total combinations of numbers matching the pattern criteria
     * index 1 -> total aggregated waviness within those generated paths
     */
    private long[] solve(int idx, int prev, int prevPrev, int isTight, int isStarted, String s) {
        // Base Case: Reached the end of string length 
        if (idx == s.length()) {
            return new long[]{isStarted, 0};
        }

        // Return pre-calculated solutions if they exist
        if (memoCount[idx][prev][prevPrev][isTight][isStarted] != -1) {
            return new long[]{
                memoCount[idx][prev][prevPrev][isTight][isStarted],
                memoWaviness[idx][prev][prevPrev][isTight][isStarted]
            };
        }

        long totalWays = 0;
        long totalWavySum = 0;
        int limit = (isTight == 1) ? (s.charAt(idx) - '0') : 9;

        for (int d = 0; d <= limit; d++) {
            int nextTight = (isTight == 1 && d == limit) ? 1 : 0;
            int nextStarted = (isStarted == 1 || d > 0) ? 1 : 0;

            // Handle the transition state context
            int nextPrev = 10;
            int nextPrevPrev = 10;
            int localWavinessAdded = 0;

            if (nextStarted == 1) {
                // If sequence has already started, save current digit
                nextPrev = d;
                nextPrevPrev = prev;

                // Peak & Valley check requires a window of 3 preceding digits
                if (prevPrev != 10 && prev != 10) {
                    // Check if 'prev' is a peak or a valley relative to its immediate neighbors
                    if ((prev > prevPrev && prev > d) || (prev < prevPrev && prev < d)) {
                        localWavinessAdded = 1;
                    }
                }
            }

            // Recurse into the sub-problem
            long[] nextState = solve(idx + 1, nextPrev, nextPrevPrev, nextTight, nextStarted, s);
            
            long ways = nextState[0];
            long internalSum = nextState[1];

            totalWays += ways;
            // The local localWavinessAdded calculation at 'prev' impacts all successful terminal paths
            totalWavySum += internalSum + (ways * localWavinessAdded);
        }

        // Cache state matrices 
        memoCount[idx][prev][prevPrev][isTight][isStarted] = totalWays;
        memoWaviness[idx][prev][prevPrev][isTight][isStarted] = totalWavySum;

        return new long[]{totalWays, totalWavySum};
    }
}
