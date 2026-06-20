import java.util.Arrays;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        // If there are no restrictions, the last building can reach height n - 1
        if (restrictions == null || restrictions.length == 0) {
            return n - 1;
        }

        // Sort restrictions by building ID
        Arrays.sort(restrictions, (a, b) -> Integer.compare(a[0], b[0]));

        int m = restrictions.length;

        // Step 1: Forward Pass (Left to Right)
        // Ensure heights don't exceed what's possible starting from building 1 (height 0)
        int prevId = 1;
        int prevHeight = 0;
        for (int i = 0; i < m; i++) {
            int currentId = restrictions[i][0];
            int maxPossibleHeight = prevHeight + (currentId - prevId);
            restrictions[i][1] = Math.min(restrictions[i][1], maxPossibleHeight);
            prevId = currentId;
            prevHeight = restrictions[i][1];
        }

        // Step 2: Backward Pass (Right to Left)
        // Propagate restrictions backwards since a later restrictive building limits earlier ones
        for (int i = m - 2; i >= 0; i--) {
            int currentId = restrictions[i][0];
            int nextId = restrictions[i + 1][0];
            int nextHeight = restrictions[i + 1][1];
            int maxPossibleHeight = nextHeight + (nextId - currentId);
            restrictions[i][1] = Math.min(restrictions[i][1], maxPossibleHeight);
        }

        // Step 3: Calculate Max Height Between Restricted Buildings
        int maxGlobalHeight = 0;
        prevId = 1;
        prevHeight = 0;

        for (int i = 0; i < m; i++) {
            int currentId = restrictions[i][0];
            int currentHeight = restrictions[i][1];
            
            // Calculate the peak height that can be achieved between prevId and currentId
            int peak = (prevHeight + currentHeight + (currentId - prevId)) / 2;
            maxGlobalHeight = Math.max(maxGlobalHeight, peak);
            
            prevId = currentId;
            prevHeight = currentHeight;
        }

        // Step 4: Handle the remaining buildings up to 'n' after the last restricted building
        int lastRestrictedId = restrictions[m - 1][0];
        int lastRestrictedHeight = restrictions[m - 1][1];
        int endPeak = lastRestrictedHeight + (n - lastRestrictedId);
        maxGlobalHeight = Math.max(maxGlobalHeight, endPeak);

        return maxGlobalHeight;
    }
}
