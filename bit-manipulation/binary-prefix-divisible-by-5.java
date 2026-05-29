class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            long num = 0;
            for (int j = 0; j <= i; j++) {   // build prefix 0..i
                num = (num * 2 + nums[j]) % 5;
            }

            list.add(num == 0);
        }

        return list;
    }
}