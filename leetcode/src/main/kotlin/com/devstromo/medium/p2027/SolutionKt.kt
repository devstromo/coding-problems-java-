package com.devstromo.medium.p2027

import kotlin.math.min

class SolutionKt {
    private val root = TrieNode()
    private lateinit var memo: IntArray

    fun minExtraChar(s: String, dictionary: Array<String>): Int {
        memo = IntArray(s.length) { -1 } // Use -1 to indicate unvisited state

        // Insert words into Trie
        for (word in dictionary) {
            insertIntoTrie(word)
        }

        return dfs(s, 0)
    }

    private fun insertIntoTrie(word: String) {
        var node = root
        for (c in word) {
            node.children.putIfAbsent(c, TrieNode())
            node = node.children[c]!!
        }
        node.isEnd = true
    }

    private fun dfs(s: String, i: Int): Int {
        if (i >= s.length) return 0
        if (memo[i] != -1) return memo[i]

        var minExtra = 1 + dfs(s, i + 1)

        var node = root
        for (j in i until s.length) {
            val c = s[j]
            node = node.children[c] ?: break
            if (node.isEnd) {
                minExtra = minOf(minExtra, dfs(s, j + 1))
            }
        }

        return minExtra.also { memo[i] = it }
    }

    class TrieNode {
        val children: MutableMap<Char, TrieNode> = mutableMapOf()
        var isEnd: Boolean = false
    }
}