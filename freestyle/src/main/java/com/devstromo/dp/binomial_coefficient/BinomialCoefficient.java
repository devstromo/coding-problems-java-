package com.devstromo.dp.binomial_coefficient;

public class BinomialCoefficient {
    /**
     * Computes the binomial coefficient, C(n, k), also known as "n choose k",
     * which represents the number of ways to choose k elements from a set of n elements.
     * This implementation uses a recursive approach.
     *
     * @param n the number of elements in the set
     * @param k the number of elements to choose
     * @return the binomial coefficient C(n, k)
     * @throws IllegalArgumentException if n or k is negative
     * <p>
     * Time Complexity: O(2^n) - This is because each call to binomialCoefficient generates two additional calls.
     * Space Complexity: O(n) - This is due to the depth of the recursion tree.
     */
    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("n and k must be non-negative");
        }
        if (k > n)
            return 0;
        if (k == 0 || k == n)
            return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * Computes the binomial coefficient, C(n, k), also known as "n choose k",
     * which represents the number of ways to choose k elements from a set of n elements.
     * This implementation uses dynamic programming with a 2D matrix to store intermediate results.
     *
     * @param n the number of elements in the set
     * @param k the number of elements to choose
     * @return the binomial coefficient C(n, k)
     * @throws IllegalArgumentException if n or k is negative
     * <p>
     * Time Complexity: O(n * k) - This is because we fill up a table of size (n+1) x (k+1).
     * Space Complexity: O(n * k) - This is due to the storage requirements of the 2D matrix.
     */
    public int binomialCoefficientWith2dMatrix(int n, int k) {
        var C = new int[n + 1][k + 1];
        var i = 0;
        var j = 0;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
        return C[n][k];
    }

}
