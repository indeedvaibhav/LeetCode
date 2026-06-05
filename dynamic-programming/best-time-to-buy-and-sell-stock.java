class Solution {
    public int maxProfit(int[] prices) {

    int maxProfit = 0;
    int min = prices[0];

    for(int i = 0; i < prices.length; i++)
    {
        int profit = prices[i] - min;

        if(profit > maxProfit)
            maxProfit = profit;

        if(prices[i] < min)
            min = prices[i];
    }

    return maxProfit;
}
}