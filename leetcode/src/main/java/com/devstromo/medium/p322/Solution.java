package com.devstromo.medium.p322;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        var dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - coins[i]]);
                }
            }
        }
        return dp[amount] >= Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }
}
