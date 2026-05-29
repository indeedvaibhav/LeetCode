import java.util.Arrays;

class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        char[] str = s.toCharArray();
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        boolean down = true;
        int row = 0;

        if (numRows == 1) {
            return s;
        }

        // Traversing the array
        for (int i = 0; i < len; i++) {
            arr[row] += str[i];

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        // Join all strings in arr[] to form the final result
        StringBuilder result = new StringBuilder();
        for (String r : arr) {
            result.append(r);
        }

        return result.toString();
    }
}
