package com.devstromo.medium.p204

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test count primes`() {
        assertEquals(0, solution.countPrimes(0))
        assertEquals(0, solution.countPrimes(1))
        assertEquals(0, solution.countPrimes(2))
        assertEquals(1, solution.countPrimes(3))
        assertEquals(4, solution.countPrimes(10))
    }

    @Test
    fun `Test count primes best`() {
        assertEquals(0, solution.countPrimesBest(0))
        assertEquals(0, solution.countPrimesBest(1))
        assertEquals(0, solution.countPrimesBest(2))
        assertEquals(1, solution.countPrimesBest(3))
        assertEquals(4, solution.countPrimesBest(10))
    }

}