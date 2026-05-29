class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int alen = nums1.length;
        int blen = nums2.length;
        int len = alen + blen;

        int[] result = new int[len];

        // Merge arrays
        for (int i = 0; i < alen; i++) {
            result[i] = nums1[i];
        }
        for (int i = 0; i < blen; i++) {
            result[alen + i] = nums2[i];
        }

        // Correct bubble sort
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        // Median calculation
        double median;
        int mid = len / 2;
        if (len % 2 == 0) {
            median = ((double)(result[mid - 1] + result[mid])) / 2.0;
        } else {
            median = result[mid];
        }

        return median;
    }
    
}