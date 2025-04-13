package com.devstromo.medium.p1727;

import java.util.Arrays;

public class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;

        // Step 1: Convert matrix into heights
        for (int r = 1; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 1) {
                    matrix[r][c] += matrix[r - 1][c]; // add height from above row
                }
            }
        }

        // Step 2: For each row, sort and compute max area
        for (int[] row : matrix) {
            Arrays.sort(row); // sort ascending
            for (int i = cols - 1; i >= 0; i--) { // simulate descending
                int height = row[i];
                int width = cols - i;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        return maxArea;
    }
}
