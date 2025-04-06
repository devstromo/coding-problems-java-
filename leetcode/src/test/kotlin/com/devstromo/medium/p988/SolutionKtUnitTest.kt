package com.devstromo.medium.p988

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Smallest String Starting From Leaf`() {
        var root = SolutionKt.TreeNodeKt(0).apply {
            left = SolutionKt.TreeNodeKt(1).apply {
                left = SolutionKt.TreeNodeKt(3).apply { }
                right = SolutionKt.TreeNodeKt(4).apply {}
            }
            right = SolutionKt.TreeNodeKt(2).apply {
                left = SolutionKt.TreeNodeKt(3).apply { }
                right = SolutionKt.TreeNodeKt(4).apply {}
            }
        }
        assertEquals("dba", solution.smallestFromLeaf(root))
        root = SolutionKt.TreeNodeKt(25).apply {
            left = SolutionKt.TreeNodeKt(1).apply {
                left = SolutionKt.TreeNodeKt(1).apply { }
                right = SolutionKt.TreeNodeKt(3).apply {}
            }
            right = SolutionKt.TreeNodeKt(3).apply {
                left = SolutionKt.TreeNodeKt(0).apply {}
                right = SolutionKt.TreeNodeKt(2).apply { }
            }
        }
        assertEquals("adz", solution.smallestFromLeaf(root))
        root = SolutionKt.TreeNodeKt(2).apply {
            left = SolutionKt.TreeNodeKt(2).apply {
                right = SolutionKt.TreeNodeKt(1).apply {
                    left = SolutionKt.TreeNodeKt(0).apply { }
                }
            }
            right = SolutionKt.TreeNodeKt(1).apply {
                left = SolutionKt.TreeNodeKt(0).apply { }
            }
        }
        assertEquals("abc", solution.smallestFromLeaf(root))
    }
}