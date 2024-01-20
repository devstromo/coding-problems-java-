package com.devstromo.dp.knapsack.knapsackWithBounds;

public class Solution {
    public int knapsackUnbounded(int n, int m, int[] wt, int[] profits) {
        int[][] dp = new int[n][m + 1];
        for (int capacity = 0; capacity <= m; capacity++) {
            if (wt[0] <= capacity) {
                dp[0][capacity] = (capacity / wt[0]) * profits[0];
            }
        }
        for (int item = 1; item < n; item++) {
            for (int capacity = 1; capacity <= m; capacity++) {
                int includeProfit = 0;
                int excludeProfit = dp[item - 1][capacity];
                if (wt[item] <= capacity) {
                    includeProfit = profits[item] + dp[item][capacity - wt[item]];
                }
                dp[item][capacity] = Math.max(includeProfit, excludeProfit);
            }
        }
        return dp[n - 1][m];
    }
}
