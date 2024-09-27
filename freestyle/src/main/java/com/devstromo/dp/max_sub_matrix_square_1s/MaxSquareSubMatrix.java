package com.devstromo.dp.max_sub_matrix_square_1s;

public class MaxSquareSubMatrix {

    public int maxSubMatrix(int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        final int[][] S = new int[n][m];

        for (int i = 0; i < n; i++) {
            S[i][0] = matrix[i][0];
        }
        System.arraycopy(matrix[0], 0, S[0], 0, m);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    S[i][j] = Math.min(S[i - 1][j], Math.min(S[i][j - 1], S[i - 1][j - 1])) + 1;
                    max = Math.max(max, S[i][j]);
                } else {
                    S[i][j] = 0;
                }
            }
        }
        return max;
    }
}
