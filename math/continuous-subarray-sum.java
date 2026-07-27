class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    // Outer loop picks the starting element of the subarray
    for (int i = 0; i < nums.length; i++) {
        int sum = nums[i];
        
        // Inner loop extends the subarray to the right
        for (int j = i + 1; j < nums.length; j++) {
            sum += nums[j];
            
            // Handle k = 0 to avoid division by zero
            if (k == 0) {
                if (sum == 0) return true;
            } else {
                if (sum % k == 0) return true;
            }
        }
    }
    return false;
}

}