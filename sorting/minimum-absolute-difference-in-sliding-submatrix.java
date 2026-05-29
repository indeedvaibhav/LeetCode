import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {

            TreeMap<Integer, Integer> freq = new TreeMap<>();
            TreeSet<Integer> set = new TreeSet<>();

            // build first window
            for (int x = i; x < i + k; x++) {
                for (int y = 0; y < k; y++) {
                    add(freq, set, grid[x][y]);
                }
            }

            for (int j = 0; j <= n - k; j++) {

                ans[i][j] = getMinDiff(set);

                if (j + 1 <= n - k) {

                    // remove left column
                    for (int x = i; x < i + k; x++) {
                        remove(freq, set, grid[x][j]);
                    }

                    // add right column
                    for (int x = i; x < i + k; x++) {
                        add(freq, set, grid[x][j + k]);
                    }
                }
            }
        }

        return ans;
    }

    private void add(TreeMap<Integer, Integer> freq, TreeSet<Integer> set, int val) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        set.add(val);
    }

    private void remove(TreeMap<Integer, Integer> freq, TreeSet<Integer> set, int val) {
        if (freq.get(val) == 1) {
            freq.remove(val);
            set.remove(val);
        } else {
            freq.put(val, freq.get(val) - 1);
        }
    }

    private int getMinDiff(TreeSet<Integer> set) {
        int min = Integer.MAX_VALUE;
        Integer prev = null;

        for (int num : set) {
            if (prev != null) {
                min = Math.min(min, num - prev);
                if (min == 0) return 0;
            }
            prev = num;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}