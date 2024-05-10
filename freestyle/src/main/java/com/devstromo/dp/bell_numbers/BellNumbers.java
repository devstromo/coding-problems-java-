package com.devstromo.dp.bell_numbers;

public class BellNumbers {

    /**
     * The {@code BellNumbers} class provides a method to calculate Bell Numbers using
     * a dynamic programming approach. Bell Numbers count the number of ways to partition
     * a set that has exactly {@code n} elements, or equivalently, the number of distinct
     * ways to partition a set of size {@code n}.
     *
     * <p>This implementation computes Bell Numbers by building a triangular array where
     * the value of each cell in the array is calculated based on previously computed values,
     * adhering to the recursive nature of Bell Numbers. The recursive relation used is:
     * <blockquote>
     * B(i, k) = k * B(i-1, k) + B(i-1, k-1)
     * </blockquote>
     * where {@code B(i, k)} represents the number of partitions of {@code i} items with
     * exactly {@code k} sets.</p>
     *
     * <p>The method uses a two-dimensional array to hold intermediate results and iterates
     * through the array to fill it according to the rules defined above. The final result,
     * which is the Bell Number for {@code n}, is calculated by summing up the values in the
     * last row of the array.</p>
     *
     * @param n the number of elements in the set for which the Bell Number is calculated.
     *          The value of {@code n} must be non-negative.
     * @return the Bell Number for the set of size {@code n}.
     * @throws IllegalArgumentException if {@code n} is negative.
     */
    public int calculate(int n) {
        var s = new int[n + 1][n + 1];
        var i = 0;
        var k = 0;
        for (i = 0; i <= n; i++) {
            for (k = 0; k <= n; k++) {
                if (k > i) {
                    s[i][k] = 0;
                } else if (i == k) {
                    s[i][k] = 1;
                } else if (i == 0 || k == 0) {
                    s[i][k] = 0;
                } else {
                    s[i][k] = k * s[i - 1][k] + s[i - 1][k - 1];
                }
            }
        }
        int ans = 0;
        for (i = 0; i <= n; i++) {
            ans += s[n][i];
        }
        return ans;
    }
}
