class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] copy = nums.clone();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (copy[i] % k == 0)
                count++;

            for (int j = i + 1; j < nums.length; j++) {
                copy[j] += copy[j - 1];

                if (copy[j] % k == 0)
                    count++;
            }

            copy = nums.clone();
        }

        return count;
    }
}