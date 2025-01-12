package com.devstromo.hard.p1312

import kotlin.math.max

class SolutionKt {
    fun minInsertions(s: String): Int {
        val chars = s.toCharArray()
        val n = chars.size
        val dp = IntArray(n)
        dp[0] = 1
        for (i in 1..<n) {
            dp[i] = 1
            var max = 0
            for (j in i - 1 downTo 0) {
                val next = dp[j]
                if (chars[i] == chars[j]) dp[j] = 2 + max
                max = max(max, next)
            }
        }
        var max = 0
        for (i in dp) max = max(i, max)
        return n - max
    }
}