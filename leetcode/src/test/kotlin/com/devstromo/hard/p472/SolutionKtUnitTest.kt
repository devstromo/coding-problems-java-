package com.devstromo.hard.p472

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Concatenated Words`() {
        val expected1: Set<String> = HashSet(listOf("catsdogcats", "dogcatsdog", "ratcatdogcat"))
        val actual1: Set<String> = HashSet(
            solution.findAllConcatenatedWordsInADict(
                arrayOf(
                    "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
                )
            )
        )
        assertEquals(expected1, actual1)

        val expected2: Set<String> = HashSet(listOf("catdog"))
        val actual2: Set<String> = HashSet(
            solution.findAllConcatenatedWordsInADict(
                arrayOf(
                    "cat", "dog", "catdog"
                )
            )
        )
        assertEquals(expected2, actual2)
    }

    @Test
    fun `Test Concatenated Words Best`() {
        val expected1: Set<String> = HashSet(listOf("catsdogcats", "dogcatsdog", "ratcatdogcat"))
        val actual1: Set<String> = HashSet(
            solution.findAllConcatenatedWordsInADictBest(
                arrayOf(
                    "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
                )
            )
        )
        assertEquals(expected1, actual1)
    }
}