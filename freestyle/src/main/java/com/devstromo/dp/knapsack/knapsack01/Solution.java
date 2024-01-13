package com.devstromo.dp.knapsack.knapsack01;

public class Solution {
    public int knapsack01(int n, int m, int[] wt, int[] profits) {
        int[][] dp = new int[n + 1][m + 1];
        int i, w;
        for (w = 0; w <= m; w++) {
            dp[0][w] = 0;
        }

        for (i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (i = 1; i <= n; i++) {
            for (w = 1; w <= m; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], profits[i - 1] + dp[i - 1][w - wt[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][m];
    }

}
