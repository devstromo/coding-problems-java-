package com.devstromo.medium.p2266;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char currentChar = pressedKeys.charAt(i - 1);
            dp[i] = 0;
            int maxPress = (currentChar == '7' || currentChar == '9') ? 4 : 3;

            for (int j = 1; j <= maxPress && i - j >= 0; j++) {
                if (pressedKeys.charAt(i - j) != currentChar) break;
                dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }

        return dp[n];
    }
}
