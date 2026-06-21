class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0, i = 0, sum = 0;
        Arrays.sort(costs);
        if (costs[0] > coins) return 0;

        while (i <= costs.length - 1) {
            max += costs[i];
            if(max<=coins)
                sum++;
            else break;
            i++;
        }
        return sum;
    }
}