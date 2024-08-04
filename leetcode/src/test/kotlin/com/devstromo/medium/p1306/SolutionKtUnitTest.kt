package com.devstromo.medium.p1306

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solutionKt = SolutionKt()

    @Test
    fun `Test Jump Game III`() {
        assertTrue(solutionKt.canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5))
        assertTrue(solutionKt.canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0))
        assertFalse(solutionKt.canReach(intArrayOf(3, 0, 2, 1, 2), 2))
    }

    @Test
    fun `Test Jump Game III Recursive`() {
        assertTrue(solutionKt.canReachRecursive(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5))
        assertTrue(solutionKt.canReachRecursive(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0))
        assertFalse(solutionKt.canReachRecursive(intArrayOf(3, 0, 2, 1, 2), 2))
    }

}