package com.devstromo.dynamic_programming.brick_games;

import java.util.List;

class Result {

    /*
     * Complete the 'bricksGame' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long bricksGame(int[] arr) {
        int n = arr.length;
        int i, tmp;
        for (i = 0; i < n / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = tmp;
        }

        var sums = new long[n + 1];
        for (i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + arr[i - 1];
        }
        var dp = new long[n + 1];
        dp[1] = sums[1];
        dp[2] = sums[2];
        dp[3] = sums[3];
        for (i = 4; i <= n; i++) {
            dp[i] = max(sums[i] - dp[i - 1], max(sums[i] - dp[i - 2], sums[i] - dp[i - 3]));
        }
        return dp[n];
    }

    private static long max(long a, long b) {
        return (a >= b) ? a : b;
    }

}
