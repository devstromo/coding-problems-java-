package com.devstromo.easy.p2395

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Subarrays`() {
        assertTrue(solution.findSubarrays(intArrayOf(4, 2, 4)))
        assertFalse(solution.findSubarrays(intArrayOf(1, 2, 3, 4, 5)))
        assertTrue(solution.findSubarrays(intArrayOf(0, 0, 0)))
    }
}