package com.devstromo.easy.p283

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solution = SolutionKt()

    @Test
    fun `Test Moving Zeros Kotlin`() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        val expected = intArrayOf(1, 3, 12, 0, 0)
        solution.moveZeroes(nums)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun `Test Moving Zeros Kotlin 2`() {
        val nums = intArrayOf(0)
        val expected = intArrayOf(0)
        solution.moveZeroes(nums)
        assertArrayEquals(expected, nums)
    }
}