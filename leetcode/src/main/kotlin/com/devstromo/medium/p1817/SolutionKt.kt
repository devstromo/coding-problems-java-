package com.devstromo.medium.p1817

import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun canReach(s: String, minJump: Int, maxJump: Int): Boolean {
        val n = s.length - 1
        if (s[n] != '0') {
            return false
        }
        var low = n - maxJump
        var high = n - minJump
        while (low > 0) {
            var max = -1
            var min = n + 1
            for (i in low..high) {
                if (s[i] == '0') {
                    min = min(min, i - maxJump)
                    max = max(max, i - minJump)
                }
            }
            if (max < 0) {
                return false
            }
            high = min(low - 1, max)
            low = min
        }

        return true
    }
}