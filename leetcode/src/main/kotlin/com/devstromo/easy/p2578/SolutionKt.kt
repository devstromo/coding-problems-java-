package com.devstromo.easy.p2578

import java.util.*

class SolutionKt {
    fun splitNum(num: Int): Int {
        val digits = num.toString().toCharArray()
        Arrays.sort(digits)
        val result = intArrayOf(0, 0)
        for (i in digits.indices) {
            result[i % 2] *= 10
            result[i % 2] += digits[i].code - '0'.code
        }
        return result[0] + result[1]
    }
}