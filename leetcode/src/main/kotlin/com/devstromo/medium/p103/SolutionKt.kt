package com.devstromo.medium.p103


class SolutionKt {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) return result
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        var flag = true
        while (queue.isNotEmpty()) {
            val size = queue.size
            val level = mutableListOf<Int>()
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                if (flag) {
                    level.add(node.`val`)
                } else {
                    level.add(0, node.`val`)
                }
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(level)
            flag = !flag
        }
        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}