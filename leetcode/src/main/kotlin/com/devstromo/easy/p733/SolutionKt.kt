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

    fun floodFillBest(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val pixel = image[sr][sc]
        if (pixel != color) {
            fill(image, sr, sc, color, pixel)
        }
        return image
    }

    fun fill(image: Array<IntArray>, sr: Int, sc: Int, color: Int, curr: Int) {

        // out of bounds, do not proceed
        if (sr < 0 || sr >= image.size || sc < 0 || sc >= image[0].size) return

        // get the pixel
        val pixel = image[sr][sc]

        // pixel of unexpected color, do not proceed
        if (pixel != curr) return

        // update the pixel,
        image[sr][sc] = color

        // make recursive call in all directions
        fill(image, sr + 1, sc, color, curr)
        fill(image, sr - 1, sc, color, curr)
        fill(image, sr, sc + 1, color, curr)
        fill(image, sr, sc - 1, color, curr)
    }
}