package com.devstromo.medium.p50

class SolutionKt {
    fun myPow(x: Double, n: Int): Double {
        var exp = n
        var base = x
        if (exp < 0) {
            exp = -exp
            base = 1 / base
        }
        var result = 1.0000
        while (exp != 0) {
            if ((exp and 1) != 0) {
                result *= base
            }
            base *= base
            exp = exp ushr 1
        }
        return result
    }

    fun myPowBest(x: Double, n: Int): Double {
        var base = x
        var exp = n
        var res = 1.0
        if (n < 0) {
            base = 1 / base
        }

        while (exp != 0) {

            if (exp % 2 != 0) {
                res *= base
            }

            base *= base
            exp /= 2
        }
        return res
    }
}