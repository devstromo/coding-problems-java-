package com.devstromo.easy.p1668

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    @Test
    fun `Test Max Repeating`() {
        assertEquals(2, maxRepeating("ababc", "ab"))
    }

    @Test
    fun `Test Max Repeating 2`() {
        assertEquals(1, maxRepeating("ababc", "ba"))
    }

    @Test
    fun `Test Max Repeating 3`() {
        assertEquals(0, maxRepeating("ababc", "ac"))
    }

    @Test
    fun `Test Max Repeating 4`() {
        assertEquals(1, maxRepeating("a", "a"))
    }

    @Test
    fun `Test Max Repeating 5`() {
        assertEquals(0, maxRepeating("a", "c"))
    }

    @Test
    fun `Test Max Repeating 6`() {
        assertEquals(5, maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"))
    }
}