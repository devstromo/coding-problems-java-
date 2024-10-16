package com.devstromo.easy.p643

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()
    private val tolerance = 1e-5

    @Test
    fun `Test Maximum Average Subarray`() {
        Assertions.assertEquals(12.75000, solutionKt.findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4), tolerance)
        Assertions.assertEquals(5.0000, solutionKt.findMaxAverage(intArrayOf(5), 1), tolerance)
    }
}