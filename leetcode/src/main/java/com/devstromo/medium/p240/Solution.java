package com.devstromo.medium.p240;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        var rows = matrix.length;
        var cols = matrix[0].length;
        var i = rows - 1;
        var j = 0;
        while (i >= 0 && j < cols) {
            if (matrix[i][j] < target)
                j++;
            else if (matrix[i][j] > target) {
                i--;
            } else
                return true;
        }
        return false;
    }
}
