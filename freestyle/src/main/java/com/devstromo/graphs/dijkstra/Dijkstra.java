package com.devstromo.graphs.dijkstra;

import java.util.*;

/**
 * Dijkstra's shortest path algorithm for directed graphs with non-negative weights.
 * Uses an adjacency list and a min-heap (PriorityQueue).
 * <p>
 * Time:  O((V + E) log V)
 * Space: O(V + E)
 */
public class Dijkstra {

    public static class Graph {
        private final int n;
        private final List<List<Edge>> adj;

        public Graph(int n) {
            if (n <= 0) throw new IllegalArgumentException("Number of nodes must be positive");
            this.n = n;
            this.adj = new ArrayList<>(n);
            for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        }

        /**
         * Adds a directed edge u -> v with non-negative weight w.
         */
        public void addEdge(int u, int v, long w) {
            validateNode(u);
            validateNode(v);
            if (w < 0) throw new IllegalArgumentException("Dijkstra requires non-negative weights");
            adj.get(u).add(new Edge(v, w));
        }

        private void validateNode(int u) {
            if (u < 0 || u >= n) throw new IllegalArgumentException("Invalid node: " + u);
        }

        public int size() {
            return n;
        }

        public List<List<Edge>> edges() {
            return adj;
        }
    }

    public static class Edge {
        final int to;
        final long w;

        Edge(int to, long w) {
            this.to = to;
            this.w = w;
        }
    }

    public static class Result {
        public final long[] dist;   // dist[i] = shortest distance from src to i, Long.MAX_VALUE if unreachable
        public final int[] parent;  // parent[i] = previous node on shortest path from src to i, or -1 if none
        public final int src;

        Result(long[] dist, int[] parent, int src) {
            this.dist = dist;
            this.parent = parent;
            this.src = src;
        }

        /**
         * Reconstruct shortest path from the source to target as a list of nodes.
         * Returns empty list if target is unreachable.
         */
        public List<Integer> reconstructPath(int target) {
            if (target < 0 || target >= dist.length) throw new IllegalArgumentException("Invalid target");
            if (dist[target] == Long.MAX_VALUE) return List.of();
            LinkedList<Integer> path = new LinkedList<>();
            for (int v = target; v != -1; v = parent[v]) path.addFirst(v);
            return path;
        }
    }

    /**
     * Runs Dijkstra from a single source.
     */
    public static Result shortestPaths(Graph g, int src) {
        if (g == null) throw new IllegalArgumentException("Graph is null");
        if (src < 0 || src >= g.size()) throw new IllegalArgumentException("Invalid source");

        int n = g.size();
        long[] dist = new long[n];
        int[] parent = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        Arrays.fill(parent, -1);

        dist[src] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        // each entry: [distance, node]
        pq.offer(new long[]{0, src});

        boolean[] settled = new boolean[n];

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];

            if (settled[u]) continue;        // lazy deletion
            settled[u] = true;

            if (d > dist[u]) continue;       // stale entry guard (extra safety)

            for (Edge e : g.edges().get(u)) {
                int v = e.to;
                long nd = d + e.w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    parent[v] = u;
                    pq.offer(new long[]{nd, v});
                }
            }
        }

        return new Result(dist, parent, src);
    }
}
