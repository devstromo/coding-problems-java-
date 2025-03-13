package com.devstromo.medium.p2316;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        List<Integer> componentSizes = new ArrayList<>();

        // Find all connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                componentSizes.add(dfs(graph, visited, i));
            }
        }

        // Compute total pairs
        long totalPairs = ((long) n * (n - 1)) / 2;
        long reachablePairs = 0;

        // Compute reachable pairs within each component
        for (int size : componentSizes) {
            reachablePairs += ((long) size * (size - 1)) / 2;
        }

        // Unreachable pairs = Total Pairs - Reachable Pairs
        return totalPairs - reachablePairs;
    }

    private int dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        int size = 0;

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            size++;
            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return size;
    }
}
