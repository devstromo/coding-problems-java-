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

    fun isUglyBest(n: Int): Boolean {
        if (n < 1) return false
        if (n < 2) return true

        var i = n
        while (i % 2 == 0) i /= 2
        while (i % 3 == 0) i /= 3
        while (i % 5 == 0) i /= 5

        return i == 1
    }
}