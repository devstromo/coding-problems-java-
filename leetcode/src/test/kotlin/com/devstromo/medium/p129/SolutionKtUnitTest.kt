package com.devstromo.medium.p129

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Sum Root to Leaf Numbers`() {
        val root = SolutionKt.TreeNode(4).apply {
            left = SolutionKt.TreeNode(9).apply {
                left = SolutionKt.TreeNode(5)
                right = SolutionKt.TreeNode(1)
            }
            right = SolutionKt.TreeNode(0)
        }

        assertEquals(1026, solution.sumNumbers(root))
    }
}