package com.devstromo.medium

import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun findLongestChain(pairs: Array<IntArray>): Int {
        var minLow = Int.MAX_VALUE
        var maxEnd = Int.MIN_VALUE
        for (pair in pairs) {
            val first = pair[0]
            val second = pair[1]
            minLow = min(minLow, first)
            maxEnd = max(maxEnd, second)
        }
        val aux = IntArray(maxEnd - minLow + 2)
        for (pair in pairs) {
            val first = pair[0] - minLow + 1
            val second = pair[1] - minLow + 1
            aux[second] = max(aux[second], first)
        }
        var curMax = 0
        var answer = 0
        for (r in 1..(maxEnd - minLow + 1)) {
            if (aux[r] > curMax) {
                curMax = r
                ++answer
            }
        }
        return answer
    }
}