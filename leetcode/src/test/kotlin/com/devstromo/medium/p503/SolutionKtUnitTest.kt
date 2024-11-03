package com.devstromo.medium.p503

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Next Greater Elements in Circular Array`() {
        assertArrayEquals(intArrayOf(2, -1, 2), solution.nextGreaterElements(intArrayOf(1, 2, 1)))
        assertArrayEquals(intArrayOf(2, 3, 4, -1, 4), solution.nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)))
    }
}