package com.devstromo.dp.min_num_jumps;

import java.util.Arrays;

public class MinNumJumps {

    // Time complexity: O(n^n)
    // Space complexity: O(n)
    public int recursive(int[] nums) {
        return recursive(nums, 0, nums.length - 1);
    }

    // Time complexity: O(n^2)
    // Space complexity: O(n)
    public int recursiveMemo(int[] nums) {
        var memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return recursiveMemo(nums, 0, nums.length - 1, memo);
    }

    // Time complexity: O(n^2)
    // Space complexity: O(n)
    public int tabulation(int[] nums) {
        final var n = nums.length;
        final var dp = new int[n];
        if (n == 0 || nums[0] == 0)
            return Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j + nums[j] && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                    break;
                }
            }
        }
        return dp[n - 1];
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    public int optimized(int[] nums) {
        final var n = nums.length;
        if (n <= 1)
            return 0;
        if (nums[0] >= n - 1)
            return 1;
        if (nums[0] == 0)
            return -1;
        var maxReach = nums[0];
        var step = nums[0];
        var jumps = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;
            if (nums[i] >= (n - 1) - i)
                return jumps + 1;
            maxReach = Math.max(maxReach, i + nums[i]);
            step--;
            if (step == 0) {
                jumps++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }

    private int recursive(int[] nums, int low, int high) {
        if (low == high) return 0;
        if (nums[low] == 0) return Integer.MAX_VALUE;
        var min = Integer.MAX_VALUE;
        for (int i = low + 1; i <= high && i <= low + nums[low]; i++) {
            int jumps = recursive(nums, i, high);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }
        }
        return min;
    }

    private int recursiveMemo(int[] nums, int low, int high, int[] memo) {
        if (low == high) return 0;
        if (memo[low] != -1) return memo[low];
        var min = Integer.MAX_VALUE - 1;
        for (int i = nums[low]; i >= 1; i--) {
            if (low + i <= high) {
                min = Math.min(min, 1 + recursiveMemo(nums, low + i, high, memo));
            }
        }
        return memo[low] = min;
    }
}
