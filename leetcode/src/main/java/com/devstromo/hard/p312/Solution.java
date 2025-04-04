package com.devstromo.hard.p312;

public class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        newNums[0] = newNums[n + 1] = 1;
        System.arraycopy(nums, 0, newNums, 1, n);

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 2; len <= n + 1; len++) {
            for (int left = 0; left <= n + 1 - len; left++) {
                int right = left + len;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right],
                            newNums[left] * newNums[i] * newNums[right] + dp[left][i] + dp[i][right]);
                }
            }
        }

        return dp[0][n + 1];
    }

    public int maxCoinsBest(int[] nums) {
        int balloonCount = nums.length;

        // Create a new array with 1s at the borders
        int[] extendedBalloons = new int[balloonCount + 2];
        extendedBalloons[0] = 1;
        extendedBalloons[balloonCount + 1] = 1;
        System.arraycopy(nums, 0, extendedBalloons, 1, balloonCount);

        // DP table to store the maximum coins
        int[][] maxCoins = new int[balloonCount + 2][balloonCount + 2];

        // Dynamic programming to calculate the maximum coins
        for (int length = 1; length <= balloonCount; length++) {
            for (int left = 0; left <= balloonCount - length; left++) {
                int right = left + length + 1;
                int product = extendedBalloons[left] * extendedBalloons[right];
                int maxCoinsInRange = 0;
                for (int k = left + 1; k < right; k++) {
                    maxCoinsInRange = Math.max(maxCoinsInRange, product * extendedBalloons[k] + maxCoins[left][k] + maxCoins[k][right]);
                }
                maxCoins[left][right] = maxCoinsInRange;
            }
        }

        // The answer for the original problem is in maxCoins[0][balloonCount + 1]
        return maxCoins[0][balloonCount + 1];
    }
}
