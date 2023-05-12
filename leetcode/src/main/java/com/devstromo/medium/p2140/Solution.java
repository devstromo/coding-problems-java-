package com.devstromo.medium.p2140;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Solution {
    public static long mostPoints(int[][] questions) {
        var n = questions.length;
        var dp = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            var points = questions[i][0];
            var skip = questions[i][1];
            var next = min(skip + i + 1, n);
            var currentsPoints = points + dp[next];
            dp[i] = max(currentsPoints, dp[i + 1]);
        }
        return dp[0];
    }
}
