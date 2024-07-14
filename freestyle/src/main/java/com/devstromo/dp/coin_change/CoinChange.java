package com.devstromo.dp.coin_change;

public class CoinChange {
    public int solution(int[] coins, int amount) {
        final var n = coins.length;
        final var dp = new int[n + 1][amount + 1];
        var i = 0;
        var j = 1;
        for (i = 0; i <= amount; i++) {
            dp[0][i] = Integer.MAX_VALUE - 1;
        }
        for (i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }
        return dp[coins.length][amount] >= Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
    }

    public int solution1D(int[] coins, int amount) {
        final var dp = new int[amount + 1];
        var i = 0;
        for (i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (var coin : coins) {
            for (i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }
}
