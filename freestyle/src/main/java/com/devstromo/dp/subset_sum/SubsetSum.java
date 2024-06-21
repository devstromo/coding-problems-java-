package com.devstromo.dp.subset_sum;

import java.util.Arrays;

public class SubsetSum {

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses a simple recursive approach.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     */
    public boolean recursive(int[] numbers, int sum) {
        return isSubsetSumRecursive(numbers, numbers.length, sum);
    }

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses a recursive approach with memoization.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     */
    public boolean memoizationRecursive(int[] numbers, int sum) {
        return isSubsetSumTabular(numbers, numbers.length, sum) != 0;
    }

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses a 2D tabular dynamic programming approach.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     *
     * <p> The method initializes a 2D boolean array {@code dp} where {@code dp[i][j]} indicates whether a subset
     * of the first {@code j} elements in the array can sum up to {@code i}. The solution builds up the {@code dp} table
     * using the following logic:
     * <ul>
     *     <li>For sum 0, the result is always {@code true} since the empty subset always sums to 0.</li>
     *     <li>For 0 elements, any positive sum is impossible, thus {@code false}.</li>
     *     <li>For each element, the table is updated by including or excluding the element.</li>
     * </ul>
     */
    public boolean tabular2D(int[] numbers, int sum) {
        var n = numbers.length;
        var dp = new boolean[sum + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j - 1];
                if (i >= numbers[j - 1])
                    dp[i][j] = dp[i][j] || dp[i - numbers[j - 1]][j - 1];
            }
        }
        return dp[sum][n];
    }

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses a 1D tabular dynamic programming approach to optimize space complexity.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     *
     * <p> The method initializes a 1D boolean array {@code dp} where {@code dp[j]} indicates whether a subset
     * can sum up to {@code j}. The solution updates the {@code dp} array iteratively:
     * <ul>
     *     <li>For sum 0, the result is always {@code true} since the empty subset always sums to 0.</li>
     *     <li>For each element, the array is updated to reflect whether the current element can contribute to forming the required sums.</li>
     * </ul>
     */
    public boolean tabular1D(int[] numbers, int sum) {
        var n = numbers.length;
        var dp = new boolean[sum + 1];
        dp[0] = true;

        var current = new boolean[sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < numbers[i - 1])
                    current[j] = dp[j];
                if (j >= numbers[i - 1])
                    current[j] = dp[j] || dp[j - numbers[i - 1]];
            }
            dp = Arrays.copyOf(current, current.length);
        }

        return dp[sum];
    }

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses an optimized 2D tabular dynamic programming approach to reduce space complexity.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     *
     * <p> The method initializes a 2D boolean array with only two rows (to save space) where {@code dp[i % 2][j]} indicates
     * whether a subset of the first {@code i} elements can sum up to {@code j}. The solution updates the {@code dp} table
     * iteratively using a rolling array technique:
     * <ul>
     *     <li>For sum 0, the result is always {@code true} since the empty subset always sums to 0.</li>
     *     <li>For 0 elements, any positive sum is impossible, thus {@code false}.</li>
     *     <li>For each element, the table is updated to reflect whether the current element can contribute to forming the required sums.</li>
     * </ul>
     *
     * <p> The value of {@code dp[i][j]} will be:
     * <ul>
     *     <li>{@code true} if there is a subset of {@code numbers[0..i-1]} with sum equal to {@code j}.</li>
     *     <li>{@code false} otherwise.</li>
     * </ul>
     */
    public boolean tabular2DOptimized(int[] numbers, int sum) {
        var n = numbers.length;
        // set only two values
        var dp = new boolean[2][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i % 2][j] = true;
                } else if (i == 0) {
                    dp[i % 2][j] = false;
                } else if (numbers[i - 1] <= j) {
                    dp[i % 2][j] = dp[(i + 1) % 2]
                            [j - numbers[i - 1]] || dp[(i + 1) % 2][j];
                } else {
                    dp[i % 2][j] = dp[(i + 1) % 2][j];
                }
            }
        }
        return dp[n % 2][sum];
    }

    /**
     * Determines if there is a subset of the given set of integers that sums up to the specified target sum.
     * This method uses an optimized 1D tabular dynamic programming approach to minimize space complexity.
     *
     * @param numbers the array of integers
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     *
     * <p> The method initializes a 1D integer array {@code dp} where {@code dp[j]} indicates whether a subset
     * can sum up to {@code j}. The solution updates the {@code dp} array iteratively:
     * <ul>
     *     <li>For sum 0, the result is always {@code true} (represented by 1) since the empty subset always sums to 0.</li>
     *     <li>For each element, the array is updated in reverse order to avoid overwriting values that are needed for subsequent calculations.</li>
     * </ul>
     */
    public boolean tabular1DOptimized(int[] numbers, int sum) {
        var n = numbers.length;
        var dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= numbers[i]; j--) {
                if (dp[j - numbers[i]] == 1)
                    dp[j] = 1;
            }
        }
        return dp[sum] == 1;
    }

    /**
     * Determines if there is a subset of the given numbers that adds up to the specified sum.
     *
     * <p>This method uses a dynamic programming approach with a 1D array to optimize space complexity.
     * The boolean array `dp` is used to keep track of which sums can be achieved with the given subset
     * of numbers.</p>
     *
     * @param numbers an array of integers representing the set of numbers
     * @param sum     the target sum to achieve with a subset of the numbers
     * @return {@code true} if there exists a subset of the given numbers that adds up to the specified sum, {@code false} otherwise
     */
    public boolean tabular1DOptimizedBoolean(int[] numbers, int sum) {
        var n = numbers.length;
        var dp = new boolean[sum + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= numbers[i]; j--) {
                if (dp[j - numbers[i]])
                    dp[j] = true;
            }
        }
        return dp[sum];
    }

    /**
     * Helper method to determine if there is a subset of the given set of integers that sums up to the specified target sum
     * using a recursive approach.
     *
     * @param numbers the array of integers
     * @param n       the current number of elements to consider from the array
     * @param sum     the target sum
     * @return {@code true} if there exists a subset of {@code numbers} that sums up to {@code sum}, {@code false} otherwise
     *
     * <p> This method checks:
     * <ul>
     *     <li>If the sum is 0, return {@code true} (base case).</li>
     *     <li>If no elements are left and the sum is not 0, return {@code false} (base case).</li>
     *     <li>If the last element is greater than the sum, ignore it and proceed with the remaining elements.</li>
     *     <li>Otherwise, check if the sum can be obtained by either including or excluding the last element.</li>
     * </ul>
     */
    private boolean isSubsetSumRecursive(int[] numbers, int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (numbers[n - 1] > sum)
            return isSubsetSumRecursive(numbers, n - 1, sum);
        // including last element or excluding last element
        return isSubsetSumRecursive(numbers, n - 1, sum)
                || isSubsetSumRecursive(numbers, n - 1, sum - numbers[n - 1]);
    }

    /**
     * Initializes a memoization table and calls the recursive helper method to determine if there is a subset
     * of the given set of integers that sums up to the specified target sum.
     *
     * @param numbers the array of integers
     * @param n       the number of elements in the array
     * @param sum     the target sum
     * @return an integer representing {@code 1} if a subset sum equals to {@code sum} exists, otherwise {@code 0}
     */
    private int isSubsetSumTabular(int[] numbers, int n, int sum) {
        int[][] memo = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                memo[i][j] = -1;
            }
        }
        return isSubsetSumTabularHelper(numbers, n, sum, memo);
    }

    private int isSubsetSumTabularHelper(int[] numbers, int n, int sum, int[][] memo) {
        if (sum == 0) return 1;
        if (n == 0) return 0;

        if (memo[n][sum] != -1) return memo[n][sum];

        if (numbers[n - 1] > sum) {
            memo[n][sum] = isSubsetSumTabularHelper(numbers, n - 1, sum, memo);
        } else {
            memo[n][sum] = (isSubsetSumTabularHelper(numbers, n - 1, sum, memo) != 0 ||
                    isSubsetSumTabularHelper(numbers, n - 1, sum - numbers[n - 1], memo) != 0) ? 1 : 0;
        }

        return memo[n][sum];
    }
}
