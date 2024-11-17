package com.devstromo.medium.p3129;

public class Solution {

    private static final int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        int[][][] dp = new int[one + 1][zero + 1][2];

        dp[0][0][0] = 1;
        dp[0][0][1] = 1;

        for (int m = 0; m <= one; m++) {
            for (int n = 0; n <= zero; n++) {
                for (int o = 1; o <= limit; o++) {
                    if (m - o >= 0) {
                        dp[m][n][1] = (dp[m][n][1] + dp[m - o][n][0]) % MOD;
                    }
                    if (n - o >= 0) {
                        dp[m][n][0] = (dp[m][n][0] + dp[m][n - o][1]) % MOD;
                    }
                }
            }
        }

        return (dp[one][zero][0] + dp[one][zero][1]) % MOD;
    }
}
