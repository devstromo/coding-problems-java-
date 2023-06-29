package com.devstromo.medium.p63;

class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        var n = obstacleGrid[0].length;
        var dp = new int[n];
        dp[0] = 1;
        for (var grid : obstacleGrid) {
            for (var j = 0; j < n; j++) {
                if (grid[j] == 1)
                    dp[j] = 0;
                else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }

    public static int uniquePathsWithObstaclesAnother(int[][] obstacleGrid) {
        var m = obstacleGrid.length;
        var n = obstacleGrid[0].length;
        var dp = new int[m][n];

        for (int i = 0; i < m; i++)
            if (obstacleGrid[i][0] == 1)
                break;
            else
                dp[i][0] = 1;
        for (int i = 0; i < n; i++)
            if (obstacleGrid[0][i] == 1)
                break;
            else
                dp[0][i] = 1;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        return dp[m - 1][n - 1];
    }
}
