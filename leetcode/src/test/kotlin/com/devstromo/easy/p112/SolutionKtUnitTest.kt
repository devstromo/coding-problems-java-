package com.devstromo.easy.p112

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Path Sum in Binary Tree`() {
        val root = SolutionKt.TreeNode(5).apply {
            left = SolutionKt.TreeNode(4).apply {
                left = SolutionKt.TreeNode(11).apply {
                    left = SolutionKt.TreeNode(7)
                    right = SolutionKt.TreeNode(2)
                }
            }
            right = SolutionKt.TreeNode(8).apply {
                left = SolutionKt.TreeNode(13)
                right = SolutionKt.TreeNode(4).apply {
                    right = SolutionKt.TreeNode(1)
                }
            }
        }
        assertTrue(solution.hasPathSum(root, 22))
        assertFalse(solution.hasPathSum(null, 0))
    }
}