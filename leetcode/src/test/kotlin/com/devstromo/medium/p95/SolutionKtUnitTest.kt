package com.devstromo.medium.p95

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Test Unique Binary Search Trees II")
    fun testUniqueBinarySearchTrees() {
        val result = solution.generateTrees(1)
        assertEquals(1, result.size)
        result[0]?.let { assertEquals(1, it.`val`) }

        val resultOne = solution.generateTrees(3)
        assertEquals(5, resultOne.size)

        val resultSecond = solution.generateTrees(0)
        assertTrue(resultSecond.isEmpty())
    }
}