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
