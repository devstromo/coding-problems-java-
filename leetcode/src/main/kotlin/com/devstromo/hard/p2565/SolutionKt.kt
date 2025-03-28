package com.devstromo.hard.p2565

import kotlin.math.min

class SolutionKt {
    fun minimumScore(s: String, t: String): Int {
        val m = s.length
        val n = t.length

        // left[i] is the maximum index in s that matches t[0..i-1]
        val left = IntArray(n) { -1 }
        // right[i] is the minimum index in s that matches t[i..n-1]
        val right = IntArray(n) { -1 }

        // Preprocess left array
        var j = 0
        for (i in 0 until n) {
            while (j < m && s[j] != t[i]) {
                j++
            }
            if (j < m) {
                left[i] = j
                j++
            } else {
                left[i] = -1
            }
        }

        // Preprocess right array
        j = m - 1
        for (i in n - 1 downTo 0) {
            while (j >= 0 && s[j] != t[i]) {
                j--
            }
            if (j >= 0) {
                right[i] = j
                j--
            } else {
                right[i] = -1
            }
        }

        // Check if the entire t is a subsequence of s
        if (left[n - 1] != -1) {
            return 0
        }

        var minScore = n // worst case: remove all characters

        // Check for cases where the suffix is enough (l = 0)
        for (r in 0 until n) {
            if (right[r] != -1) {
                minScore = minOf(minScore, r)
                break
            }
        }

        // Check for cases where the prefix is enough (r = n - 1)
        for (l in n - 1 downTo 0) {
            if (left[l] != -1) {
                minScore = minOf(minScore, n - 1 - l)
                break
            }
        }

        // Now check for cases where left[l] and right[r] are valid and l + 1 <= r - 1
        for (l in 0 until n) {
            if (left[l] == -1) continue
            val r = findMinR(right, left[l], l + 1)
            if (r != -1) {
                val currentScore = r - l - 1
                minScore = minOf(minScore, currentScore)
            }
        }

        return minScore
    }

    private fun findMinR(right: IntArray, leftPos: Int, start: Int): Int {
        var left = start
        var rightBound = right.size - 1
        var result = -1

        while (left <= rightBound) {
            val mid = left + (rightBound - left) / 2
            if (right[mid] > leftPos) {
                result = mid
                rightBound = mid - 1
            } else {
                left = mid + 1
            }
        }

        return result
    }
}