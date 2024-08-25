package com.devstromo.easy.p674

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Length Of LCIS`() {
        assertEquals(3, solution.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7)))
        assertEquals(1, solution.findLengthOfLCIS(intArrayOf(2, 2, 2, 2, 2)))
    }

    @Test
    fun `Test Find Length Of LCIS Best`() {
        assertEquals(3, solution.findLengthOfLCISBest(intArrayOf(1, 3, 5, 4, 7)))
        assertEquals(1, solution.findLengthOfLCISBest(intArrayOf(2, 2, 2, 2, 2)))
    }

}