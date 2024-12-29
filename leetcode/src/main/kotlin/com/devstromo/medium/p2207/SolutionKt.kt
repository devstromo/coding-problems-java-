package com.devstromo.medium.p2207

import kotlin.math.max

class SolutionKt {
    fun maximumSubsequenceCount(text: String, pattern: String): Long {
        val firstChar = pattern[0].code
        val secondChar = pattern[1].code

        if (firstChar == secondChar) {
            var count: Long = 0
            var freq = 0

            for (c in text.toCharArray()) {
                if (c.code == firstChar) {
                    count += freq
                    freq++
                }
            }

            return count + freq
        }

        var first: Long = 0
        var second: Long = 0

        var result: Long = 0

        for (c in text.toCharArray()) {
            if (c.code == firstChar) {
                first++
            } else if (c.code == secondChar) {
                result += first
                second++
            }
        }

        return result + max(first, second)
    }
}