package com.devstromo.dp.min_cost_path;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * The {@code MinCostPath} class provides methods to calculate the minimum cost path
 * in a grid from the top-left corner to the bottom-right corner. Each cell in the grid
 * has an associated cost, and the goal is to find the path that minimizes the total cost.
 */
public class MinCostPath {

    /* Possible moves in 8 directions */
    private static final int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    private static final int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

    /**
     * Calculates the minimum cost path in a grid using a recursive approach.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     *                                  <p>
     *                                  Time Complexity: O(3^(m*n)), where m is the number of rows and n is the number of columns.
     *                                  Space Complexity: O(m*n) for the recursion stack.
     */
    public int recursive(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: costs array is null or empty.");
        }
        return minCost(costs, costs.length - 1, costs[0].length - 1);
    }

    /**
     * Calculates the minimum cost path in a grid using a memoized approach to optimize recursion.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     *                                  <p>
     *                                  Time Complexity: O(m*n), where m is the number of rows and n is the number of columns.
     *                                  Space Complexity: O(m*n) for the memoization table and recursion stack.
     */
    public int memoized(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: costs array is null or empty.");
        }
        int[][] memo = new int[costs.length][costs[0].length];
        for (int[] row : memo)
            Arrays.fill(row, -1);
        return minCostMemoized(costs, costs.length - 1, costs[0].length - 1, memo);
    }

    /**
     * Calculates the minimum cost path in a grid using a dynamic programming approach.
     *
     * @param costs a 2D array where {@code costs[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     *                                  <p>
     *                                  Time Complexity: O(m*n), where m is the number of rows and n is the number of columns.
     *                                  Space Complexity: O(m*n) for the DP table.
     */
    public int dp2D(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: costs array is null or empty.");
        }
        return minCostDP(costs, costs.length - 1, costs[0].length - 1);
    }

    /**
     * Calculates the minimum cost path in a grid using a space-optimized dynamic programming approach.
     *
     * @param cost a 2D array where {@code cost[i][j]} represents the cost to traverse cell (i, j)
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     * @throws IllegalArgumentException if the input array is null or empty
     *                                  <p>
     *                                  Time Complexity: O(m*n), where m is the number of rows and n is the number of columns.
     *                                  Space Complexity: O(1) since the input array is modified in place.
     */
    public int spaceOptimized(int[][] cost) {
        if (cost == null || cost.length == 0 || cost[0].length == 0) {
            throw new IllegalArgumentException("Invalid input: cost array is null or empty.");
        }
        return spaceOptimized(cost, cost.length, cost[0].length);
    }

    /**
     * Calculates the minimum cost path from the top-left corner to the bottom-right corner
     * of a cost matrix using Dijkstra's algorithm. This method explores paths in a grid
     * where movement can be in 8 possible directions.
     *
     * @param costs The 2D array representing the cost of entering each cell in the grid.
     * @return The minimum cost to reach the bottom-right corner from the top-left corner.
     * <p>
     * Time Complexity: O(V log V) where V is the number of vertices in the graph. In terms of
     * the grid, V = rows * cols. This complexity arises because in the worst case, every vertex
     * (cell in the grid) is processed in the priority queue. Inserting and removing elements
     * in a priority queue has a logarithmic time complexity and each vertex may be visited up
     * to 8 times due to 8 possible movements from each cell.
     * <p>
     * Space Complexity: O(V) where V = rows * cols, needed for maintaining the priority queue,
     * the 'dp' array for storing the minimum path costs, and the 'visited' array to keep track
     * of visited cells.
     */
    public int minCostPathDijkstra(int[][] costs) {
        int rows = costs.length;
        int cols = costs[0].length;

        var dp = new int[rows][cols]; // To store the accumulated cost of the path
        var visited = new boolean[rows][cols]; // To record if a cell has been visited

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                visited[i][j] = false;
            }
        }

        var pq = new PriorityQueue<Position>(Comparator.comparingInt(a -> a.cost));
        dp[0][0] = costs[0][0];
        pq.add(new Position(0, 0, dp[0][0]));

        while (!pq.isEmpty()) {
            Position cell = pq.poll();
            int x = cell.x;
            int y = cell.y;

            if (visited[x][y]) continue;
            visited[x][y] = true;

            for (var i = 0; i < 8; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (isValid(nextX, nextY, rows, cols) && !visited[nextX][nextY]) {
                    if (dp[nextX][nextY] > dp[x][y] + costs[nextX][nextY]) {
                        dp[nextX][nextY] = dp[x][y] + costs[nextX][nextY];
                        pq.add(new Position(nextX, nextY, dp[nextX][nextY]));
                    }
                }
            }
        }

        return dp[costs.length - 1][costs[0].length - 1];
    }

    public int minCostToMN(int[][] cost, int m, int n) {
        return spaceOptimized(cost, m, n);
    }

    /**
     * A helper method to calculate the minimum cost path using a space-optimized dynamic programming approach.
     *
     * @param cost a 2D array where {@code cost[i][j]} represents the cost to traverse cell (i, j)
     * @param m    the number of rows in the grid
     * @param n    the number of columns in the grid
     * @return the minimum cost to reach the bottom-right corner from the top-left corner
     */
    private int spaceOptimized(int[][] cost, int m, int n) {
        for (int i = 1; i < m; i++) {
            cost[i][0] += cost[i - 1][0];
        }
        for (int j = 1; j < n; j++) {
            cost[0][j] += cost[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cost[i][j] += Math.min(cost[i - 1][j - 1], Math.min(cost[i - 1][j], cost[i][j - 1]));
            }
        }

        return cost[m - 1][n - 1];
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

    /**
     * A helper method to calculate the minimum cost path using memoization to optimize recursion.
     *
     * @param cost a 2D array where {@code cost[i][j]} represents the cost to traverse cell (i, j)
     * @param m    the row index of the destination cell
     * @param n    the column index of the destination cell
     * @param memo a 2D array for memoization to store the minimum costs of subproblems
     * @return the minimum cost to reach cell (m, n) from the top-left corner
     */
    private int minCostMemoized(int[][] cost, int m, int n, int[][] memo) {
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
        else if (m == 0 && n == 0)
            return cost[m][n];
        if (memo[m][n] != -1)
            return memo[m][n];
        memo[m][n] = cost[m][n]
                + min(minCostMemoized(cost, m - 1, n - 1, memo),
                minCostMemoized(cost, m - 1, n, memo),
                minCostMemoized(cost, m, n - 1, memo));
        return memo[m][n];
    }

    private int min(int x, int y) {
        return Math.min(x, y);
    }

    private int min(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }

    private boolean isValid(int row, int col, int m, int n) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }

    record Position(
            int x,
            int y,
            int cost
    ) {
    }
}
