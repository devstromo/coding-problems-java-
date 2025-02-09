package com.devstromo.medium.p264

import kotlin.math.min

class SolutionKt {
    fun nthUglyNumber(n: Int): Int {
        val dp = IntArray(n)
        dp[0] = 1

        var p2 = 0
        var p3 = 0
        var p5 = 0
        for (i in 1..<n) {
            val nextUgly = min((dp[p2] * 2), min((dp[p3] * 3), (dp[p5] * 5)))
            dp[i] = nextUgly

            // Move pointers to avoid duplicates
            if (dp[p2] * 2 == nextUgly) p2++
            if (dp[p3] * 3 == nextUgly) p3++
            if (dp[p5] * 5 == nextUgly) p5++
        }
        return dp[n - 1]
    }
}