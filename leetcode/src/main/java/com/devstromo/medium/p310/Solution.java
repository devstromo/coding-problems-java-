package com.devstromo.medium.p310;

import java.util.*;

public class Solution {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);

        // Step 1: Build the graph (Adjacency List) and degree count
        List<Set<Integer>> graph = new ArrayList<>();
        int[] degree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }

        // Step 2: Initialize queue with leaf nodes (degree == 1)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) queue.offer(i);
        }

        // Step 3: BFS to remove leaves until 2 or fewer nodes remain
        int remainingNodes = n;
        while (remainingNodes > 2) {
            int size = queue.size();
            remainingNodes -= size;

            for (int i = 0; i < size; i++) {
                int leaf = queue.poll();
                for (int neighbor : graph.get(leaf)) {
                    graph.get(neighbor).remove(leaf);
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) queue.offer(neighbor); // New leaf
                }
            }
        }

        // Step 4: Remaining nodes are the MHT roots
        return new ArrayList<>(queue);
    }
}
