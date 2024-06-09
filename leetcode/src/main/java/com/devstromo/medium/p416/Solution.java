package com.devstromo.medium.p416;

public class Solution {
    public boolean canPartition(int[] nums) {
        var n = nums.length;
        var sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % 2 == 0 && isSumSubset(nums, sum / 2, n);
    }

    private boolean isSumSubset(int[] numbers, int sum, int n) {
        var dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= numbers[i]; j--) {
                if (dp[j - numbers[i]] == 1)
                    dp[j] = 1;
            }
        }
        return dp[sum] == 1;
    }
}
