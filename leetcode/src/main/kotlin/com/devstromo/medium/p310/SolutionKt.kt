package com.devstromo.medium.p310

import java.util.*

class SolutionKt {
    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        if (n == 1) return listOf(0)

        // Step 1: Build the graph (Adjacency List) and degree count
        val graph: MutableList<MutableSet<Int>> = ArrayList()
        val degree = IntArray(n)

        for (i in 0 until n) {
            graph.add(HashSet())
        }

        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
            degree[edge[0]]++
            degree[edge[1]]++
        }

        // Step 2: Initialize queue with leaf nodes (degree == 1)
        val queue: Queue<Int> = LinkedList()
        for (i in 0 until n) {
            if (degree[i] == 1) queue.offer(i)
        }

        // Step 3: BFS to remove leaves until 2 or fewer nodes remain
        var remainingNodes = n
        while (remainingNodes > 2) {
            val size = queue.size
            remainingNodes -= size

            for (i in 0 until size) {
                val leaf = queue.poll()
                for (neighbor in graph[leaf]) {
                    graph[neighbor].remove(leaf)
                    degree[neighbor]--
                    if (degree[neighbor] == 1) queue.offer(neighbor) // New leaf
                }
            }
        }

        // Step 4: Remaining nodes are the MHT roots
        return ArrayList(queue)
    }
}