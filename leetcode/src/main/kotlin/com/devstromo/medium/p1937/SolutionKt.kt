package com.devstromo.medium.p1937

class SolutionKt {
    fun maxPoints(points: Array<IntArray>): Long {
        val m = points.size
        val n = points[0].size
        var prev = LongArray(n) { points[0][it].toLong() }

        for (i in 1 until m) {
            val left = LongArray(n)
            val right = LongArray(n)
            val curr = LongArray(n)

            // Build left max array
            left[0] = prev[0]
            for (j in 1 until n) {
                left[j] = maxOf(left[j - 1] - 1, prev[j])
            }

            // Build right max array
            right[n - 1] = prev[n - 1]
            for (j in n - 2 downTo 0) {
                right[j] = maxOf(right[j + 1] - 1, prev[j])
            }

            // Calculate current row's maximum points
            for (j in 0 until n) {
                curr[j] = points[i][j] + maxOf(left[j], right[j])
            }

            prev = curr
        }

        return prev.max()
    }
}