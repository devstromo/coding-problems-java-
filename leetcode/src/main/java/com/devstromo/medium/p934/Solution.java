package com.devstromo.medium.p934;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[][] DIRS = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        boolean flag = false;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (flag)
                break;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, queue);
                    flag = true;
                    break;
                }
            }
        }
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                for (int[] dir : DIRS) {
                    int nx = cur[0] + dir[0];
                    int ny = cur[1] + dir[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                        if (grid[nx][ny] == 2)
                            continue;
                        if (grid[nx][ny] == 1)
                            return steps;
                        grid[nx][ny] = 2;
                        queue.offer(new int[] { nx, ny });
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    public int shortestBridgeBestMemory(int[][] grid) {
        int[] x = {-1, 1, 0, 0}, y = {0, 0, -1, 1};

        // Color one island differently.
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> queue2 = new LinkedList<>();
        outer:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    grid[i][j] = 2;
                    break outer;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            int i = t[0], j = t[1];
            queue2.offer(new int[]{i, j});
            for (int k = 0; k < 4; k++) {
                if (i + x[k] >= 0 && i + x[k] < grid.length && j + y[k] >= 0 && j + y[k] < grid[0].length && grid[i + x[k]][j + y[k]] == 1) {
                    queue.offer(new int[]{i + x[k], j + y[k]});
                    grid[i + x[k]][j + y[k]] = 2; // Coloring differently.
                }
            }
        }
        System.gc();
        int level = 0;
        while (!queue2.isEmpty()) {
            int size = queue2.size();
            for (int k = 0; k < size; k++) {
                int[] polled = queue2.poll();
                int i = polled[0], j = polled[1];
                for (int l = 0; l < 4; l++) {
                    if (i + x[l] >= 0 && i + x[l] < grid.length && j + y[l] >= 0 && j + y[l] < grid[0].length) {
                        if (grid[i + x[l]][j + y[l]] == 1) return level;
                        if (grid[i + x[l]][j + y[l]] == 0) {
                            grid[i + x[l]][j + y[l]] = 2;
                            queue2.offer(new int[]{i + x[l], j + y[l]});
                        }
                    }
                }
            }
            level++;
        }
        return level;
    }
    private void dfs(int[][] grid, int x, int y, Queue<int[]> queue) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != 1)
            return;
        grid[x][y] = 2;
        queue.offer(new int[] { x, y });
        for (int[] dir : DIRS)
            dfs(grid, x + dir[0], y + dir[1], queue);
    }
}
