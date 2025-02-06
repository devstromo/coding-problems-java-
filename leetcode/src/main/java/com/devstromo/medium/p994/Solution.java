package com.devstromo.medium.p994;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        int fresh = 0, time = 0;

        // Step 1: Find all rotten oranges and count fresh oranges
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    fresh++;
                } else if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                }
            }
        }

        // Directions array for moving in 4 directions
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // Step 2: BFS traversal (Multi-source BFS)
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int r = cell[0], c = cell[1];

                for (int[] dir : directions) {
                    int row = r + dir[0], col = c + dir[1];

                    // Check if the new cell is within bounds and is a fresh orange
                    if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != 1) {
                        continue;
                    }

                    // Mark orange as rotten and add to queue
                    grid[row][col] = 2;
                    queue.offer(new int[]{row, col});
                    fresh--;
                }
            }
            time++;
        }

        // Step 3: If fresh oranges remain, return -1, otherwise return the time taken
        return fresh == 0 ? time : -1;
    }

    public int orangesRottingBest(int[][] grid) {
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int row = grid.length, col = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int maxTime = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int i = curr[0], j = curr[1], t = curr[2];
            maxTime = Math.max(maxTime, t);
            for (int k = 0; k < 4; k++) {
                int x = i + dir[k][0];
                int y = j + dir[k][1];
                if (isValid(x, y, row, col) && grid[x][y] == 1) {
                    q.offer(new int[]{x, y, t + 1});
                    grid[x][y] = 2;
                    fresh--;
                }
            }
        }
        return (fresh > 0) ? -1 : maxTime;
    }

    boolean isValid(int x, int y, int row, int col) {
        return (x >= 0 && y >= 0 && x < row && y < col);
    }
}
