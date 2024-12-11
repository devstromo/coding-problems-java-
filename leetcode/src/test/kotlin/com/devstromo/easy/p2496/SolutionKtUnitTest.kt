package com.devstromo.easy.p2496

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Maximum Value`() {
        assertEquals(5, solution.maximumValue(arrayOf("alic3", "bob", "3", "4", "00000")))
        assertEquals(1, solution.maximumValue(arrayOf("1", "01", "001", "0001")))
    }
}