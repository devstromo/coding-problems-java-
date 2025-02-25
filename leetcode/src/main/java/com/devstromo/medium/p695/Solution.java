package com.devstromo.medium.p695;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean[][] visited;
    private int maxArea = 0;
    int r, c;
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        visited = new boolean[rows][cols];
        int max = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (!visited[r][c] && grid[r][c] == 1) { // Check if it's odd and not visited
                    maxArea = 0;
                    dfs(grid, r, c);
                    max = Math.max(max, maxArea);
                }
            }
        }
        return max;
    }

    public int maxAreaOfIslandBest(int[][] grid) {
        int ans = 0;
        r = grid.length;
        c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, solve(i, j, grid));
                }
            }
        }
        return ans;
    }

    private int solve(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != 1) return 0;
        grid[i][j] = -1;

        return 1 + solve(i + 1, j, grid) + solve(i - 1, j, grid) + solve(i, j + 1, grid) + solve(i, j - 1, grid);
    }

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || visited[r][c] || grid[r][c] % 2 == 0) {
            return;
        }

        visited[r][c] = true; // Mark as visited
        maxArea++; // Increment count

        for (int[] dir : directions) { // Explore 4 directions
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }
}
