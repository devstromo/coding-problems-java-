package com.devstromo.easy.p1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Two Sum`() {
        var num = intArrayOf(2, 7, 11, 15)
        var target = 9
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(num, target))

        num = intArrayOf(3, 2, 4)
        target = 6
        assertArrayEquals(intArrayOf(1, 2), solution.twoSum(num, target))

        num = intArrayOf(3, 3)
        target = 6
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(num, target))
    }
}