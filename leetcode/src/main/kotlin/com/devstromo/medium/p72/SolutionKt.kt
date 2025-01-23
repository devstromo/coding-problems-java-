package com.devstromo.medium.p72

import kotlin.math.min

class SolutionKt {
    fun minDistance(word1: String, word2: String): Int {
        val m = word1.length
        val n = word2.length
        val edit = Array(m + 1) { IntArray(n + 1) }
        for (i in 0..m) {
            edit[i][0] = i
        }
        for (i in 0..n) {
            edit[0][i] = i
        }
        for (i in 1..m) {
            for (j in 1..n) {
                if (word1[i - 1] == word2[j - 1]) {
                    edit[i][j] = edit[i - 1][j - 1]
                } else {
                    edit[i][j] = min(edit[i - 1][j - 1], min(edit[i][j - 1], edit[i - 1][j])) + 1
                }
            }
        }
        return edit[m][n]
    }
}