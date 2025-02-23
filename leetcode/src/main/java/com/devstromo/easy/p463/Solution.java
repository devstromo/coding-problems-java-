package com.devstromo.easy.p463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;

                    // Check if the cell above is land, reduce perimeter by 2 (shared edge)
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }

                    // Check if the cell to the left is land, reduce perimeter by 2 (shared edge)
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}
