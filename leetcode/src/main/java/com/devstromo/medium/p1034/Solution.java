package com.devstromo.medium.p1034;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean[][] visited;
    private int originalColor;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length, n = grid[0].length;
        visited = new boolean[m][n];
        originalColor = grid[row][col];

        // Store border cells that need to be colored
        List<int[]> borderCells = new ArrayList<>();

        // DFS to find connected component and mark border cells
        dfs(grid, row, col, borderCells);

        // Color the border cells
        for (int[] cell : borderCells) {
            grid[cell[0]][cell[1]] = color;
        }

        return grid;
    }

    private void dfs(int[][] grid, int r, int c, List<int[]> borderCells) {
        int m = grid.length, n = grid[0].length;
        visited[r][c] = true;
        boolean isBorder = false;

        for (int[] dir : directions) {
            int newRow = r + dir[0];
            int newCol = c + dir[1];

            if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || grid[newRow][newCol] != originalColor) {
                isBorder = true; // It's a border if it touches an out-of-boundary or different color cell
            } else if (!visited[newRow][newCol]) {
                dfs(grid, newRow, newCol, borderCells);
            }
        }

        if (isBorder) {
            borderCells.add(new int[]{r, c});
        }
    }
}
