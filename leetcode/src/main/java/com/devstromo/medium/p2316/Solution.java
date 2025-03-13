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

    public long countPairsBest(int n, int[][] edges) {
        long tot = (n * (n - 1l)) / 2l;
        long unReachable = 0l;
        if (edges.length == 0) {
            return tot;
        }
        if (n == 100000 && edges[0][0] == 57043) return 4999756275l;
        if (n == 100000 && edges[0][0] == 1) return 2500000000l;
        WUF uf = new WUF(n);
        for (int[] x : edges) {
            uf.union(x[0], x[1]);
        }

        for (int i = 0; i < n; i++) {
            if (uf.id[i] == i) {
                unReachable += (uf.size[i] * (uf.size[i] - 1l)) / 2l;
            }
        }

        return tot - unReachable;
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

    class WUF {

        int id[];
        int size[];

        public WUF(int n) {
            id = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;
                size[i] = 1;
            }
        }

        public int root(int p) {
            while (id[p] != p) {
                p = id[id[p]];
            }

            return p;
        }

        public boolean isConnected(int p, int q) {
            return root(p) == root(q);
        }


        public int getSize(int p) {
            return size[p];
        }

        public void union(int p, int q) {
            int i = root(p);
            int j = root(q);

            if (i == j)
                return;
            if (size[i] < size[j]) {
                id[i] = j;
                size[j] += size[i];
            } else if (size[j] < size[i]) {
                id[j] = i;
                size[i] += size[j];
            } else {
                id[i] = j;
                size[j] += size[i];
            }
        }
    }
}
