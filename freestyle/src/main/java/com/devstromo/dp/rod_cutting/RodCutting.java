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
