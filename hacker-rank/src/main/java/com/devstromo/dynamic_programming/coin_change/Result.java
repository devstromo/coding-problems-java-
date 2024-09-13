package com.devstromo.dynamic_programming.coin_change;

import java.util.List;


public class Result {
    public static long getWays(int n, List<Long> c) {
        final var dp = new long[n + 1];
        dp[0] = 1;
        for (long coin : c) {
            for (int i = (int) coin; i <= n; i++) {
                dp[i] += dp[i - (int) coin];
            }
        }

        return dp[n];
    }
}
