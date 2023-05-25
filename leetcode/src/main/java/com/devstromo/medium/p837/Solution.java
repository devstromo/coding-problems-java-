package com.devstromo.medium.p837;

class Solution {

    public static double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) {
            return 1.0;
        }
        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double sumProb = 1.0;
        for (int i = 1; i <= n; i++) {
            dp[i] = sumProb / maxPts;
            if (i < k) {
                sumProb += dp[i];
            }
            if (i >= maxPts) {
                sumProb -= dp[i - maxPts];
            }
        }
        double res = 0.0;
        for (int i = k; i <= n; i++) {
            res += dp[i];
        }
        return res;
    }
}
