package com.devstromo.easy.p509

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun  `Test fibonacci`() {
        assertEquals(832040, solutionKt.fib(30))
        assertEquals(3, solutionKt.fib(4))
        assertEquals(832040, solutionKt.fib(30))
    }
}