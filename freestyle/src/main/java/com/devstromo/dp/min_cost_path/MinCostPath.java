package com.devstromo.dp.min_cost_path;

/**
 * The {@code MinCostPath} class provides methods to calculate the minimum cost path
 * in a grid from the top-left corner to the bottom-right corner. Each cell in the grid
 * has an associated cost, and the goal is to find the path that minimizes the total cost.
 */
public class MinCostPath {

    /**
     * Calculates the minimum cost path in a grid using a recursive approach.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     * <p>
     * Time Complexity: O(3^(m*n)), where m is the number of rows and n is the number of columns.
     * Space Complexity: O(m*n) for the recursion stack.
     */
    public int recursive(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: costs array is null or empty.");
        }
        return minCost(costs, costs.length - 1, costs[0].length - 1);
    }

    /**
     * Calculates the minimum cost path in a grid using a dynamic programming approach.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     * <p>
     * Time Complexity: O(m*n), where m is the number of rows and n is the number of columns.
     * Space Complexity: O(m*n) for the DP table.
     */
    public int dp2D(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: costs array is null or empty.");
        }
        return minCostDP(costs, costs.length - 1, costs[0].length - 1);
    }

    /**
     * A helper method to calculate the minimum cost path using dynamic programming.
     *
     * @param cost a 2D array where {@code cost[i][j]} represents the cost to traverse cell (i, j)
     * @param m    the row index of the destination cell
     * @param n    the column index of the destination cell
     * @return the minimum cost to reach cell (m, n) from the top-left corner
     */
    private int minCostDP(int[][] cost, int m, int n) {
        var dp = new int[m + 1][n + 1];

        dp[0][0] = cost[0][0];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = cost[i][j] + min(
                        min(dp[i - 1][j - 1], dp[i - 1][j]),
                        dp[i][j - 1]
                );
            }
        }

        return dp[m][n];
    }

    /**
     * A helper method to calculate the minimum cost path using recursion.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @param m     the row index of the destination cell
     * @param n     the column index of the destination cell
     * @return the minimum cost to reach cell (m, n) from the top-left corner
     */
    private int minCost(int[][] costs, int m, int n) {
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0 && m == 0) {
            return costs[m][n];
        }
        return min(min(minCost(costs, m - 1, n - 1), minCost(costs, m - 1, n)), minCost(costs, m, n - 1)) + costs[m][n];
    }

    private int min(int x, int y) {
        return Math.min(x, y);
    }
}
