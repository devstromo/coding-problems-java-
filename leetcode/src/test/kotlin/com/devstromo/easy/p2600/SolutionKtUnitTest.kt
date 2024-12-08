package com.devstromo.easy.p2600

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test K Items With Maximum Sum`() {
        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2))
        assertEquals(3, solution.kItemsWithMaximumSum(3, 2, 0, 4))
    }
}