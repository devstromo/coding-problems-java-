package com.devstromo.easy.p1137

class SolutionKt {
    fun tribonacci(n: Int): Int {
        if (n <= 1) return n
        if (n == 2) return 1
        var a = 0
        var b = 1
        var c = 1
        var d: Int
        for (i in 3..n) {
            d = a + b + c
            a = b
            b = c
            c = d
        }
        return c
    }
}