package com.devstromo.medium.p2658;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int[][] grid;
    private boolean[][] visited;
    private int rows, cols;

    public int findMaxFish(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.visited = new boolean[rows][cols];

        int maxFish = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0 && !visited[r][c]) {
                    int fishCount = explore(r, c);
                    maxFish = Math.max(maxFish, fishCount);
                }
            }
        }

        return maxFish;
    }

    public int findMaxFishBest(int[][] grid) {
        int max = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {

                if (grid[y][x] != 0) {
                    max = Math.max(max, dfs(y, x, grid));
                }
            }
        }
        return max;
    }

    private int dfs(int y, int x, int[][] grid) {
        if (y < 0 || x < 0 || y >= grid.length || x >= grid[0].length) return 0;
        if (grid[y][x] == 0) return 0;
        int total = grid[y][x];
        grid[y][x] = 0;
        total += dfs(y, x + 1, grid) +
                dfs(y, x - 1, grid) +
                dfs(y + 1, x, grid) +
                dfs(y - 1, x, grid);
        return total;
    }

    private int explore(int r, int c) {
        visited[r][c] = true;
        int total = grid[r][c];

        for (int[] dir : directions) {
            int newRow = r + dir[0];
            int newColumn = c + dir[1];
            if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < cols &&
                    grid[newRow][newColumn] > 0 && !visited[newRow][newColumn]) {
                total += explore(newRow, newColumn);
            }
        }

        return total;
    }

}
