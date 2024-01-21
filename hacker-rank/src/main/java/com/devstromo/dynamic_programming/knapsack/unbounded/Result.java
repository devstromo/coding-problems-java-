package com.devstromo.dynamic_programming.knapsack.unbounded;

import java.util.List;

class Result {

    /*
     * Complete the 'unboundedKnapsack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int unboundedKnapsack(int k, List<Integer> arr) {
        int n = arr.size();
        Integer[] wt = new Integer[arr.size()];
        arr.toArray(wt);
        int[][] dp = new int[n][k + 1];
        int capacity;
        for (capacity = 0; capacity <= k; capacity++) {
            if (wt[0] <= capacity) {
                dp[0][capacity] = (capacity / wt[0]) * wt[0];
            }
        }
        for (int item = 1; item < n; item++) {
            for (capacity = 1; capacity <= k; capacity++) {
                int includeProfit = 0;
                int excludeProfit = dp[item - 1][capacity];
                if (wt[item] <= capacity) {
                    includeProfit = wt[item] + dp[item][capacity - wt[item]];
                }
                dp[item][capacity] = Math.max(includeProfit, excludeProfit);
            }
        }
        return dp[n - 1][k];
    }

}
