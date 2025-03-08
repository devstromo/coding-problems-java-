package com.devstromo.medium.p130

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Test Surrounded Regions")
    fun testSurroundedRegions() {
        val expected = arrayOf(
            charArrayOf('X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'X', 'X', 'X'),
        )
        val input = arrayOf(
            charArrayOf('X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X', 'X'),
            charArrayOf('X', 'X', 'O', 'X', 'X'),
            charArrayOf('X', 'O', 'X', 'X', 'X'),
        )
        solution.solve(input)
        assertArrayEquals(expected, input)
        val expected1 = arrayOf(
            charArrayOf('X')
        )
        val input1 = arrayOf(
            charArrayOf('X')
        )
        solution.solve(input1)
        assertArrayEquals(expected1, input1)
    }
}