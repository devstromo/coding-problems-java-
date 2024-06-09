package com.devstromo.dp.subset_sum;

public class SubsetSum {

    public boolean recursive(int[] numbers, int sum) {
        return isSubsetSumRecursive(numbers, numbers.length, sum);
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
}
