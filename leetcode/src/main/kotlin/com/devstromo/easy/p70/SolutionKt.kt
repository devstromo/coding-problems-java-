package com.devstromo.easy.p70

class SolutionKt {
    fun climbStairs(n: Int): Int {
        if (n <= 2) return n;
        var n1 = 1
        var n2 = 2
        var index = 3
        while (index <= n) {
            val n3 = n1 + n2;
            n1 = n2
            n2 = n3
            index++
        }

        return n2;
    }

    fun climbStairsBestSolution(n: Int): Int {
        if (n <= 3) return n
        var m1 = 2
        var m2 = 3
        repeat(n - 3) {
            val tm1 = m1
            m1 = m2
            m2 += tm1
        }
        return m2
    }
}