package com.devstromo.dp.rod_cutting;

public class RodCutting {
    public long recursive(int length, int[] prices) {
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
}
