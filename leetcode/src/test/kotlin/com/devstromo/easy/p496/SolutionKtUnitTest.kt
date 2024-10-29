package com.devstromo.easy.p496

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test next Greater Element`() {
        assertArrayEquals(
            intArrayOf(-1, 3, -1),
            solution.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2))
        )
        assertArrayEquals(
            intArrayOf(3, -1),
            solution.nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4))
        )
    }

}