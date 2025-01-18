package com.devstromo.medium.p139

class SolutionKt {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val wordSet: Set<String> = HashSet(wordDict)
        val n = s.length
        val dp = BooleanArray(n + 1)
        dp[0] = true

        for (i in 1..n) {
            for (j in 0..<i) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true
                    break
                }
            }
        }

        return dp[n]
    }
}