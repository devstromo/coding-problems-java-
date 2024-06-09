package com.devstromo.dp.subset_sum;

import java.util.Arrays;

public class SubsetSum {

    public boolean recursive(int[] numbers, int sum) {
        return isSubsetSumRecursive(numbers, numbers.length, sum);
    }

    public boolean memoizationRecursive(int[] numbers, int sum) {
        return isSubsetSumTabular(numbers, numbers.length, sum) != 0;
    }

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
