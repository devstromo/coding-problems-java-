package com.devstromo.easy.p69

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun tesMySqrtKt() {
        assertEquals(2, solutionKt.mySqrt(4))
    }

    @Test
    fun tesMySqrt2Kt() {
        assertEquals(2, solutionKt.mySqrt(8))
    }
}