package com.devstromo.hard.p124

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Binary Tree Maximum Path Sum`() {
        val root = SolutionKt.TreeNode(1)
        root.left = SolutionKt.TreeNode(2)
        root.right = SolutionKt.TreeNode(3)
        assertEquals(6, solution.maxPathSum(root))
    }
}