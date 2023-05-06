package com.devstromo.medium.p1498;

import static java.util.Arrays.sort;

class Solution {
    private static final int MOD = 1_000_000_007;

    public static int numSubseq(int[] nums, int target) {
        sort(nums);
        var n = nums.length;
        var pow = new int[n + 1];
        pow[0] = 1;

        for (var i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }
        var left = 0;
        var right = n - 1;
        var count = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                count = (count + pow[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
