class Solution {
    public int minimumCost(int[] cost) {
        int total = 0;
        int i = 0;
        if (cost.length == 1)
            return cost[0];
        if (cost.length == 2)
            total = cost[0] + cost[1];
        cost = Arrays.stream(cost)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        while (i < cost.length && (i + 1) < cost.length) {
            int sum = cost[i] + cost[i + 1];
            total = total + sum;

            if ((i + 3) <= cost.length)
                i += 3;
        }
        return total;

    }
}