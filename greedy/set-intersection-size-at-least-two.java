class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        
        // Sort intervals
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int p1 = -1, p2 = -1; // last two added points
        int count = 0;

        for (int[] in : intervals) {
            int left = in[0], right = in[1];

            boolean hasP1 = (p1 >= left && p1 <= right);
            boolean hasP2 = (p2 >= left && p2 <= right);

            if (hasP1 && hasP2) {
                // already have 2 points in interval
                continue;
            }

            if (hasP1 || hasP2) {
                // only one of them is inside → need 1 more point
                count++;
                int newPoint = right;
                
                // Update p1 and p2
                if (p1 > p2) {
                    p2 = newPoint;
                } else {
                    p1 = p2;
                    p2 = newPoint;
                }

            } else {
                // none are inside → need 2 points
                count += 2;
                p1 = right - 1;
                p2 = right;
            }
        }

        return count;
    }
}
