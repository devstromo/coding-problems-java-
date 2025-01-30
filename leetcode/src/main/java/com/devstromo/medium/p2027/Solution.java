package com.devstromo.medium.p2027;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 1; j <= i; j++) {
                if (dictSet.contains(s.substring(j - 1, i))) {
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
            }
        }
        return dp[n];
    }
}
