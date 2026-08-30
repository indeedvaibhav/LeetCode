class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxIdx = 0;
        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        int pos1 = Math.min(maxIdx, minIdx);
        int pos2 = Math.max(maxIdx, minIdx);
       
        

        int leftOnly = pos2 + 1;
        int rightOnly = n - pos1;
        int bothSides = (pos1 + 1) + (n - pos2);

        return Math.min(leftOnly, Math.min(rightOnly, bothSides));
    }

}
