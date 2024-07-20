package com.devstromo.dp.number_of_paths_in_n_x_m_matrix;

public class NumberOfPathsInNxMMatrix {

    // Time: O(2^N)
    // Space: O(N + M)
    public int numberOfUniquePathsRecursive(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return numberOfUniquePathsRecursive(m - 1, n) + numberOfUniquePathsRecursive(m, n - 1);
    }

    // Time: O(N * M)
    // Space: O(N * M)
    public int numberOfUniquePathsMemo(int m, int n) {
        final var memo = new int[m + 1][n + 1];
        return numberOfUniquePathsMemo(m, n, memo);
    }

    // Time: O(N * M)
    // Space: O(N * M)
    public int numberOfUniquePaths2dArray(int m, int n) {
        final var count = new int[m][n];

        var i = 0;
        var j = 0;
        for (i = 0; i < m; i++) {
            count[i][0] = 1;
        }

        for (i = 0; i < n; i++) {
            count[0][i] = 1;
        }

        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                count[i][j] = count[i - 1][j] + count[i][j - 1];
            }
        }
        return count[m - 1][n - 1];
    }

    public int numberOfUniquePaths1DArray(int m, int n) {
        final var count = new int[n];
        count[0] = 1;
        var i = 0;
        var j = 0;

        for (i = 0; i < m; i++) {
            for (j = 1; j < n; j++) {
                count[j] += count[j - 1];
            }
        }
        return count[n - 1];
    }

    private int numberOfUniquePathsMemo(int m, int n, int[][] memo) {
        if (m == 1 || n == 1) return memo[m][n] = 1;
        if (memo[m][n] != 0) return memo[m][n];
        memo[m][n] = numberOfUniquePathsMemo(m - 1, n, memo) + numberOfUniquePathsMemo(m, n - 1, memo);
        return memo[m][n];
    }
}
