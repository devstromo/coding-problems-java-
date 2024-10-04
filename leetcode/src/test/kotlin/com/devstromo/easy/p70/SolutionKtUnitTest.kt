package com.devstromo.easy.p70

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testClimbStairs() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    fun testClimbStairs2() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    fun testClimbStairs3() {
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    fun testClimbStairsBestSolution() {
        assertEquals(2, solution.climbStairsBestSolution(2));
    }

    @Test
    fun testClimbStairsBestSolution2() {
        assertEquals(3, solution.climbStairsBestSolution(3));
    }

    @Test
    fun testClimbStairsBestSolution3() {
        assertEquals(5, solution.climbStairsBestSolution(4));
    }

}