package com.devstromo.medium.p57

import kotlin.math.max
import kotlin.math.min

class SolutionKt {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val n = intervals.size
        val newIntervals: MutableList<IntArray> = ArrayList()
        var i = 0
        while (i < n && intervals[i][1] < newInterval[0]) {
            newIntervals.add(intervals[i])
            i++
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = min(newInterval[0], intervals[i][0])
            newInterval[1] = max(newInterval[1], intervals[i][1])
            i++
        }
        newIntervals.add(newInterval)

        while (i < n) {
            newIntervals.add(intervals[i])
            i++
        }

        val response = Array(newIntervals.size) { IntArray(2) }
        i = 0
        while (i < response.size) {
            response[i] = newIntervals[i]
            i++
        }
        return response
    }
}