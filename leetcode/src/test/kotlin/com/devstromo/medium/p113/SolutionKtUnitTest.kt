package com.devstromo.medium.p113

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Path Sum II in Binary Tree`() {
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
                    left = SolutionKt.TreeNode(5)
                    right = SolutionKt.TreeNode(1)
                }
            }
        }

        val root2 = SolutionKt.TreeNode(1).apply {
            left = SolutionKt.TreeNode(2)
            right = SolutionKt.TreeNode(3)
        }

        assertEquals(listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5)), solution.pathSum(root, 22))
        assertEquals(listOf<Any>(), solution.pathSum(root2, 5))
    }
}