package com.devstromo.medium.p45;

public class Solution {
    public int jump(int[] nums) {
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
}
