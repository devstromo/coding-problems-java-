package com.devstromo.easy.p69

class SolutionKt {
    fun mySqrt(x: Int): Int {
        if (x <= 1) return x
        var start = 0L
        var end = x.toLong()
        val controlValue = end
        while (start <= end) {
            val mid = (start + end) / 2
            if (mid * mid == controlValue) {
                return mid.toInt()
            } else if (mid * mid < controlValue) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return (start - 1).toInt()
    }
}