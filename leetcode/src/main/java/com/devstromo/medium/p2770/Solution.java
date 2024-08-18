package com.devstromo.medium.p2770;

import java.util.Arrays;

public class Solution {
    public int maximumJumps(int[] nums, int target) {
        final var n = nums.length;
        final var dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (Math.abs(nums[j] - nums[i]) <= target && dp[j] != -1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }

    public int maximumJumpsBestSolution(int[] nums, int t) {
        int[] a = new int[nums.length];
        int n = nums.length;
        Arrays.fill(a, -1);
        a[0] = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    int d = nums[j] - nums[i];
                    if ((-1 * t) <= d && d <= t) {
                        a[j] = Math.max(a[j], a[i] + 1);

                    }
                }
            }
        }
        return a[n - 1];
    }
}
