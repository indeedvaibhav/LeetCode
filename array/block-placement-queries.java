import java.util.*;

class Solution {
    public List<Boolean> getResults(int[][] queries) {
        TreeSet<Integer> obstacles = new TreeSet<>();
        List<Boolean> result = new ArrayList<>();

        for (int[] q : queries) {

            // Type 1: Add obstacle
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }

            // Type 2: Check if block can fit
            else {
                int x = q[1];
                int sz = q[2];

                int prev = 0;
                boolean canPlace = false;

                for (int obs : obstacles) {
                    if (obs > x) break;

                    int gap = obs - prev;

                    if (gap >= sz) {
                        canPlace = true;
                        break;
                    }

                    prev = obs;
                }

                // Check last gap from last obstacle to x
                if (!canPlace && x - prev >= sz) {
                    canPlace = true;
                }

                result.add(canPlace);
            }
        }

        return result;
    }
}