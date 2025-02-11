package com.devstromo.hard.p140

import java.util.HashMap

class SolutionKt {
    fun wordBreak(s: String, wordDict: List<String>): List<String> {
        return backtrack(s, HashSet(wordDict), HashMap())
    }

    private fun backtrack(s: String, wordDict: Set<String>, memo: MutableMap<String, List<String>>): List<String> {
        // If already computed, return cached result
        if (memo.containsKey(s)) return memo[s]!!

        val result: MutableList<String> = ArrayList()

        // If `s` itself is a word, add it as a valid sentence
        if (wordDict.contains(s)) {
            result.add(s)
        }

        // Try breaking the string into prefix and suffix
        for (i in 1..<s.length) {
            val prefix = s.substring(0, i)
            val suffix = s.substring(i)

            if (wordDict.contains(prefix)) {
                val subSentences = backtrack(suffix, wordDict, memo)
                for (sub in subSentences) {
                    result.add("$prefix $sub")
                }
            }
        }

        // Cache the result
        memo[s] = result
        return result
    }
}