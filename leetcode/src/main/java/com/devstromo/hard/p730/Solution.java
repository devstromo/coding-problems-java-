package com.devstromo.hard.p730;

public class Solution {
    public int countPalindromicSubsequences(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    int low = i + 1, high = j - 1;

                    // Find the first and last occurrences of s[i] between i+1 and j-1
                    while (low <= high && s.charAt(low) != s.charAt(i)) low++;
                    while (low <= high && s.charAt(high) != s.charAt(j)) high--;

                    if (low > high) {
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 2; // No duplicate characters
                    } else if (low == high) {
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 1; // One duplicate character
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] * 2 - dp[low + 1][high - 1]; // Multiple duplicate characters
                    }
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                }

                dp[i][j] = ((dp[i][j] % MOD) + MOD) % MOD; // Normalize to prevent negative values
            }
        }

        return dp[0][n - 1];
    }
}
