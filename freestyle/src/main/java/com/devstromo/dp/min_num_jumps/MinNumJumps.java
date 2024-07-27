package com.devstromo.dp.min_num_jumps;

public class MinNumJumps {

    public int recursive(int[] nums) {
        return recursive(nums, 0, nums.length - 1);
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
}
