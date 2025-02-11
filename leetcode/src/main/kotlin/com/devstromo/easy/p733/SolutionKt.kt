package com.devstromo.easy.p733

class SolutionKt {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val previousColor = image[sr][sc]
        if (previousColor == color) return image // Avoid unnecessary recursion if the color is the same

        val directions = arrayOf(
            intArrayOf(-1, 0), intArrayOf(1, 0),  // Up, Down
            intArrayOf(0, -1), intArrayOf(0, 1)   // Left, Right
        )

        fun dfs(r: Int, c: Int) {
            if (r !in image.indices || c !in image[0].indices || image[r][c] != previousColor) return

            image[r][c] = color
            for ((dx, dy) in directions) {
                dfs(r + dx, c + dy)
            }
        }

        dfs(sr, sc)
        return image
    }
}