package com.devstromo.dp.min_cost_path;

import static java.lang.Math.min;


public class MinCostPath {

    public int recursive(int[][] costs) {
        return minCost(costs, costs.length - 1, costs[0].length - 1);
    }

    public int dp2D(int[][] costs) {
        return minCostDP(costs, costs.length - 1, costs[0].length - 1);
    }

    private int minCostDP(int[][] cost, int m, int n) {
        var dp = new int[m+1][n+1];

        dp[0][0] = cost[0][0];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i-1][0] + cost[i][0];
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j-1] + cost[0][j];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = cost[i][j] + min(
                        min(dp[i-1][j-1], dp[i-1][j]),
                        dp[i][j-1]
                );
            }
        }

        return dp[m][n];
    }

    private int minCost(int[][] costs, int m, int n) {
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0 && m == 0) {
            return costs[m][n];
        }
        return min(min(minCost(costs, m - 1, n - 1), minCost(costs, m - 1, n)), minCost(costs, m, n - 1)) + costs[m][n];
    }
}
