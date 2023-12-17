package com.devstromo.medium.p739

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Daily Temperatures`() {
        val input = intArrayOf(58, 56, 61, 55, 57, 44, 40, 35, 46)
        val expected = intArrayOf(2, 1, 0, 1, 0, 3, 2, 1, 0)
        assertArrayEquals(expected, solution.dailyTemperatures(input))
    }

    @Test
    fun `Test Daily Temperatures 2`() {
        val input = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
        val expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)
        assertArrayEquals(expected, solution.dailyTemperatures(input))
    }

    @Test
    fun `Test Daily Temperatures 3`() {
        val input = intArrayOf(30, 40, 50, 60)
        val expected = intArrayOf(1, 1, 1, 0)
        assertArrayEquals(expected, solution.dailyTemperatures(input))
    }

    @Test
    fun `Test Daily Temperatures 4`() {
        val input = intArrayOf(30, 60, 90)
        val expected = intArrayOf(1, 1, 0)
        assertArrayEquals(expected, solution.dailyTemperatures(input))
    }
}