package com.devstromo.medium.p91;

import java.util.Arrays;

public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return dfs(0, s, dp);
    }

    private int dfs(int index, String s, int[] dp) {
        if (index == s.length()) return 1; // Reached end: 1 valid decoding path
        if (s.charAt(index) == '0') return 0; // '0' can't start a valid code
        if (dp[index] != -1) return dp[index];

        int result = dfs(index + 1, s, dp);

        if (index + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(index, index + 2));
            if (num >= 10 && num <= 26) {
                result += dfs(index + 2, s, dp);
            }
        }

        dp[index] = result;
        return result;
    }
}
