package com.devstromo.medium.p113

internal class SolutionKt {
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val currentPath = mutableListOf<Int>()
        dfs(root, targetSum, currentPath, result)
        return result
    }

    private fun dfs(
        node: TreeNode?,
        targetSum: Int,
        currentPath: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (node == null) {
            return
        }

        currentPath.add(node.`val`)

        if (node.left == null && node.right == null && targetSum == node.`val`) {
            result.add(ArrayList(currentPath))
        } else {
            dfs(node.left, targetSum - node.`val`, currentPath, result)
            dfs(node.right, targetSum - node.`val`, currentPath, result)
        }

        currentPath.removeAt(currentPath.size - 1)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}