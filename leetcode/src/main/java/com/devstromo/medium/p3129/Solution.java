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

    public int numberOfStableArraysBest(int zero, int one, int limit) {
        int[][][] dp = new int[zero + 1][one + 1][2];
        for (int i = 1; i <= Math.min(zero, limit); i++) {
            dp[i][0][0] = 1;
        }
        for (int i = 1; i <= Math.min(one, limit); i++) {
            dp[0][i][1] = 1;
        }


        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                dp[i][j][0] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % MOD;
                if (i > limit) {
                    dp[i][j][0] = (dp[i][j][0] + MOD - dp[i - limit - 1][j][1]) % MOD;
                }

                dp[i][j][1] = (dp[i][j - 1][0] + dp[i][j - 1][1]) % MOD;
                if (j > limit) {
                    dp[i][j][1] = (dp[i][j][1] + MOD - dp[i][j - limit - 1][0]) % MOD;
                }
            }
        }
        return (dp[zero][one][0] + dp[zero][one][1]) % MOD;
    }
}
