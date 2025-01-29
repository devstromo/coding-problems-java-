package com.devstromo.medium.p687

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Longest Univalue Path`() {
        val root = SolutionKt.TreeNode(5).apply {
            left = SolutionKt.TreeNode(4).apply {
                left = SolutionKt.TreeNode(1)
                right = SolutionKt.TreeNode(1)
            }
            right = SolutionKt.TreeNode(5).apply {
                right = SolutionKt.TreeNode(5)
            }
        }
        assertEquals(2, solution.longestUnivaluePath(root))
    }

    @Test
    fun `Test Longest Univalue Path Best`() {
        val root = SolutionKt.TreeNode(5).apply {
            left = SolutionKt.TreeNode(4).apply {
                left = SolutionKt.TreeNode(1)
                right = SolutionKt.TreeNode(1)
            }
            right = SolutionKt.TreeNode(5).apply {
                right = SolutionKt.TreeNode(5)
            }
        }
        assertEquals(2, solution.longestUnivaluePath(root))
    }
}