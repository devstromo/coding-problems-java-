package com.devstromo.medium.p131

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Palindrome Partitioning`() {
        assertEquals(listOf(listOf("a", "a", "b"), listOf("aa", "b")), solution.partition("aab"))
        assertEquals(listOf(listOf("a")), solution.partition("a"))
    }

}