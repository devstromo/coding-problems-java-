package com.devstromo.hard.p1000;

import java.util.Arrays;

public class Solution {
    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        if ((n - 1) % (k - 1) != 0) return -1;

        int[][][] dp = new int[n][n][k + 1];
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++)
            prefix[i + 1] = prefix[i] + stones[i];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                for (int p = 2; p <= k; p++) {
                    dp[i][j][p] = Integer.MAX_VALUE;
                    for (int m = i; m < j; m += (k - 1)) {
                        if (dp[i][m][1] == Integer.MAX_VALUE || dp[m + 1][j][p - 1] == Integer.MAX_VALUE)
                            continue;
                        dp[i][j][p] = Math.min(dp[i][j][p], dp[i][m][1] + dp[m + 1][j][p - 1]);
                    }
                }

                // Merge into 1 pile
                dp[i][j][1] = (dp[i][j][k] == Integer.MAX_VALUE) ? Integer.MAX_VALUE : dp[i][j][k] + prefix[j + 1] - prefix[i];
            }
        }

        return dp[0][n - 1][1];
    }

    private int[][] dp;
    private int[] prefixSum;
    private int K;

    public int mergeStonesBest(int[] stones, int K) {
        int n = stones.length;
        if ((n - 1) % (K - 1) != 0) return -1; // If it's not possible to fully merge into one pile

        this.K = K;
        this.dp = new int[n][n];
        this.prefixSum = new int[n + 1];

        // Compute prefix sums to get range sum in O(1)
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + stones[i];
        }

        // Fill DP table with -1 for memoization
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(0, n - 1);
    }

    private int helper(int i, int j) {
        if (i == j) return 0; // Base case: Single stone, no merge cost
        if (dp[i][j] != -1) return dp[i][j]; // Return memoized result

        int minCost = Integer.MAX_VALUE;

        // Try every partition `k` where `i <= k < j`
        for (int k = i; k < j; k += (K - 1)) {
            minCost = Math.min(minCost, helper(i, k) + helper(k + 1, j));
        }

        // If we can merge [i...j] into one pile, add merge cost
        if ((j - i) % (K - 1) == 0) {
            minCost += prefixSum[j + 1] - prefixSum[i];
        }

        return dp[i][j] = minCost;
    }
}
