package com.devstromo.hard.p127

import java.util.*
import kotlin.collections.HashSet


class SolutionKt {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val wordSet = HashSet(wordList)
        if (!wordSet.contains(endWord)) return 0

        val queue: Queue<String> = LinkedList()
        queue.add(beginWord)
        var level = 1
        while (!queue.isEmpty()) {
            val size = queue.size // Number of words at current level
            for (i in 0..<size) {
                val word = queue.poll()
                val wordArray = word.toCharArray()

                for (j in wordArray.indices) {
                    val originalChar = wordArray[j]

                    var c = 'a'
                    while (c <= 'z') {
                        if (c == originalChar) {
                            c++
                            continue  // Skip if it's the same character
                        }

                        wordArray[j] = c
                        val newWord = String(wordArray)

                        if (newWord == endWord) return level + 1 // Found shortest path

                        if (wordSet.contains(newWord)) {
                            queue.add(newWord)
                            wordSet.remove(newWord) // Remove to avoid revisiting
                        }
                        c++
                    }
                    wordArray[j] = originalChar // Restore original character
                }
            }
            level++
        }
        return 0
    }
}