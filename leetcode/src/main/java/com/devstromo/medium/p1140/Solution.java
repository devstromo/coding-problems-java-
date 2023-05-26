package com.devstromo.medium.p1140;

import java.util.Arrays;

class Solution {
    public static int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int m = 1; m <= n; m++) {
                if (i + 2 * m >= n) {
                    dp[i][m] = suffixSum[i];
                } else {
                    for (int k = 1; k <= 2 * m; k++) {
                        dp[i][m] = Math.max(dp[i][m], suffixSum[i] - dp[i + k][Math.max(k, m)]);
                    }
                }
            }
        }
        return dp[0][1];
    }

    public static int stoneGameIIBestRuntime(int[] piles) {
        int len = piles.length;
        int[] preSum = Arrays.copyOf(piles, len);
        for (int i = len - 2; i >= 0; i--)
            preSum[i] += preSum[i + 1];
        return dfs(preSum, 1, 0, new int[len][len]);
    }

    private static int dfs(int[] preSum, int m, int p, int[][] memo) {
        if (p + 2 * m >= preSum.length)
            return preSum[p];
        if (memo[p][m] > 0)
            return memo[p][m];
        int result = 0, take = 0;
        for (int i = 1; i <= 2 * m; i++) {
            take = preSum[p] - preSum[p + i];
            result = Math.max(result, take + preSum[p + i] - dfs(preSum, Math.max(i, m), p + i, memo));
        }
        memo[p][m] = result;
        return result;
    }
}
