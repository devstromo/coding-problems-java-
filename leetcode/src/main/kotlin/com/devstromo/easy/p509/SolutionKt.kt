package com.devstromo.easy.p509

class SolutionKt {
    fun fib(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        val fib = IntArray(n + 1)
        fib[0] = 0
        fib[1] = 1

        for (i in 2..n) {
            fib[i] = fib[i - 1] + fib[i - 2]
        }
        return fib[n]
    }

    fun fibBest(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1

        var prev = 1
        var secondPrev = 0
        var fib = 0
        for (i in 2..n) {
            fib = secondPrev + prev
            secondPrev = prev
            prev = fib
        }
        return fib
    }
}