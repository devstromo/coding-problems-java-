package com.devstromo.medium.p56

import kotlin.math.max
import kotlin.math.min

const val EMPTY = 0.toByte()
const val START = 1.toByte()
const val END = 2.toByte()

class SolutionKt {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val merged = mutableListOf<IntArray>()

        for (interval in intervals) {
            if (merged.isEmpty() || merged.last()[1] < interval[0]) {
                merged.add(interval)
            } else {
                merged.last()[1] = maxOf(merged.last()[1], interval[1])
            }
        }

        return merged.toTypedArray()
    }

    fun mergeBest(intervals: Array<IntArray>): Array<IntArray> {
        val arr = ByteArray(10_001)
        var min = Int.MAX_VALUE
        var max = 0
        for (interval in intervals) {
            val (first, last) = interval
            min = min(min, first)
            max = max(max, last)
            var i = first
            while (i < last) {
                arr[i++] = START
            }
            if (arr[last] == EMPTY) {
                arr[last] = END
            }
        }
        val result = mutableListOf<IntArray>()
        var start = -1
        for(i in min..max) {
            when(arr[i]) {
                START -> if (start == -1) start = i
                END -> {
                    if (start == -1) start = i
                    result.add(intArrayOf(start, i))
                    start = -1
                }
            }
        }
        return result.toTypedArray()
    }
}