package com.devstromo.medium.p1039

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimum Score Triangulation of Polygon`() {
        assertEquals(6, solution.minScoreTriangulation(intArrayOf(1, 2, 3)))
        assertEquals(144, solution.minScoreTriangulation(intArrayOf(3, 7, 4, 5)))
        assertEquals(13, solution.minScoreTriangulation(intArrayOf(1, 3, 1, 4, 1, 5)))
    }
}