package com.devstromo.medium.p931;

class Solution {

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, n);
        for (int i = 1; i < n; i++)
            for (int j = 0; j < n; j++)
                if (j == 0)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j], dp[i - 1][j + 1]);
                else if (j == n - 1)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                else
                    dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            if (dp[n - 1][i] < min)
                min = dp[n - 1][i];
        return min;
    }
}
