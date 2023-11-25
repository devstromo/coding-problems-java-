package com.devstromo.easy.p191

class SolutionKt {
    fun hammingWeight(n: Int): Int {
        var bits = n
        var count = 0
        while (bits != 0) {
            count += bits and 1
            bits = bits ushr 1
        }
        return count
    }

    fun hammingWeightBest(n: Int): Int {
        var count = 0
        var num = n
        while (num != 0) {
            num = num and (num - 1)
            count++
        }
        return count
    }
}