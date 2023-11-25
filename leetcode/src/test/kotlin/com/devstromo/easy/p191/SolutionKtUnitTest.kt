package com.devstromo.easy.p191

import com.devstromo.easy.p191.SolutionKt
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solutionKt = SolutionKt()

    @Test
    fun testHammingWeightKt() {
        assertEquals(3, solutionKt.hammingWeight(11))
    }

    @Test
    fun testHammingWeightKt2() {
        assertEquals(1, solutionKt.hammingWeight(128))
    }

    @Test
    fun testHammingWeightKtBest() {
        assertEquals(3, solutionKt.hammingWeightBest(11))
    }

    @Test
    fun testHammingWeightKtBest2() {
        assertEquals(1, solutionKt.hammingWeightBest(128))
    }
}