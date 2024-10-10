package com.devstromo.medium.p53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public int maxSubArrayBest(int[] nums) {
        int current = 0;
        int maxs = nums[0];
        for (int i : nums) {
            current = current + i;
            maxs = current > maxs ? current : maxs;
            if (current < 0) {
                current = 0;
            }
        }
        return maxs;
    }
}
