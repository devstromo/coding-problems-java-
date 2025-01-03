package com.devstromo.medium.p240

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `test Search Matrix`() {
        assertTrue(
            solution.searchMatrix(
                arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ), 5
            )
        )
        assertFalse(
            solution.searchMatrix(
                arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ), 20
            )
        )
    }

    @Test
    fun `test Search Matrix Best Solution`() {
        assertTrue(
            solution.searchMatrixBest(
                arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ), 5
            )
        )
        assertFalse(
            solution.searchMatrixBest(
                arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ), 20
            )
        )
    }

}