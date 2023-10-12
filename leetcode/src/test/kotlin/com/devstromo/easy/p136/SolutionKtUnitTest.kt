package com.devstromo.easy.p136

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun tesSingleNumberKt() {
        assertEquals(1, solutionKt.singleNumber(intArrayOf(2, 2, 1)))
    }

    @Test
    fun tesSingleNumberKt2() {
        assertEquals(4, solutionKt.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }

    @Test
    fun tesSingleNumberKt3() {
        assertEquals(1, solutionKt.singleNumber(intArrayOf(1)))
    }

    @Test
    fun tesSingleNumberBestKt() {
        assertEquals(1, solutionKt.singleNumberBest(intArrayOf(2, 2, 1)))
    }

    @Test
    fun tesSingleNumberBestKt2() {
        assertEquals(4, solutionKt.singleNumberBest(intArrayOf(4, 1, 2, 1, 2)))
    }

    @Test
    fun tesSingleNumberBestKt3() {
        assertEquals(1, solutionKt.singleNumberBest(intArrayOf(1)))
    }
}
