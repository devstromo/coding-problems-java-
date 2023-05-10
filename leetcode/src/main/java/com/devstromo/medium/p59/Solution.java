package com.devstromo.medium.p59;

class Solution {
    public static int[][] generateMatrix(int n) {
        var matrix = new int[n][n];
        spiralHelper(matrix, 0, 0, n - 1, 1);
        return matrix;
    }

    private static void spiralHelper(int[][] matrix, int rowStart, int colStart, int length, int count) {
        if (rowStart > length || colStart > length) {
            return;
        }
        // top row
        for (var col = colStart; col <= length; col++) {
            matrix[rowStart][col] = count++;
        }
        // right column
        for (var row = rowStart + 1; row <= length; row++) {
            matrix[row][length] = count++;
        }
        if (rowStart < length && colStart < length) {
            // bottom row
            for (var col = length - 1; col > colStart; col--) {
                matrix[length][col] = count++;
            }
            // left column
            for (var row = length; row > rowStart; row--) {
                matrix[row][colStart] = count++;
            }
        }
        spiralHelper(matrix, rowStart + 1, colStart + 1, length - 1, count);
    }

    public static int[][] generateMatrixBestSolution(int n) {
        int[][] matrix = new int[n][n];
        int num = n * n;
        int count = 0;
        int rstart = 0;
        int rend = n - 1;
        int cstart = 0;
        int cend = n - 1;
        var end = n-1;
        while ((rstart <= rend && cstart <= cend) && count <= num) {
            for (int i = cstart; i <= cend; i++) {
                count++;
                matrix[rstart][i] = count;
            }
            rstart++;
            for (int i = rstart; i <= rend; i++) {
                count++;
                matrix[i][cend] = count;
            }
            cend--;
            for (int i = cend; i >= cstart; i--) {
                count++;
                matrix[rend][i] = count;
            }
            rend--;
            for (int i = rend; i >= rstart; i--) {
                count++;
                matrix[i][cstart] = count;
            }
            cstart++;
        }
        return matrix;
    }
}
