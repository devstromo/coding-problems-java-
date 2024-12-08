package com.devstromo.easy.p2600

class SolutionKt {
    fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int): Int {
        if (k <= numOnes) return k
        val sum = numOnes + numZeros
        val sumValues = numOnes + numZeros + numNegOnes
        if (k in (sum + 1)..sumValues) return numOnes - (k - sum)
        return numOnes
    }
}