package com.devstromo.hard.p472

import java.util.*

class SolutionKt {
    private val concatenatedWords: MutableMap<String, Boolean> = mutableMapOf()
    private val wordSet: MutableSet<String> = mutableSetOf()
    private val result: MutableList<String> = mutableListOf()
    fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {

        // Sort the words by length to ensure shorter words are processed first
        Arrays.sort(words, Comparator.comparingInt { obj: String -> obj.length })

        // HashSet to store all the words that have been processed so far
        val wordSet: MutableSet<String> = HashSet()

        // List to store the result
        val result: MutableList<String> = ArrayList()
        for (word in words) {
            if (canForm(word, wordSet)) {
                result.add(word)
            }
            wordSet.add(word)
        }

        return result
    }

    fun findAllConcatenatedWordsInADictBest(words: Array<String>): List<String> {
        wordSet.addAll(words)
        for (word in words) {
            if (isConcatenated(word)) {
                result.add(word)
            }
        }
        return result
    }

    private fun canForm(word: String, wordSet: Set<String>): Boolean {
        if (wordSet.isEmpty()) return false

        val n = word.length
        val dp = BooleanArray(n + 1)
        dp[0] = true // Empty string is always true

        for (i in 1..n) {
            for (j in 0..<i) {
                if (!dp[j]) continue  // If dp[j] is false, skip


                val substring = word.substring(j, i)
                if (wordSet.contains(substring)) {
                    dp[i] = true
                    break // No need to check further for this i
                }
            }
        }

        return dp[n]
    }

    private fun isConcatenated(word: String): Boolean {
        if (concatenatedWords.contains(word)) {
            return concatenatedWords[word]!!
        }
        for (i in 1..<(word.length)) {
            if (wordSet.contains(word.substring(0, i))) {
                if (wordSet.contains(word.substring(i))) {
                    concatenatedWords[word] = true
                    return true
                }
                if (isConcatenated(word.substring(i))) {
                    concatenatedWords[word] = true
                    return true
                } else {
                    concatenatedWords[word] = false
                }
            }
        }
        return false
    }
}