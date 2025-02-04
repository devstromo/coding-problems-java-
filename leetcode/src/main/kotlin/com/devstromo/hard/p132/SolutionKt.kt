package com.devstromo.hard.p132

import kotlin.math.min

class SolutionKt {
    fun minCut(s: String): Int {
        val n = s.length
        val isPalindrome = Array(n) { BooleanArray(n) }
        val dp = IntArray(n)
        // Step 1: Precompute Palindrome Table
        for (right in 0 until n) {
            for (left in 0..right) {
                if (s[left] == s[right] && (right - left <= 2 || isPalindrome[left + 1][right - 1])) {
                    isPalindrome[left][right] = true
                }
            }
        }
        // Step 2: Compute DP array
        for (i in 0..<n) {
            if (isPalindrome[0][i]) {
                dp[i] = 0 // No cut needed if s[0...i] is a palindrome
            } else {
                dp[i] = i // Max cuts possible (worst case)
                for (j in 0 until i) {
                    if (isPalindrome[j + 1][i]) {
                        dp[i] = min(dp[i].toDouble(), (dp[j] + 1).toDouble()).toInt()
                    }
                }
            }
        }

        return dp[n - 1] // Minimum cuts needed
    }
}