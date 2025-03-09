package com.devstromo.medium.p1905;

public class Solution {
    private int rows, cols;
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        rows = grid1.length;
        cols = grid1[0].length;

        // Step 1: Remove all invalid islands in grid2
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid2[r][c] == 1 && grid1[r][c] == 0) {
                    dfs(grid2, r, c); // Remove invalid land
                }
            }
        }

        // Step 2: Count valid sub-islands
        int subIslands = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid2[r][c] == 1) {
                    subIslands++; // Found a valid sub-island
                    dfs(grid2, r, c); // Mark the entire island as visited
                }
            }
        }
        return subIslands;
    }

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
            return;
        }
        grid[r][c] = 0; // Mark as visited
        for (int[] dir : directions) {
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }
}
