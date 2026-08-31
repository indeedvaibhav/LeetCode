class Solution {
    public String reversePrefix(String s, int k) {
        String x = s.substring(0, k);
        String rev= "";
        for (int i = x.length() - 1; i >= 0; i--) {
            rev += x.charAt(i);
        }

        rev= rev + s.substring(k);
        return rev;
    }
}