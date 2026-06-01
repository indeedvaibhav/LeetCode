class Solution {
    public int minimumCost(int[] cost) {
        int total=0;
        int i=0;
        if(cost.length==1) return cost[0];
        if(cost.length==2) return (cost[0]+cost[1]);
        cost = Arrays.stream(cost)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        while(i<cost.length && (i+1)<cost.length)
        {
            int sum= cost[i]+cost[i+1];
            total=total+sum;    
            i+=3;
        }
        while(i<cost.length) {
            total = total + cost[i];
            i++;
        }
        return total;

    }
}