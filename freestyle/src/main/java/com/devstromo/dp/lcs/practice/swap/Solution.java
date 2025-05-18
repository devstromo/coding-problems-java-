package com.devstromo.dp.lcs.practice.swap;

public class Solution {
    public int lcsWithSwap(String str1, String str2) {
        int max = lcs(str1, str2); // without any swap

        char[] arr = str1.toCharArray();
        int n = arr.length;

        // Try all pairs of indices to swap once
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap
                swap(arr, i, j);
                String swapped = new String(arr);
                max = Math.max(max, lcs(swapped, str2));
                // Undo swap
                swap(arr, i, j);
            }
        }

        return max;
    }

    private int lcs(String a, String b) {
        int n = a.length(), m = b.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
