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

    fun minDistanceBest(word1: String?, word2: String?): Int {
        if (word1.isNullOrEmpty()) return word2!!.length

        if (word2.isNullOrEmpty()) return word1.length

        // are the same characters
        if (word1[0] == word2[0]) {
            return minDistanceBest(word1.substring(1), word2.substring(1))
        }
        // Find edit distance for all three operations
        val d = minDistanceBest(word1.substring(1), word2)
        val u = minDistanceBest(word1.substring(1), word2.substring(1))
        val i = minDistanceBest(word1, word2.substring(1))
        // Return minimum of the three values plus 1
        return min(d, min(u, i)) + 1
    }
}