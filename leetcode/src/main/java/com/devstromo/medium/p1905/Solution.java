package com.devstromo.medium.p1905;

public class Solution {
    private int rows, cols;
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] grid1, grid2;
    int rowLim, colLim;

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

    public int countSubIslandsBest(int[][] grid1, int[][] grid2) {
        rowLim = grid1.length - 1;
        colLim = grid1[0].length - 1;
        this.grid1 = grid1;
        this.grid2 = grid2;


        int subIslandCount = 0;
        for (int r = rowLim; r >= 0; r--) {
            for (int c = colLim; c >= 0; c--)
                if (grid2[r][c] == 1)
                    subIslandCount += checkSubIsland(r, c);
        }
        return subIslandCount;
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

    private int checkSubIsland(int r, int c) {
        // mark it visited by -1
        grid2[r][c] = -1;
        int isSubIsland = grid1[r][c];
        if (r > 0 && grid2[r - 1][c] == 1) isSubIsland &= checkSubIsland(r - 1, c);
        if (r < rowLim && grid2[r + 1][c] == 1) isSubIsland &= checkSubIsland(r + 1, c);
        if (c > 0 && grid2[r][c - 1] == 1) isSubIsland &= checkSubIsland(r, c - 1);
        if (c < colLim && grid2[r][c + 1] == 1) isSubIsland &= checkSubIsland(r, c + 1);
        return isSubIsland;
    }
}
