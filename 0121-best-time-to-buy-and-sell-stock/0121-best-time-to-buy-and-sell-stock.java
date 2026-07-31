class Solution {
    public int maxProfit(int[] prices) {
         int buyPrices = Integer.MAX_VALUE;
         int profit = 0;
        for (int i = 0; i < prices.length; i++) {
           if (buyPrices > prices[i]) {
            buyPrices = prices[i];
           }
           else {
           int currentProfit = prices[i] - buyPrices;
           profit = Math.max(profit, currentProfit);
           }
        }
        return profit;
    }
}