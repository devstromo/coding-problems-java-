package com.devstromo.easy.p733;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        visited[sr][sc] = true;
        int colorValue = image[sr][sc];
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            // above
            if (x - 1 >= 0 && !visited[x - 1][y] && image[x - 1][y] == colorValue) {
                queue.offer(new int[]{x - 1, y});
                visited[x - 1][y] = true;
                image[x - 1][y] = color;
            }
            if (y - 1 >= 0 && !visited[x][y - 1] && image[x][y - 1] == colorValue) { // left
                queue.offer(new int[]{x, y - 1});
                visited[x][y - 1] = true;
                image[x][y - 1] = color;
            }
            if (x + 1 < n && !visited[x + 1][y] && image[x + 1][y] == colorValue) {
                queue.offer(new int[]{x + 1, y});
                visited[x + 1][y] = true;
                image[x + 1][y] = color;
            }
            if (y + 1 < m && !visited[x][y + 1] && image[x][y + 1] == colorValue) {
                queue.offer(new int[]{x, y + 1});
                visited[x][y + 1] = true;
                image[x][y + 1] = color;
            }
        }
        return image;
    }
}
