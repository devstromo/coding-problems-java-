package com.devstromo.medium.p794;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // Check if it's possible to partition the array
        if ((target + sum) % 2 != 0 || sum < Math.abs(target)) {
            return 0;
        }
        int subsetSum = (target + sum) / 2;
        return countSubsets(nums, subsetSum);
    }

    private int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];
    }
}
