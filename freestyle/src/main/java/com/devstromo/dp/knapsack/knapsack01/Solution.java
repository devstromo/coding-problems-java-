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
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wt[i - 1]] + profits[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][m];
    }

    public int knapsack01With1DArray(int n, int m, int[] wt, int[] profits) {
        int[] dp = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = m; w >= 0; w--) {
                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]] + profits[i - 1]);
            }
        }
        return dp[m];
    }

    public int[] knapsack01Selected(int n, int m, int[] wt, int[] profits) {
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
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wt[i - 1]] + profits[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        int[] selectedItems = new int[n];
        w = m; // Start from the maximum capacity
        for (i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                selectedItems[i - 1] = 1;
                w -= wt[i - 1];
            } else {
                selectedItems[i - 1] = 0;
            }
        }

        return selectedItems;
    }

}
