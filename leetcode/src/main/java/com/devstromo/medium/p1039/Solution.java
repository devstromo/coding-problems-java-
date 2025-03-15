package com.devstromo.medium.p1039;

import java.util.Arrays;

public class Solution {
    int[][] arr;

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        // Initialize DP table with -1 (meaning uncomputed states)
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return computeMinScore(values, 0, n - 1, dp);
    }

    public int minScoreTriangulationBest(int[] values) {
        arr = new int[values.length][values.length];
        return dfs(values, 0, values.length - 1);
    }

    private int dfs(int[] values, int i, int j) {
        if (i >= j - 1) return 0;
        if (arr[i][j] != 0) return arr[i][j];
        int sum = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            sum = Math.min(sum, values[i] * values[j] * values[k] + dfs(values, i, k) + dfs(values, k, j));
        }
        if (sum == Integer.MAX_VALUE) sum = 0;
        arr[i][j] = sum;
        return sum;
    }

    private int computeMinScore(int[] values, int i, int j, int[][] dp) {
        if (j - i < 2) return 0; // No triangulation possible

        if (dp[i][j] != -1) return dp[i][j]; // Return cached result

        int minScore = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) { // Choose k to form a triangle (i, k, j)
            int currentScore = values[i] * values[j] * values[k]
                    + computeMinScore(values, i, k, dp)
                    + computeMinScore(values, k, j, dp);
            minScore = Math.min(minScore, currentScore);
        }

        return dp[i][j] = minScore;
    }
}
