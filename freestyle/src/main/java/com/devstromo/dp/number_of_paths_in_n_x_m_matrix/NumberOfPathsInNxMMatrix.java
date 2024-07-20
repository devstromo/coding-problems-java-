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

    private int numberOfUniquePathsMemo(int m, int n, int[][] memo) {
        if (m == 1 || n == 1) return memo[m][n] = 1;
        if (memo[m][n] != 0) return memo[m][n];
        memo[m][n] = numberOfUniquePathsMemo(m - 1, n, memo) + numberOfUniquePathsMemo(m, n - 1, memo);
        return memo[m][n];
    }
}
