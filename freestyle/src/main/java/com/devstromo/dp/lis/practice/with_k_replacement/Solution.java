package com.devstromo.dp.lis.practice.with_k_replacement;

import java.util.Arrays;

public class Solution {
    public int longestIncreasingSubsequenceWithKReplacements(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n + 1][k + 1];

        // Initialize to 1 since the minimum LIS at any position is 1
        for (int[] row : dp) Arrays.fill(row, 1);

        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            for (int r = 0; r <= k; r++) {
                for (int j = 0; j < i; j++) {
                    for (int prevRepl = 0; prevRepl <= r; prevRepl++) {
                        if (nums[j] < nums[i]) {
                            dp[i][r] = Math.max(dp[i][r], dp[j][prevRepl] + 1);
                        } else if (r > 0) {
                            // Try replacing nums[i] to be greater than nums[j]
                            dp[i][r] = Math.max(dp[i][r], dp[j][r - 1] + 1);
                        }
                    }
                }
                maxLen = Math.max(maxLen, dp[i][r]);
            }
        }

        return maxLen;
    }
}
