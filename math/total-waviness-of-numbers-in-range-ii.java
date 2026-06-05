class Solution {

    String num;
    Long[][][][][] dp;

    public long totalWaviness(long num1, long num2) {
        return count(num2) - count(num1 - 1);
    }

    private long count(long x) {

        if (x < 0) return 0;

        num = String.valueOf(x);

        dp = new Long[num.length()][11][3][2][2];

        return dfs(0, 10, 0, 1, 0);
    }

    private long dfs(int pos,
                     int prevDigit,
                     int direction,
                     int tight,
                     int started) {

        if (pos == num.length()) {
            return started == 1 ? 1 : 0;
        }

        if (dp[pos][prevDigit][direction][tight][started] != null) {
            return dp[pos][prevDigit][direction][tight][started];
        }

        int limit = (tight == 1)
                ? num.charAt(pos) - '0'
                : 9;

        long ans = 0;

        for (int digit = 0; digit <= limit; digit++) {

            int newTight =
                    (tight == 1 && digit == limit)
                    ? 1
                    : 0;

            if (started == 0 && digit == 0) {

                ans += dfs(
                        pos + 1,
                        10,
                        0,
                        newTight,
                        0
                );

                continue;
            }

            if (started == 0) {

                ans += dfs(
                        pos + 1,
                        digit,
                        0,
                        newTight,
                        1
                );

                continue;
            }

            if (direction == 0) {

                if (digit == prevDigit) continue;

                int newDirection =
                        (digit > prevDigit)
                        ? 1
                        : 2;

                ans += dfs(
                        pos + 1,
                        digit,
                        newDirection,
                        newTight,
                        1
                );

                continue;
            }

            if (direction == 1) {

                if (digit < prevDigit) {

                    ans += dfs(
                            pos + 1,
                            digit,
                            2,
                            newTight,
                            1
                    );
                }
            }

            else {

                if (digit > prevDigit) {

                    ans += dfs(
                            pos + 1,
                            digit,
                            1,
                            newTight,
                            1
                    );
                }
            }
        }

        return dp[pos][prevDigit][direction][tight][started] = ans;
    }
}