package com.devstromo.medium.p167

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Two Sum`() {
        assertArrayEquals(intArrayOf(1, 2), solutionKt.twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(1, 3), solutionKt.twoSum(intArrayOf(2, 3, 4), 6))
        assertArrayEquals(intArrayOf(1, 2), solutionKt.twoSum(intArrayOf(-1, 0), -1))
    }
}