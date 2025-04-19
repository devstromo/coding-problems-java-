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
