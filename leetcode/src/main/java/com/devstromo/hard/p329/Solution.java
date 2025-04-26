package com.devstromo.hard.p329;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int rows, cols;

    public int longestIncreasingPath(int[][] matrix) {
        rows = matrix.length;
        cols = matrix[0].length;
        int[][] memo = new int[rows][cols];
        int maxPath = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                maxPath = Math.max(maxPath, dfs(matrix, r, c, memo));
            }
        }

        return maxPath;
    }

    private int dfs(int[][] matrix, int r, int c, int[][] memo) {
        if (memo[r][c] != 0) return memo[r][c];

        int maxLength = 1; // Start with 1 (itself)
        for (int[] dir : directions) {
            int newRow = r + dir[0];
            int newCol = c + dir[1];

            if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    matrix[newRow][newCol] > matrix[r][c]) {
                int length = 1 + dfs(matrix, newRow, newCol, memo);
                maxLength = Math.max(maxLength, length);
            }
        }

        memo[r][c] = maxLength;
        return maxLength;
    }
}
