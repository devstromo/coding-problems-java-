package com.devstromo.medium.p2101;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Build the graph: directed edges from bomb i to bomb j
        for (int i = 0; i < n; i++) {
            long xi = bombs[i][0], yi = bombs[i][1], ri = bombs[i][2];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                long xj = bombs[j][0], yj = bombs[j][1];

                long dx = xj - xi;
                long dy = yj - yi;
                if (dx * dx + dy * dy <= ri * ri) {
                    graph.get(i).add(j);
                }
            }
        }

        // DFS for each bomb
        int max = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int count = dfs(i, graph, visited);
            max = Math.max(max, count);
        }

        return max;
    }

    private int dfs(int current, List<List<Integer>> graph, boolean[] visited) {
        visited[current] = true;
        int count = 1;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, graph, visited);
            }
        }

        return count;
    }
}
