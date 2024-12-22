package com.devstromo.medium.p435

import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        var max = intervals[0][1]
        var min = max
        for (i in 1..<intervals.size) {
            max = max(max, intervals[i][1])
            min = min(min, intervals[i][1])
        }

        val shift = 1 - min
        val farthestEnds = IntArray(max - min + 2)
        for (interval in intervals) {
            val left = interval[0] + shift
            val right = interval[1] + shift
            if (farthestEnds[right] < left) {
                farthestEnds[right] = left
            }
        }

        var count = 0
        var i = 1
        var start = 0
        while (i < farthestEnds.size) {
            if (start <= farthestEnds[i]) {
                count++
                start = i
            }
            i++
        }
        return intervals.size - count
    }
}