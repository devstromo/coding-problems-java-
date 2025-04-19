package com.devstromo.medium.p1992

import kotlin.collections.toTypedArray

class SolutionKt {
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {
        val m = land.size
        val n = land[0].size
        val result = mutableListOf<IntArray>()

        for (r in 0 until m) {
            for (c in 0 until n) {
                if (land[r][c] == 1) {
                    val bounds = intArrayOf(r, c, r, c)
                    dfs(land, r, c, bounds)
                    result.add(bounds)
                }
            }
        }

        return result.toTypedArray()
    }

    private fun dfs(land: Array<IntArray>, r: Int, c: Int, bounds: IntArray) {
        val m = land.size
        val n = land[0].size

        if (r !in 0 until m || c !in 0 until n || land[r][c] != 1) return

        land[r][c] = -1 // Mark as visited

        bounds[2] = maxOf(bounds[2], r)
        bounds[3] = maxOf(bounds[3], c)

        dfs(land, r + 1, c, bounds)
        dfs(land, r - 1, c, bounds)
        dfs(land, r, c + 1, bounds)
        dfs(land, r, c - 1, bounds)
    }
}