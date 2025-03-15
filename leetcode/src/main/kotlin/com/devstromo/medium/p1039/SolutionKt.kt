package com.devstromo.medium.p1039

import java.util.*
import kotlin.math.min

class SolutionKt {
    fun minScoreTriangulation(values: IntArray): Int {
        val n = values.size
        val dp = Array(n) { IntArray(n) }

        // Initialize DP table with -1 (meaning uncomputed states)
        for (row in dp) {
            Arrays.fill(row, -1)
        }

        return computeMinScore(values, 0, n - 1, dp)
    }

    private fun computeMinScore(values: IntArray, i: Int, j: Int, dp: Array<IntArray>): Int {
        if (j - i < 2) return 0 // No triangulation possible

        if (dp[i][j] != -1) return dp[i][j] // Return cached result

        var minScore = Int.MAX_VALUE

        for (k in i + 1..<j) { // Choose k to form a triangle (i, k, j)
            val currentScore = (values[i] * values[j] * values[k] + computeMinScore(values, i, k, dp)
                    + computeMinScore(values, k, j, dp))
            minScore = min(minScore, currentScore)
        }

        return minScore.also { dp[i][j] = it }
    }
}