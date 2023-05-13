package com.devstromo.medium.p2466;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int countGoodStrings(int low, int high, int zero, int one) {
        var dp = new HashMap<Integer, Integer>();
        dp.put(0, 1);
        var mod = (int) 1e9 + 7;
        for (var i = 1; i <= high; i++) {
            var z = dp.getOrDefault(i - zero, 0);
            var o = dp.getOrDefault(i - one, 0);
            var n = (z + o) % mod;
            dp.put(i, n);
        }
        var ans = 0;
        for (var i = low; i <= high; i++) {
            ans = (ans + dp.getOrDefault(i, 0)) % mod;
        }
        return ans;
    }

    public static int countGoodStrings1(int low, int high, int zero, int one) {
        var mod = (int) 1e9 + 7;
        var dp = new int[high + 1];
        dp[0] = 1;
        for (var i = 1; i <= high; i++) {
            var z = (i - zero >= 0) ? dp[i - zero] : 0;
            var o = (i - one >= 0) ? dp[i - one] : 0;
            dp[i] = (z + o) % mod;
        }
        Arrays.stream(dp).forEach(System.out::println);
        var ans = 0;
        for (var i = low; i <= high; i++) {
            ans = (ans + dp[i]) % mod;
        }
        return ans;
    }
}