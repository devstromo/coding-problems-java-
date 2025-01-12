package com.devstromo.hard.p1312;

public class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public int minInsertionsBest(String s) {
        int n = s.length();
        return n - longestPalindromeSubseq(s);
    }

    private int longestPalindromeSubseq(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                int next = dp[j];
                if (a[i] == a[j]) dp[j] = 2 + max;
                max = Math.max(max, next);
            }
        }
        int max = 0;
        for (int i : dp) max = Math.max(i, max);
        return max;
    }

}
