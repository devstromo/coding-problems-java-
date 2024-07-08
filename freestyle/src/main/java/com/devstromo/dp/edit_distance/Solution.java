package com.devstromo.dp.edit_distance;

import java.util.Arrays;

public class Solution {
    public int editDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp[][] in bottom up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to insert all characters of second string
                if (i == 0) {
                    dp[i][j] = j;  // Min. operations = j
                }
                // If second string is empty, only option is to remove all characters of first string
                else if (j == 0) {
                    dp[i][j] = i;  // Min. operations = i
                }
                // If last characters are the same, ignore the last character and recur for the remaining substring
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If the last character is different, consider all possibilities and find the minimum
                else {
                    dp[i][j] = 1 + min(dp[i - 1][j], // Remove
                            dp[i][j - 1], // Insert
                            dp[i - 1][j - 1] // Replace
                    );
                }
            }
        }

        return dp[m][n];
    }

    public int editDistanceRecursive(String str1, String str2) {
        return editDistanceRecursive(str1, str2, str1.length(), str2.length());
    }

    public int editDistanceMemo(String str1, String str2) {
        final var m = str1.length();
        final var n = str2.length();
        final var memo = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            Arrays.fill(memo[i], -1);
        }
        return editDistanceMemo(str1, str2, m, n, memo);
    }

    public int editDistanceSpaceOptimized(String str1, String str2) {
        final var m = str1.length();
        final var n = str2.length();

        var prev = new int[n + 1];
        final var curr = new int[n + 1];

        for (int j = 0; j <= n; j++) {
            prev[j] = j;
        }

        for (int i = 1; i <= m; i++) {
            curr[0] = i;
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    curr[j] = prev[j - 1];
                } else {
                    curr[j] = min(1 + prev[j], 1 + curr[j - 1], 1 + prev[j - 1]);
                }
            }
            prev = curr.clone();
        }

        return prev[n];
    }

    private int editDistanceRecursive(String str1, String str2, int m, int n) {
        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return editDistanceRecursive(str1, str2, m - 1, n - 1);

        final var insertion = editDistanceRecursive(str1, str2, m, n - 1);
        final var remove = editDistanceRecursive(str1, str2, m - 1, n);
        final var replace = editDistanceRecursive(str1, str2, m - 1, n - 1);
        return 1 + min(insertion, remove, replace);
    }

    private int editDistanceMemo(String str1, String str2, int m, int n, int[][] memo) {
        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (memo[m][n] != -1) return memo[m][n];

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            memo[m][n] = editDistanceRecursive(str1, str2, m - 1, n - 1);
            return memo[m][n];
        }

        final var insertion = editDistanceRecursive(str1, str2, m, n - 1);
        final var remove = editDistanceRecursive(str1, str2, m - 1, n);
        final var replace = editDistanceRecursive(str1, str2, m - 1, n - 1);
        memo[m][n] = 1 + min(insertion, remove, replace);
        return memo[m][n];
    }

    public int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
