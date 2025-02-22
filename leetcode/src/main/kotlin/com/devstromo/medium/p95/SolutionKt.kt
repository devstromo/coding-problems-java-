package com.devstromo.medium.p95

class SolutionKt {
    fun generateTrees(n: Int): List<TreeNode?> {
        if (n == 0) return emptyList()
        return generateSubtrees(1, n)
    }

    private fun generateSubtrees(start: Int, end: Int): List<TreeNode?> {
        val result: MutableList<TreeNode?> = ArrayList()
        if (start > end) {
            result.add(null) // Empty subtree
            return result
        }

        for (i in start..end) {
            val leftSubtrees = generateSubtrees(start, i - 1)
            val rightSubtrees = generateSubtrees(i + 1, end)

            for (left in leftSubtrees) {
                for (right in rightSubtrees) {
                    val root = TreeNode(i)
                    root.left = left
                    root.right = right
                    result.add(root)
                }
            }
        }

        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}