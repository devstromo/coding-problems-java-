package com.devstromo.medium.p2101

class SolutionKt {
    fun maximumDetonation(bombs: Array<IntArray>): Int {
        val n = bombs.size
        val graph = Array(n) { mutableListOf<Int>() }

        // Build graph: directed edge from i to j if j is in i's blast radius
        for (i in 0 until n) {
            val (xi, yi, ri) = bombs[i]
            for (j in 0 until n) {
                if (i == j) continue
                val (xj, yj) = bombs[j]
                val dx = xi.toLong() - xj
                val dy = yi.toLong() - yj
                val r = ri.toLong()

                if (dx * dx + dy * dy <= r * r) {
                    graph[i].add(j)
                }
            }
        }

        var max = 0
        for (i in 0 until n) {
            val visited = BooleanArray(n)
            val count = dfs(i, graph, visited)
            max = maxOf(max, count)
        }

        return max
    }

    private fun dfs(current: Int, graph: Array<MutableList<Int>>, visited: BooleanArray): Int {
        visited[current] = true
        var count = 1
        for (neighbor in graph[current]) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, graph, visited)
            }
        }
        return count
    }
}