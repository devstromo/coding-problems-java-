package com.devstromo.hard.p132;

public class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int[] dp = new int[n];

        // Step 1: Precompute Palindrome Table
        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || isPalindrome[left + 1][right - 1])) {
                    isPalindrome[left][right] = true;
                }
            }
        }

        // Step 2: Compute DP array
        for (int i = 0; i < n; i++) {
            if (isPalindrome[0][i]) {
                dp[i] = 0; // No cut needed if s[0...i] is a palindrome
            } else {
                dp[i] = i; // Max cuts possible (worst case)
                for (int j = 0; j < i; j++) {
                    if (isPalindrome[j + 1][i]) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }

        return dp[n - 1]; // Minimum cuts needed
    }
}
