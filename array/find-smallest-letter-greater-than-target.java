class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
            int start = 0, end = letters.length - 1;
            while (start <=end) {
                int mid = start + (end - start) / 2;

                // If x greater, ignore left half
                if (target<letters[mid] )
                    end = mid - 1; 

                    // If x is smaller, ignore right half
                else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
        
    }
