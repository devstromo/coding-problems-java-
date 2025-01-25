package com.devstromo.medium.p712

import kotlin.math.max

class SolutionKt {

    fun minimumDeleteSum(s1: String, s2: String): Int {
        val first: CharArray = s1.toCharArray()
        val second: CharArray = s2.toCharArray()
        val m = first.size
        val n = second.size
        var total = 0
        var previous = IntArray(n + 1)
        var current = IntArray(n + 1)

        for (i in 1..m) {
            total += first[i - 1].code
            for (j in 1..n) {
                if (first[i - 1] == second[j - 1]) current[j] = first[i - 1].code + previous[j - 1]
                else current[j] = max(current[j - 1], previous[j])
            }
            val temp = previous
            previous = current
            current = temp
        }

        for (c in second) total += c.code

        return total - 2 * previous[n]
    }
}