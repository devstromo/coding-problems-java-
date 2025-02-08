package com.devstromo.medium.p264;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            dp[i] = nextUgly;

            // Move pointers to avoid duplicates
            if (dp[p2] * 2 == nextUgly) p2++;
            if (dp[p3] * 3 == nextUgly) p3++;
            if (dp[p5] * 5 == nextUgly) p5++;
        }
        return dp[n - 1];
    }
}
