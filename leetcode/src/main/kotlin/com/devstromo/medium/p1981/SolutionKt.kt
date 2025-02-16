package com.devstromo.medium.p1981

import kotlin.math.abs
import kotlin.math.min

class SolutionKt {
    fun minimizeTheDifference(mat: Array<IntArray>, target: Int): Int {
        val m = mat.size
        val n = mat[0].size

        // Initialize the DP array
        var dp = BooleanArray(4901) // 70 * 70 = 4900
        dp[0] = true

        // Iterate through each row
        for (i in 0..<m) {
            val newDp = BooleanArray(4901)
            for (j in 0..<n) {
                val num = mat[i][j]
                for (k in 0..4900) {
                    if (dp[k] && k + num <= 4900) {
                        newDp[k + num] = true
                    }
                }
            }
            dp = newDp
        }

        // Find the sum closest to the target
        var minDiff = Int.MAX_VALUE
        for (i in 0..4900) {
            if (dp[i]) {
                minDiff = min(minDiff, abs((i - target)))
            }
        }

        return minDiff
    }
}