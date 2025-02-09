package com.devstromo.hard.p127

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Word Ladder`() {
        assertEquals(5, solution.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
        assertEquals(0, solution.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
    }
}