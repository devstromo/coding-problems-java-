package com.devstromo.hard.p1092;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                result.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                result.append(str1.charAt(i - 1));
                i--;
            } else {
                result.append(str2.charAt(j - 1));
                j--;
            }
        }

        while (i > 0) {
            result.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            result.append(str2.charAt(j - 1));
            j--;
        }

        return result.reverse().toString();
    }

    public String shortestCommonSupersequenceBest(String s, String t) {
        String res = "";
        try {
            Callable<String> task = () -> solve(s, t);
            FutureTask<String> future = new FutureTask<>(task);
            new Thread(future).start();
            res = future.get();
        } catch (Exception e) {

        } // Wait for the thread to finish
        return res;


    }

    String solve(String s, String t) {
        int n1 = s.length(), n2 = t.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            dp[i][j - 1]
                    );
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = n1, j = n2;
        while (i > 0 && j > 0) {
            if (s.charAt(i - 1) == t.charAt(j - 1)) {
                ans.append(s.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i][j - 1] < dp[i - 1][j]) {
                ans.append(s.charAt(i - 1));
                i--;
            } else {
                ans.append(t.charAt(j - 1));
                j--;
            }
        }
        while (i > 0) {
            ans.append(s.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            ans.append(t.charAt(j - 1));
            j--;
        }
        return ans.reverse().toString();
    }
}
