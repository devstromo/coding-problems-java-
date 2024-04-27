package com.devstromo.dp.lcs;

public class LCS {

    public int lcs(String sequence1, String sequence2) {
        var n = sequence1.length();
        var m = sequence2.length();
        var dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (sequence1.charAt(i - 1) == sequence2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public String lcsString(String sequence1, String sequence2) {
        var n = sequence1.length();
        var m = sequence2.length();
        var dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (sequence1.charAt(i - 1) == sequence2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack to find the LCS string
        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (sequence1.charAt(i - 1) == sequence2.charAt(j - 1)) {
                lcs.append(sequence1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }
}
