package com.devstromo.medium.p334

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Increasing Triplet`() {
        assertTrue(solution.increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
        assertTrue(solution.increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
        assertFalse(solution.increasingTriplet(intArrayOf(5, 4, 3, 2, 1)))
    }
}