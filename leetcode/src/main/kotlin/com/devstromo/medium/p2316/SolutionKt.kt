package com.devstromo.medium.p2316

import java.util.*

class SolutionKt {
    fun countPairs(n: Int, edges: Array<IntArray>): Long {
        val graph: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0..<n) {
            graph.add(ArrayList())
        }

        // Build adjacency list
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }

        val visited = BooleanArray(n)
        val componentSizes: MutableList<Int> = ArrayList()

        // Find all connected components
        for (i in 0..<n) {
            if (!visited[i]) {
                componentSizes.add(dfs(graph, visited, i))
            }
        }

        // Compute total pairs
        val totalPairs = (n * (n - 1)) / 2
        var reachablePairs: Long = 0

        // Compute reachable pairs within each component
        for (size in componentSizes) {
            reachablePairs += (size * (size - 1)) / 2
        }

        // Unreachable pairs = Total Pairs - Reachable Pairs
        return totalPairs - reachablePairs
    }

    private fun dfs(graph: List<List<Int>>, visited: BooleanArray, node: Int): Int {
        val stack = Stack<Int>()
        stack.push(node)
        visited[node] = true
        var size = 0

        while (!stack.isEmpty()) {
            val curr = stack.pop()
            size++
            for (neighbor in graph[curr]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true
                    stack.push(neighbor)
                }
            }
        }
        return size
    }
}