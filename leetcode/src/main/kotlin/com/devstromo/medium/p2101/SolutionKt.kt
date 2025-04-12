package com.devstromo.medium.p2101

import kotlin.math.pow

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

    fun maximumDetonationBest(bombs: Array<IntArray>): Int {
        val graph = Array(bombs.size) { arrayListOf<Int>() }.apply {
            for (i in 0..<bombs.size - 1) {
                val (xi, yi, ri) = bombs[i]

                for (j in i + 1..<bombs.size) {
                    val (xj, yj, rj) = bombs[j]

                    if ((xj - xi).toDouble().pow(2.0) + (yj - yi).toDouble().pow(2.0) <= ri.toDouble()
                            .pow(2.0)
                    ) get(i).add(j)
                    if ((xi - xj).toDouble().pow(2.0) + (yi - yj).toDouble().pow(2.0) <= rj.toDouble()
                            .pow(2.0)
                    ) get(j).add(i)
                }
            }
        }
        var maxD = 0
        for (i in bombs.indices) {
            maxD = maxOf(maxD, dfs(i, graph, BooleanArray(bombs.size)))
            if (maxD == bombs.size) break
        }
        return maxD
    }

    fun dfs(bomb: Int, graph: Array<ArrayList<Int>>, exploded: BooleanArray): Int {
        if (exploded[bomb]) return 0

        exploded[bomb] = true
        var explosions = 1

        for (b in graph[bomb]) explosions += dfs(b, graph, exploded)

        return explosions
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