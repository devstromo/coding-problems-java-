package com.devstromo.medium.p122;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public int maxProfitBest(int[] prices) {
        int[] nextDay = {0, 0};
        for (int day = prices.length - 1; day >= 0; day--) {
            nextDay[1] = Math.max(nextDay[0] - prices[day], nextDay[1]);
            nextDay[0] = Math.max(nextDay[1] + prices[day], nextDay[0]);
        }
        return nextDay[1];
    }
}
