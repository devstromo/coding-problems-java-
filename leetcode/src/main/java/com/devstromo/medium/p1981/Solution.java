package com.devstromo.medium.p1981;

import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;

        // Initialize the DP array
        boolean[] dp = new boolean[4901]; // 70 * 70 = 4900
        dp[0] = true;

        // Iterate through each row
        for (int i = 0; i < m; i++) {
            boolean[] newDp = new boolean[4901];
            for (int j = 0; j < n; j++) {
                int num = mat[i][j];
                for (int k = 0; k <= 4900; k++) {
                    if (dp[k] && k + num <= 4900) {
                        newDp[k + num] = true;
                    }
                }
            }
            dp = newDp;
        }

        // Find the sum closest to the target
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= 4900; i++) {
            if (dp[i]) {
                minDiff = Math.min(minDiff, Math.abs(i - target));
            }
        }

        return minDiff;
    }
}
