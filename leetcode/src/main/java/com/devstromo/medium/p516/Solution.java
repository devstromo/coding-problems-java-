package com.devstromo.medium.p516;

class Solution {
    public static int longestPalindromeSubseq(String s) {
        var n = s.length();
        var dp = new int[n][n];
        for (var i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (var i = n - 1; i >= 0; i--) {
            for (var j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
