class Solution {
    public int calculate(String s) {
        int[] idx = { 0 };
        return solve(s, idx);
    }

    public int solve(String s, int[] idx) {
        int num = 0, ans = 0, sign = +1;

        while (idx[0] < s.length()) {

            if (s.charAt(idx[0]) == ' ') {
                idx[0]++;
                continue; 
            }

            if (idx[0] < s.length()) {

                while (idx[0] < s.length() && Character.isDigit(s.charAt(idx[0]))) {
                    num = num * 10 + (s.charAt(idx[0]) - '0');
                    idx[0]++;
                }

                if (idx[0] >= s.length()) {
                    break;
                }

                if (s.charAt(idx[0]) == '+') {
                    ans += sign * num;
                    sign = +1;
                    num = 0;
                    idx[0]++;
                }

                else if (s.charAt(idx[0]) == '-') {
                    ans += sign * num;
                    sign = -1;
                    num = 0;
                    idx[0]++;
                }

                else if (s.charAt(idx[0]) == '(') {
                    idx[0]++;
                    num = solve(s, idx);
                }

                else if (s.charAt(idx[0]) == ')') {
                    ans += sign * num;
                    idx[0]++; 
                    return ans;
                }
            }
        }

        ans += sign * num;
        return ans;
    }
}