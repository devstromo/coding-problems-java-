package com.devstromo.easy.p674

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testFindLengthOfLCIS() {
        assertEquals(3, solution.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7)))
    }

    @Test
    fun testFindLengthOfLCIS2() {
        assertEquals(1, solution.findLengthOfLCIS(intArrayOf(2, 2, 2, 2, 2)))
    }

}