package com.devstromo.easy.p746

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Min Cost Climbing Stairs`() {
        assertEquals(15, solution.minCostClimbingStairs(intArrayOf(10, 15, 20)))
        assertEquals(6, solution.minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))

    }

    @Test
    fun `Test Min Cost Climbing Stairs With No additional space`() {
        assertEquals(15, solution.minCostClimbingStairsNoAdditionalSpace(intArrayOf(10, 15, 20)))
        assertEquals(6, solution.minCostClimbingStairsNoAdditionalSpace(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))

    }

    @Test
    fun `Test Min Cost Climbing Stairs With Best solution`() {
        assertEquals(15, solution.minCostClimbingStairsBest(intArrayOf(10, 15, 20)))
        assertEquals(6, solution.minCostClimbingStairsBest(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))

    }
}