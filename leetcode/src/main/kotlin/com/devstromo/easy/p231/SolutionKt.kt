package com.devstromo.easy.p231

class SolutionKt {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && (n and (n - 1)) == 0
    }
}