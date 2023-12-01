package com.devstromo.medium.p213;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int robBest(int[] nums) {
        if (nums.length == 1) return nums[0];
        int first = solve(nums, 1, nums.length);
        int second = solve(nums, 0, nums.length - 1);
        return Math.max(first, second);
    }

    private int rob(int[] nums, int low, int high) {
        int prev1 = 0, prev2 = 0;
        for (int i = low; i <= high; i++) {
            int curr = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    private int solve(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = nums[start];
        for (int i = start + 1; i < end; i++) {
            int pick = nums[i];
            if (i > 1)
                pick += prev2;
            int notPick = 0 + prev1;
            int cur = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
