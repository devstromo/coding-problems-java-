package com.devstromo.easy.p1572;

class Solution {

    public static int diagonalSum(int[][] mat) {
        var sum = 0;
        for (var i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[i][mat.length - i - 1];
        }
        return mat.length % 2 == 0 ? sum : sum - mat[mat.length / 2][mat.length / 2];
    }
}
