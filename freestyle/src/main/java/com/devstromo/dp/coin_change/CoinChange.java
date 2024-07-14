package com.devstromo.dp.coin_change;

import java.util.HashMap;
import java.util.Map;

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

    public int solutionMemo(int[] coins, int amount) {
        final var memo = new HashMap<Integer, Integer>();
        return coinChangeMemo(coins, amount, memo);
    }

    private int coinChangeMemo(int[] coins, int amount, Map<Integer, Integer> memo) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        var minCoins = Integer.MAX_VALUE;
        for (var coin : coins) {
            final var result = coinChangeMemo(coins, amount - coin, memo);
            if (result >= 0 && result < minCoins) {
                minCoins = result + 1;
            }
        }
        memo.put(amount, (minCoins == Integer.MAX_VALUE) ? -1 : minCoins);
        return memo.get(amount);
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }
}
