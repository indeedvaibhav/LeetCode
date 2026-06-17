class Solution {
    public char processStr(String s, long k) {

        long[] len = new long[s.length() + 1];

        // Forward pass: compute lengths
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                len[i + 1] = len[i] + 1;
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = len[i] * 2;
            } else { // %
                len[i + 1] = len[i];
            }
        }

        long finalLength = len[s.length()];

        if (k >= finalLength) {
            return '.';
        }

        // Backward pass: trace k back to its origin
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            long before = len[i];
            long after = len[i + 1];

            if (Character.isLowerCase(ch)) {

                // This character was appended at position "before"
                if (k == before) {
                    return ch;
                }

            } else if (ch == '#') {

                // String became original + original
                if (k >= before) {
                    k -= before;
                }

            } else if (ch == '%') {

                // Reverse operation
                k = before - 1 - k;

            } else if (ch == '*') {


            }
        }

        return '.';
    }}