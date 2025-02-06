package com.devstromo.medium.p994;

import java.util.ArrayDeque;
import java.util.Deque;

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
}
