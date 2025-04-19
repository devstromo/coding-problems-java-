package com.devstromo.medium.p1992;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findFarmland(int[][] land) {
        if (land.length == 0 || land[0].length == 0) {
            return new int[][]{
                    {0}
            };
        }
        int m = land.length, n = land[0].length;
        List<int[]> result = new ArrayList<>();

        // Visit all unvisited farmland cells (value == 1)
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (land[r][c] == 1) {
                    int[] bounds = new int[]{r, c, r, c};
                    dfs(land, r, c, bounds);
                    result.add(bounds);
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public int[][] findFarmlandBest(int[][] land) {
        if (land.length == 0 || land[0].length == 0) {
            return new int[][]{
                    {0}
            };
        }
        int row = land.length;
        int col = land[0].length;

        List<int[]> rectangles = new ArrayList<>();
        for (int currRow = 0; currRow < row; ++currRow) {
            for (int currCol = 0; currCol < col; ++currCol) {
                if (land[currRow][currCol] == 1) {
                    int x = currRow;
                    int y = currCol;
                    for (x = currRow; x < row && land[x][currCol] == 1; ++x) {
                        for (y = currCol; y < col && land[x][y] == 1; ++y) {
                            land[x][y] = 0;
                        }
                    }
                    rectangles.add(new int[]{currRow, currCol, x - 1, y - 1});
                }
            }
        }
        return rectangles.toArray(new int[rectangles.size()][]);
    }

    private void dfs(int[][] land, int r, int c, int[] bounds) {
        int m = land.length, n = land[0].length;
        // Base case: out of bounds or not farmland
        if (r < 0 || r >= m || c < 0 || c >= n || land[r][c] != 1) return;

        // Mark as visited
        land[r][c] = -1;

        // Update the bottom-right corner
        bounds[2] = Math.max(bounds[2], r);
        bounds[3] = Math.max(bounds[3], c);

        // Explore 4 directions
        dfs(land, r + 1, c, bounds);
        dfs(land, r - 1, c, bounds);
        dfs(land, r, c + 1, bounds);
        dfs(land, r, c - 1, bounds);
    }
}
