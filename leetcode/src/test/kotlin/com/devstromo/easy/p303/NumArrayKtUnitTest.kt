package com.devstromo.easy.p303

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumArrayKtUnitTest {
    @Test
    fun `Test num array`() {
        val numArray = NumArrayKt(intArrayOf(-2, 0, 3, -5, 2, -1))
        assertEquals(1, numArray.sumRange(0, 2))
        assertEquals(-1, numArray.sumRange(2, 5))
        assertEquals(-3, numArray.sumRange(0, 5))
    }
}