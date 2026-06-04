class Solution {
    public int[] plusOne(int[] digits) {
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];
        }
        num=num+1;
        int length = (int) Math.log10(num) + 1;
        int[] ans = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            ans[i] = num % 10;
            num /= 10;
        }
        return ans;
    }
}