package com.devstromo.easy.p3417;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length, cols = grid[0].length;
        boolean leftToRight = true;
        boolean skip = false;

        for (int r = 0; r < rows; r++) {
            if (leftToRight) {
                for (int c = 0; c < cols; c++) {
                    if (!skip) {
                        result.add(grid[r][c]);
                    }
                    skip = !skip; // Toggle skip
                }
            } else {
                for (int c = cols - 1; c >= 0; c--) {
                    if (!skip) {
                        result.add(grid[r][c]);
                    }
                    skip = !skip; // Toggle skip
                }
            }
            leftToRight = !leftToRight; // Change direction
        }

        return result;
    }
}
