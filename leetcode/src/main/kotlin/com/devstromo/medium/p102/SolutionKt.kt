package com.devstromo.medium.p102

import java.util.*

class SolutionKt {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        if (root == null) return result

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        while (!queue.isEmpty()) {
            val levelSize = queue.size
            val level: MutableList<Int> = ArrayList()

            for (i in 0 until  levelSize) {
                val node = queue.poll()
                level.add(node.`val`)

                if (node.left != null) queue.add(node.left)
                if (node.right != null) queue.add(node.right)
            }
            result.add(level)
        }
        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

    }
}