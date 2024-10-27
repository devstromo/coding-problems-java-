package com.devstromo.medium.p1049;

import java.util.Arrays;

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

    public int lastStoneWeightIIBest(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        int[][] cache = new int[stones.length + 1][target + 1];
        for (int[] arr : cache) Arrays.fill(arr, -1);
        int diff = helperFunc(0, stones, target, cache);
        return sum - 2 * diff;
    }

    private int helperFunc(int i, int[] stones, int target, int[][] cache) {
        if (i == stones.length - 1) {
            if (stones[i] <= target) {
                return stones[i];
            }
            return 0;
        }
        if (cache[i][target] != -1) {
            return cache[i][target];
        }
        int notTake = helperFunc(i + 1, stones, target, cache);
        int take = Integer.MIN_VALUE;
        if (stones[i] <= target) {
            take = stones[i] + helperFunc(i + 1, stones, target - stones[i], cache);
        }
        return cache[i][target] = Math.max(notTake, take);

    }
}
