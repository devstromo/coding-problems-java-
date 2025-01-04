package com.devstromo.easy.p263

class SolutionKt {

    fun isUgly(n: Int): Boolean {
        var nums = n
        var i = 2
        while (nums > 0 && i < 6) {
            while (nums % i == 0) nums /= i
            i++
        }
        return nums == 1
    }
}