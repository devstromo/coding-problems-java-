package com.devstromo.easy.p1952

val set = setOf(4, 9, 25, 49, 121, 169, 289, 361, 529, 841, 961, 1369, 1681, 1849, 2209, 2809, 3481, 3721, 4489, 5041, 5329, 6241, 6889, 7921, 9409, 10201)
class SolutionKt {
    fun isThree(n: Int): Boolean {
        return set.contains(n)
    }
}