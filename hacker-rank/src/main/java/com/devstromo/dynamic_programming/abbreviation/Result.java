package com.devstromo.dynamic_programming.abbreviation;

public class Result {
    /*
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String abbreviation(String a, String b) {
        int m = a.length();
        int n = b.length();

        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] && Character.isLowerCase(a.charAt(i - 1));
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char charA = a.charAt(i - 1);
                char charB = b.charAt(j - 1);
                if (charA == charB) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (Character.toUpperCase(charA) == charB && Character.isLowerCase(charA)) {
                    dp[i][j] = dp[i - 1][j - 1] || dp[i - 1][j];
                } else if (Character.isLowerCase(charA)) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n] ? "YES" : "NO";
    }
}
