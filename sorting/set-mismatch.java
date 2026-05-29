class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Find duplicate
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 2) {     // exactly 2 -> duplicate
                result.add(nums[i]);
                break;             // only one duplicate exists
            }
        }

        // Find missing
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;
            for (int n : nums) {
                if (n == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }
        }

        result.add(missing);

        return new int[] { result.get(0), result.get(1) };
    }
}
