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
