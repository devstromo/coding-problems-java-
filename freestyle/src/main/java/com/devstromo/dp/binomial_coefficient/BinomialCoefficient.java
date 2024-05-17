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
     *
     * <p>Time Complexity: O(2^n) - This is because each call to binomialCoefficient generates two additional calls.
     * <p>Space Complexity: O(n) - This is due to the depth of the recursion tree.
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
}
