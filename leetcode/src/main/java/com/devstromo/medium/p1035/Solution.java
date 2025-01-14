package com.devstromo.medium.p1035;

import static java.lang.Math.max;

class Solution {

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        var m = nums1.length;
        var n = nums2.length;
        var dp = new int[m + 1][n + 1];
        for (var i = 1; i <= m; i++) {
            for (var j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int maxUncrossedLinesBestRuntime(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m < n)
            return maxUncrossedLines(nums2, nums1);
        int dp[] = new int[n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0, previous = 0, current; j < n; j++) {
                current = dp[j + 1];
                if (nums1[i] == nums2[j])
                    dp[j + 1] = previous + 1;
                else
                    dp[j + 1] = max(dp[j], current);
                previous = current;
            }
        }
        return dp[n];
    }
    // not feasible without dp
    public static int maxUncrossedLinesRecursive(int[] nums1, int[] nums2) {
        return lcs(nums1, nums2, nums1.length, nums2.length);
    }

    private static int lcs(int[] nums1, int[] nums2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (nums1[m - 1] == nums2[n - 1]) {
            return 1 + lcs(nums1, nums2, m - 1, n - 1);
        } else {
            var x = lcs(nums1, nums2, m - 1, n);
            var y = lcs(nums1, nums2, m, n - 1);
            return max(x, y);
        }
    }
}
