package com.devstromo.easy.p169

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Majority Element`() {
        assertEquals(3, solution.majorityElement(intArrayOf(3, 2, 3)))
        assertEquals(2, solution.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }

    @Test
    fun `Test Majority Element Best`() {
        assertEquals(3, solution.majorityElementBest(intArrayOf(3, 2, 3)))
        assertEquals(2, solution.majorityElementBest(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }

}