package com.devstromo.hard.p84

import kotlin.math.max

class SolutionKt {
    fun largestRectangleArea(heights: IntArray): Int {
        val n = heights.size
        val left = IntArray(n)
        val right = IntArray(n)
        right[n - 1] = n
        left[0] = -1
        var position: Int
        for (i in 1 until n) {
            position = i - 1
            while (position >= 0 && heights[position] >= heights[i]) position = left[position]
            left[i] = position
        }
        for (i in n - 2 downTo 0) {
            position = i + 1
            while (position < n && heights[position] >= heights[i]) position = right[position]
            right[i] = position
        }
        var max = Int.MIN_VALUE
        for (i in 0 until n) {
            max = max(max, (heights[i] * (right[i] - left[i] - 1)))
        }
        return max
    }
}