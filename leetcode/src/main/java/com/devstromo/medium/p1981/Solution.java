package com.devstromo.medium.p1981;

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

    public int minimizeTheDifferenceBest(int[][] mat, int target) {
        int n = mat.length;
        boolean[][] dp = new boolean[n + 1][target + 1];
        dp[0][0] = true;
        int lastGreatThanTargetMin = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int curMin = Integer.MAX_VALUE;
            for (int k = 0; k < mat[i - 1].length; k++) {
                for (int j = 0; j <= target; j++) {
                    if (dp[i - 1][j]) {
                        if (j + mat[i - 1][k] <= target) {
                            dp[i][j + mat[i - 1][k]] = true;
                        } else {
                            curMin = Math.min(curMin, j + mat[i - 1][k]);
                        }
                    }
                }
                if (lastGreatThanTargetMin != Integer.MAX_VALUE) {
                    curMin = Math.min(lastGreatThanTargetMin + mat[i - 1][k], curMin);
                }
            }
            lastGreatThanTargetMin = curMin;
        }
        if (dp[n][target]) {
            return 0;
        }
        int lessThanTargetMin = Integer.MAX_VALUE;
        for (int j = target; j >= 0; j--) {
            if (dp[n][j]) {
                lessThanTargetMin = j;
                break;
            }
        }
        if (lessThanTargetMin != Integer.MAX_VALUE && lastGreatThanTargetMin != Integer.MAX_VALUE) {
            if (lastGreatThanTargetMin - target < target - lessThanTargetMin) {
                return lastGreatThanTargetMin - target;
            } else {
                return target - lessThanTargetMin;
            }
        } else {
            if (lessThanTargetMin == Integer.MAX_VALUE) {
                return lastGreatThanTargetMin - target;
            } else {
                return target - lessThanTargetMin;
            }
        }
    }
}
