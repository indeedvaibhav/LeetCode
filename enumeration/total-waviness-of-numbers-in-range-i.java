class Solution {
    public int totalWaviness(int l, int r) {
        int total = 0;

        for (int num = l; num <= r; num++) {
            String s = String.valueOf(num);

            for (int i = 1; i < s.length() - 1; i++) {
                char left = s.charAt(i - 1);
                char curr = s.charAt(i);
                char right = s.charAt(i + 1);

                // Peak
                if (left < curr && curr > right) {
                    total++;
                }
                // Valley
                else if (left > curr && curr < right) {
                    total++;
                }
            }
        }

        return total;
    }
}