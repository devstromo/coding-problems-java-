package com.devstromo.hard.p1573;

import java.util.Arrays;

class Solution {
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        var extendedCuts = new int[c + 2];
        System.arraycopy(cuts, 0, extendedCuts, 1, c);
        extendedCuts[0] = 0;
        extendedCuts[c + 1] = n;
        Arrays.sort(extendedCuts);
        var dp = new int[c + 2][c + 2];
        for (int length = 2; length < c + 2; length++) {
            for (int i = 0; i < c + 2 - length; i++) {
                int j = i + length;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + extendedCuts[j] - extendedCuts[i]);
                }
            }
        }

        return dp[0][c + 1];
    }
}