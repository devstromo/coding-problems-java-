package com.devstromo.medium.p1049

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Last Stone Weight II`() {
        assertEquals(1, solutionKt.lastStoneWeightII(intArrayOf(2, 7, 4, 1, 8, 1)))
        assertEquals(5, solutionKt.lastStoneWeightII(intArrayOf(31, 26, 33, 21, 40)))
    }
}