package com.devstromo.medium.p107


class SolutionKt {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) return result
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val size = queue.size
            val level = mutableListOf<Int>()
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                level.add(node.`val`)
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(0, level)
        }
        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}