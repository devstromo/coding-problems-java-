package com.devstromo.medium.p54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        var result = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return result;
        }
        spiralHelper(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1, result);
        return result;
    }

    private static void spiralHelper(int[][] matrix, int rowStart, int colStart, int rowEnd, int colEnd, List<Integer> result) {
        // base case: check if the pointers are valid
        if (rowStart > rowEnd || colStart > colEnd) {
            return;
        }

        // top row
        for (int col = colStart; col <= colEnd; col++) {
            result.add(matrix[rowStart][col]);
        }

        // right column
        for (int row = rowStart + 1; row <= rowEnd; row++) {
            result.add(matrix[row][colEnd]);
        }

        // if there are at least two rows and two columns left, go through the bottom row and left column
        if (rowStart < rowEnd && colStart < colEnd) {
            // bottom row
            for (var col = colEnd - 1; col > colStart; col--) {
                result.add(matrix[rowEnd][col]);
            }
            // left column
            for (var row = rowEnd; row > rowStart; row--) {
                result.add(matrix[row][colStart]);
            }
        }
        // go to the next layer
        spiralHelper(matrix, rowStart + 1, colStart + 1, rowEnd - 1, colEnd - 1, result);
    }

    public static List<Integer> spiralOrderBestSubmit(int[][] matrix) {
        var result = new ArrayList<Integer>();
        var rows = matrix.length;
        var cols = matrix[0].length;
        var left = 0;
        var right = cols - 1;
        var top = 0;
        var bottom = rows - 1;
        var dir = 1;
        while (left <= right && top <= bottom) {
            if (dir == 1) {
                for (var j = left; j <= right; j++) {
                    result.add(matrix[top][j]);
                }
                dir = 2;
                top++;
            } else if (dir == 2) {
                for (var i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                dir = 3;
                right--;
            } else if (dir == 3) {
                for (var j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                dir = 4;
                bottom--;
            } else if (dir == 4) {
                for (var i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                dir = 1;
                left++;
            }
        }
        return result;
    }
}
