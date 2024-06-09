package com.devstromo.dp.subset_sum;

public class SubsetSum {

    public boolean recursive(int[] numbers, int sum) {
        return isSubsetSumRecursive(numbers, numbers.length, sum);
    }

    public boolean memoization(int[] numbers, int sum) {
        return isSubsetSumTabular(numbers, numbers.length, sum) != 0;
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
