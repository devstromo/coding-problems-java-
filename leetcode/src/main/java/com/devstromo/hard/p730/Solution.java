package com.devstromo.hard.p730;

import java.util.Arrays;

public class Solution {
    public int countPalindromicSubsequences(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    int low = i + 1, high = j - 1;

                    // Find the first and last occurrences of s[i] between i+1 and j-1
                    while (low <= high && s.charAt(low) != s.charAt(i)) low++;
                    while (low <= high && s.charAt(high) != s.charAt(j)) high--;

                    if (low > high) {
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 2; // No duplicate characters
                    } else if (low == high) {
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 1; // One duplicate character
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] * 2 - dp[low + 1][high - 1]; // Multiple duplicate characters
                    }
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                }

                dp[i][j] = ((dp[i][j] % MOD) + MOD) % MOD; // Normalize to prevent negative values
            }
        }

        return dp[0][n - 1];
    }

    public int countPalindromicSubsequencesBest(String s) {
        int mod = 1000000007;
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            long sum = 0;
            int[] map = new int[26];

            for (int j = i - 1; j >= 0; j--) {
                // dp[j] before = number of palindrome between j ... i-1
                // dp[j] after = number of palindrome between j ... i
                // sum = number of palindrome between j+1 ... i-1
                int prev = dp[j];
                if (chars[i] == chars[j]) {
                    dp[j] = (int) ((sum + 2) % mod);
                }
                sum += prev - map[chars[j] - 'a'];
                map[chars[j] - 'a'] = prev;
            }
        }
        //dp[i]  the number of palindrome  sequence from ith character to the end which start at ith character.
        int[] nums = new int[26];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[chars[i] - 'a'] == 0) {
                nums[chars[i] - 'a'] = dp[i];
                sum += dp[i];
            }
        }
        return (int) (sum % mod);
    }
}
