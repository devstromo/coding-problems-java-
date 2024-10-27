package com.devstromo.medium.p1049;

public class Solution {
    public int lastStoneWeightII(int[] stones) {
        int totalSum = 0;
        for (int stone : stones) {
            totalSum += stone;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                dp[j] = dp[j] || dp[j - stone];
            }
        }

        int maxPossibleSum = 0;
        for (int i = target; i >= 0; i--) {
            if (dp[i]) {
                maxPossibleSum = i;
                break;
            }
        }

        return totalSum - 2 * maxPossibleSum;
    }
}
