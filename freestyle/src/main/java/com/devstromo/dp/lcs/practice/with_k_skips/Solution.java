package com.devstromo.dp.lcs.practice.with_k_skips;

public class Solution {
    public int longestCommonSubsequenceWithSkips(String text1, String text2, int k) {
        int n = text1.length();
        int m = text2.length();
        int[][][] dp = new int[n + 1][m + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int l = 0; l <= k; l++) {
                    if (i == 0 || j == 0) {
                        dp[i][j][l] = 0;
                        continue;
                    }
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j][l] = dp[i - 1][j - 1][l] + 1;
                    } else {
                        int skipText1 = (l > 0) ? dp[i - 1][j][l - 1] : 0;
                        int skipText2 = (l > 0) ? dp[i][j - 1][l - 1] : 0;
                        dp[i][j][l] = Math.max(dp[i - 1][j][l], dp[i][j - 1][l]);
                        if (l > 0) {
                            dp[i][j][l] = Math.max(dp[i][j][l], Math.max(skipText1, skipText2));
                        }
                    }
                }
            }
        }

        int maxLCS = 0;
        for (int l = 0; l <= k; l++) {
            maxLCS = Math.max(maxLCS, dp[n][m][l]);
        }
        return maxLCS;
    }

}
