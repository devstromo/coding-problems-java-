package com.devstromo.medium.p2266

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Count Number of Texts`() {
        Assertions.assertEquals(8, solution.countTexts("22233"))
        Assertions.assertEquals(82876089, solution.countTexts("222222222222222222222222222222222222"))
    }
}