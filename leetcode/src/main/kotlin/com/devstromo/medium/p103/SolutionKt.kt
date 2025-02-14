package com.devstromo.medium.p103

import java.util.*
import kotlin.collections.ArrayList


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

    fun zigzagLevelOrderBest(root: TreeNode?): List<List<Int>> {
        val r = ArrayList<LinkedList<Int>>()

        fun TreeNode.dfs(depth: Int = 0) {
            if (depth == r.size) {
                r += LinkedList<Int>()
            }

            if (depth % 2 == 0) {
                r[depth].offer(`val`)
            } else {
                r[depth].push(`val`)
            }

            left?.dfs(depth + 1)
            right?.dfs(depth + 1)
        }

        root?.dfs()

        return r
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}