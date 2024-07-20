package com.devstromo.dp.number_of_paths_in_n_x_m_matrix;

public class NumberOfPathsInNxMMatrix {

    public int numberOfUniquePathsRecursive(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return numberOfUniquePathsRecursive(m - 1, n) + numberOfUniquePathsRecursive(m, n - 1);
    }
}
