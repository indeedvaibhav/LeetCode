 import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public int findMaxK(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int n = nums.length;
        // Input elements
        Arrays.sort(nums);
        
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            for (int j = 0; j < n; j++) {
                if (nums[j] == target) {
                    return Math.abs(nums[i]);  
                }
            }
        }
        return -1;
    }
}

