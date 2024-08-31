package com.devstromo.medium.p5

import kotlin.math.max

class SolutionKt {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return ""
        }
        val n = s.length
        var start = 0
        var end = 0
        for (i in 0 until n) {
            val len1 = expandAroundCenter(s, i, i)
            val len2 = expandAroundCenter(s, i, i + 1)
            val len = max(len1, len2)
            if (len > end - start) {
                start = i - (len - 1) / 2
                end = i + len / 2
            }
        }
        return s.substring(start, end + 1)
    }

    private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
        var low = left
        var upper = right
        while (low >= 0 && upper < s.length && s[low] == s[upper]) {
            low--
            upper++
        }
        return upper - low - 1
    }
}