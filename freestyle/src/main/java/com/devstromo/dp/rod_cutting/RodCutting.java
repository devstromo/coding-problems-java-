package com.devstromo.dp.rod_cutting;

public class RodCutting {
    public long recursive(long length, long[] prices) {
        if (length == 0) {
            return 0;
        }
        long max = 0;
        for (int i = 1; i <= length; i++) {
            long tmp = prices[i - 1] + recursive(length - i, prices);
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public long memoized(int length, long[] prices) {
        var memo = new long[length + 1];
        memo[0] = 0;
        rodCuttingMemo(length, prices, memo);
        return memo[length];
    }

    public long tabular(int n, long[] prices) {
        long[] dp = new long[n];
        for (int length = 1; length <= n; length++) {
            long maxProfit = 0;
            for (int i = 1; i <= length; i++) {
                if (i <= prices.length) {
                    long profit = prices[i - 1];
                    if (length - i > 0) {
                        profit += dp[length - i - 1];
                    }

                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
            dp[length - 1] = maxProfit;
        }
        return dp[n - 1];
    }

    private long rodCuttingMemo(int length, long[] prices, long[] memo) {
        if (memo[length] != -1) {
            for (int i = 1; i <= length; i++) {
                long tmp = prices[i - 1] + rodCuttingMemo(length - i, prices, memo);
                if (tmp > memo[length]) {
                    memo[length] = tmp;
                }
            }
        }
        return memo[length];
    }
}
