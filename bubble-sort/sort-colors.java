class Solution {
    public void sortColors(int[] nums) {

        int[] c = new int[3];

        // Count
        for (int i = 0; i < nums.length; i++) {
            c[nums[i]]++;
        }

        // Put elements back into nums
        int k = 0;

        for (int i = 0; i < c.length; i++) {
            while (c[i] > 0) {
                nums[k] = i;
                k++;
                c[i]--;
            }
        }
    }
}