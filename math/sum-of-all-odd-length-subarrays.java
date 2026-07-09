class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        // Try every odd window size
        for (int k = 1; k <= n; k += 2) {

            // Calculate the first window sum
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }

            ans += windowSum;

            // Slide the window
            int left = 0;
            int right = k;

            while (right < n) {
                windowSum = windowSum - arr[left] + arr[right];
                ans += windowSum;

                left++;
                right++;
            }
        }

        return ans;
    }
}
