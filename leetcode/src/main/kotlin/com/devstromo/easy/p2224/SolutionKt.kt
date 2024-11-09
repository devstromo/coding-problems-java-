package com.devstromo.easy.p2224

class SolutionKt {

    fun convertTime(current: String, correct: String): Int {
        val increments: IntArray = intArrayOf(60, 15, 5, 1)
        val currentTime =
            ((((current[0].code - '0'.code) * 10) + (current[1].code - '0'.code)) * 60) + ((current[3].code - '0'.code) * 10) + (current[4].code - '0'.code)
        val correctTime =
            ((((correct[0].code - '0'.code) * 10) + (correct[1].code - '0'.code)) * 60) + ((correct[3].code - '0'.code) * 10) + (correct[4].code - '0'.code)
        var operations = 0
        var difference = correctTime - currentTime
        for (increment in increments) {
            operations += (difference / increment)
            difference %= increment
        }
        return operations
    }
}