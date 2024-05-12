package com.devstromo.dp.bell_numbers;

/**
 * The {@code BellNumbers} class provides a method to calculate Bell Numbers using
 * a dynamic programming approach. Bell Numbers count the number of ways to partition
 * a set that has exactly {@code n} elements, or equivalently, the number of distinct
 * ways to partition a set of size {@code n}.
 *
 * <p>The recursive nature of Bell Numbers. The recursive relation is:
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
 */
public class BellNumbers {

    private static final int MOD = 1000000007;

    /**
     * Time: O(N^2)
     * Space: O(N^2)
     *
     * @param n the number of elements in the set for which the Bell Number is calculated.
     *          The value of {@code n} must be non-negative.
     * @return the Bell Number for the set of size {@code n}.
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

    /**
     * Time: O(N^2)
     * Space: O(N^2)
     *
     * @param n the number of elements in the set for which the Bell Number is calculated.
     *          The value of {@code n} must be non-negative.
     * @return the Bell Number for the set of size {@code n}.
     */
    public int calculateWithBellTriangle(int n) {
        var bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        for (var i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
            }
        }

        return bell[n][0];
    }

    /**
     * Time: O(N^2)
     * Space: O(N)
     *
     * @param n the number of elements in the set for which the Bell Number is calculated.
     *          The value of {@code n} must be non-negative.
     * @return the Bell Number for the set of size {@code n}.
     */
    public int calculateWith1DArray(int n) {
        var dp = new int[n + 1];
        dp[0] = 1;
        for (var i = 1; i <= n; i++) {
            var prev = dp[0];
            dp[0] = dp[i - 1];
            for (var j = 1; j <= i; j++) {
                var temp = dp[j];
                dp[j] = prev + dp[j - 1];
                prev = temp;
            }
        }
        return dp[0];
    }

    /**
     * Calculates the number of different multiplicative partitions of a given squarefree number {@code x}.
     * A multiplicative partition of a number refers to the various ways the number can be expressed as
     * a product of its factors. For a squarefree number, these factors are its prime factors. More information
     * about squarefree numbers can be found on Wikipedia: {@link <a href="https://en.wikipedia.org/wiki/Square-free_integer">Square-free integer</a>}.
     * <p>
     * This method determines the number of unique prime factors of {@code x} and then computes the
     * corresponding Bell number, which represents the number of different ways to partition a set
     * of size equal to the number of unique prime factors. The Bell number calculation is handled
     * by the {@code bellNumber} method.
     *
     * @param x the squarefree number for which to calculate the number of multiplicative partitions.
     *          The value of {@code x} must be greater than 0.
     * @return the number of multiplicative partitions of {@code x}, which is the Bell number of the
     * count of its unique prime factors.
     * @throws IllegalArgumentException if {@code x} is less than or equal to 0, since a squarefree
     *                                  number must be positive.
     */
    public int multiplicativePartitions(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }
        int primeFactorCount = countUniquePrimeFactors(x);
        return bellNumber(primeFactorCount);
    }

    private int countUniquePrimeFactors(int x) {
        int count = 0;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                while (x % i == 0) {
                    x /= i;
                }
            }
        }
        if (x > 1) {
            count++;
        }
        return count;
    }

    private int bellNumber(int n) {
        var dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int prev = dp[0];
            dp[0] = dp[i - 1];

            for (int j = 1; j <= i; j++) {
                int temp = dp[j];
                dp[j] = (prev + dp[j - 1]) % MOD;
                prev = temp;
            }
        }
        return dp[0];
    }
}
