package com.devstromo.hard.p1573

import java.util.*
import kotlin.math.min

class SolutionKt {
    fun minCost(n: Int, cuts: IntArray): Int {
        val c = cuts.size
        val extendedCuts = IntArray(c + 2)
        System.arraycopy(cuts, 0, extendedCuts, 1, c)
        extendedCuts[0] = 0
        extendedCuts[c + 1] = n
        Arrays.sort(extendedCuts)
        val dp = Array(c + 2) { IntArray(c + 2) }
        for (length in 2 until c + 2) {
            for (i in 0 until c + 2 - length) {
                val j = i + length
                dp[i][j] = Int.MAX_VALUE
                for (k in i + 1 until j) {
                    dp[i][j] =
                        min(dp[i][j], (dp[i][k] + dp[k][j] + extendedCuts[j] - extendedCuts[i]))
                }
            }
        }
        return dp[0][c + 1]
    }
}