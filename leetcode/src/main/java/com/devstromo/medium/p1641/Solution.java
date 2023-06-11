package com.devstromo.medium.p1641;

class Solution {
    public static int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5; k++) {
                dp[i][k] = dp[i][k - 1];
                if (i == 1) {
                    dp[i][k]++;
                } else {
                    dp[i][k] += dp[i - 1][k];
                }
            }
        }
        return dp[n][5];
    }

    public static int countVowelStringsBest(int n) {
        int count = 0;
        count += solve('a', n - 1, 0);
        count += solve('e', n - 1, 0);
        count += solve('i', n - 1, 0);
        count += solve('o', n - 1, 0);
        count += solve('u', n - 1, 0);
        return count;
    }

    public static int solve(char a, int n, int count) {
        if (n == 0) {
            count++;
            return count;
        }

        int lastCount = count;
        if (a >= 'a')
            count += solve('a', n - 1, lastCount);
        if (a >= 'e')
            count += solve('e', n - 1, lastCount);
        if (a >= 'i')
            count += solve('i', n - 1, lastCount);
        if (a >= 'o')
            count += solve('o', n - 1, lastCount);
        if (a >= 'u')
            count += solve('u', n - 1, lastCount);
        return count;
    }
}
