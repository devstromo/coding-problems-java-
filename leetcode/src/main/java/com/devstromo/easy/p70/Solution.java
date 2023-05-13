package com.devstromo.easy.p70;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int climbStairs(int n) {
        var dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (var i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairsOldJava(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairsRecursive(int n) {
        return fib(n, new HashMap<>());
    }

    public int climbStairsBestSolution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int n1 = 1;
        int n2 = 2;
        int n3 = 0;

        for(int i = 2; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    private static int fib(int n, Map<Integer, Integer> memo) {
        if (n < 2)
            return 1;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }
}
