package com.devstromo.medium.p279;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int numSquares(int n) {
        final var squares = new ArrayList<Integer>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int square : squares) {
                if (square <= i) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }

        return dp[n];
    }

    public int numSquaresBest(int n) {
        while (n % 4 == 0) n /= 4;
        if (n % 8 == 7) return 4;
        int sq = (int) Math.sqrt(n);
        if (n == sq * sq) return 1;
        for (int i = 1; i * i < n; i++) {
            sq = (int) Math.sqrt(n - i * i);
            if ((n - i * i) == sq * sq) return 2;
        }
        return 3;
    }
}
