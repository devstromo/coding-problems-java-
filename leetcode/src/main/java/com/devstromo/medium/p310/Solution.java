package com.devstromo.medium.p310;

import java.util.*;

public class Solution {
    private static final int[] queStatic = new int[20_000];

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

    public List<Integer> findMinHeightTreesBest(int n, int[][] edges) {
        // If only 1 or 2 nodes, then each node is a possible Minimum
        // Height Tree root.
        if (n < 2)
            return Arrays.asList((n == 1) ?
                    (new Integer[]{0}) : (new Integer[]{0, 1}));

        // Process the edges to a tree.
        final int[] linkCounts = new int[n];
        final int[] links = new int[n];
        for (final int[] edge : edges) {
            links[edge[0]] ^= edge[1];
            links[edge[1]] ^= edge[0];
            linkCounts[edge[0]]++;
            linkCounts[edge[1]]++;
        }

        // Scan the tree and put all leaf nodes (nodes with only one link)
        // onto the queue.
        final int[] que = queStatic;
        int queInn = 0;
        int queOut = 0;
        for (int i = n - 1; i >= 0; i--)
            if (linkCounts[i] == 1)
                que[queInn++] = i;

        // Scan the tree from leaves, heading inward into the tree,
        // converting nodes of the next layer inward to leaves.
        int queLayerStart = 0;
        int queLayerEnd = 0;
        while (queOut < queInn) {
            queLayerStart = queOut;
            queLayerEnd = queInn;
            while (queOut < queLayerEnd) {
                final int leafLink = links[que[queOut]];
                links[leafLink] ^= que[queOut++];
                if (--linkCounts[leafLink] == 1)
                    que[queInn++] = leafLink;
            }
        }

        // Create a list of all possible root nodes that were in the
        // innermost layer.
        List<Integer> result = new ArrayList();
        for (int i = queLayerStart; i < queLayerEnd; )
            result.add(que[i++]);
        return result;
    }
}
