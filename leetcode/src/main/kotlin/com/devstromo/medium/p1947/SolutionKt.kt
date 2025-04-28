package com.devstromo.medium.p1947

class SolutionKt {
    fun maxCompatibilitySum(students: Array<IntArray>, mentors: Array<IntArray>): Int {
        val m = students.size
        val n = students[0].size

        // Precompute compatibility scores
        val score = Array(m) { IntArray(m) }
        for (i in 0 until m) {
            for (j in 0 until m) {
                var match = 0
                for (k in 0 until n) {
                    if (students[i][k] == mentors[j][k]) {
                        match++
                    }
                }
                score[i][j] = match
            }
        }

        val dp = IntArray(1 shl m)

        for (mask in 0 until (1 shl m)) {
            val studentIndex = mask.countOneBits()
            if (studentIndex >= m) continue

            for (j in 0 until m) {
                if ((mask and (1 shl j)) == 0) { // mentor j not yet assigned
                    val nextMask = mask or (1 shl j)
                    dp[nextMask] = maxOf(dp[nextMask], dp[mask] + score[studentIndex][j])
                }
            }
        }

        return dp[(1 shl m) - 1]
    }
}