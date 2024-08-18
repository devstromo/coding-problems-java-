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
}
