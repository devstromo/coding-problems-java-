package com.devstromo.medium.p1477

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Test Find Two Non-overlapping Sub-arrays Each With Target SumLength")
    fun findTwoNonOverlappingSubarrays() {
        assertEquals(2, solution.minSumOfLengths(intArrayOf(3, 2, 2, 4, 3), 3))
        assertEquals(2, solution.minSumOfLengths(intArrayOf(7, 3, 4, 7), 7))
        assertEquals(-1, solution.minSumOfLengths(intArrayOf(4, 3, 2, 6, 2, 3, 4), 6))
    }
}