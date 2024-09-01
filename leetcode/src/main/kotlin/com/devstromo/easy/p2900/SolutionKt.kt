package com.devstromo.easy.p2900

class SolutionKt {
    fun getLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
        val result = mutableListOf<String>()
        var lastValue = -1
        for (index in words.indices) {
            if(groups[index] != lastValue) {
                lastValue = groups[index]
                result.add(words[index])
            }
        }
        return result
    }
}