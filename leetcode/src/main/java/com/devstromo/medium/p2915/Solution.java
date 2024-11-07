package com.devstromo.medium.p2915;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - num] + 1);
                }
            }
        }

        return dp[target];
    }

    public int lengthOfLongestSubsequenceBest(List<Integer> nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int x : nums) {
            for (int t = dp.length - 1; t >= x; t--) {
                if (dp[t - x] != -1) {
                    dp[t] = Math.max(dp[t], dp[t - x] + 1);
                }
            }
        }
        return dp[target];
    }
}
