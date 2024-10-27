package com.devstromo.medium.p1049

class SolutionKt {
    fun lastStoneWeightII(stones: IntArray): Int {
        var totalSum = 0
        for (stone in stones) {
            totalSum += stone
        }

        val target = totalSum / 2
        val dp = BooleanArray(target + 1)
        dp[0] = true

        for (stone in stones) {
            for (j in target downTo stone) {
                dp[j] = dp[j] || dp[j - stone]
            }
        }

        var maxPossibleSum = 0
        for (i in target downTo 0) {
            if (dp[i]) {
                maxPossibleSum = i
                break
            }
        }

        return totalSum - 2 * maxPossibleSum
    }
}