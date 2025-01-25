package com.devstromo.medium.p712;

public class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Base cases: Deleting all characters from one string
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Choose the minimum cost of deleting from either string
                    dp[i][j] = Math.min(
                            dp[i - 1][j] + s1.charAt(i - 1),  // Delete from s1
                            dp[i][j - 1] + s2.charAt(j - 1)   // Delete from s2
                    );
                }
            }
        }

        return dp[m][n];
    }

    public int minimumDeleteSumBest(String s11, String s22) {
        char[] s1 = s11.toCharArray(), s2 = s22.toCharArray();
        int m = s1.length, n = s2.length, total = 0;
        int[] prev = new int[n + 1], cur = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            total += s1[i - 1];
            for (int j = 1; j <= n; j++) {
                if (s1[i - 1] == s2[j - 1])
                    cur[j] = s1[i - 1] + prev[j - 1];
                else
                    cur[j] = Math.max(cur[j - 1], prev[j]);
            }
            int[] temp = prev;
            prev = cur;
            cur = temp;
        }

        for (char c : s2)
            total += c;

        return total - 2 * prev[n];
    }

}
