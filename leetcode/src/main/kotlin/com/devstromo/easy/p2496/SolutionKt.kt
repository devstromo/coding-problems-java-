package com.devstromo.easy.p2496

import kotlin.math.max

class SolutionKt {
    fun maximumValue(strs: Array<String>): Int {
        var max = Int.MIN_VALUE
        for (s in strs) {
            var isNumber = true
            for (element in s) {
                if (Character.isAlphabetic(element.code)) {
                    max = max(max, s.length)
                    isNumber = false
                    break
                }
            }
            if (isNumber) {
                max = max(max, s.toInt())
            }
        }
        return max
    }
}