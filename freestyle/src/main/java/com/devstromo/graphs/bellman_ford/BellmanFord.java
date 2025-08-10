package com.devstromo.graphs.bellman_ford;

import java.util.*;

/**
 * Bellman–Ford shortest paths for directed graphs that may have negative weights.
 * Detects reachable negative cycles.
 * <p>
 * Works with:
 * - negative edges (allowed)
 * - negative cycles (reported)
 * - unreachable nodes (distance = Long.MAX_VALUE)
 * <p>
 * Time:  O(V * E)
 * Space: O(V + E)
 */
public class BellmanFord {

    public static class Graph {
        private final int n;
        private final List<Edge> edges = new ArrayList<>();

        public Graph(int n) {
            if (n <= 0) throw new IllegalArgumentException("Number of nodes must be positive");
            this.n = n;
        }

        /**
         * Adds a directed edge u -> v with weight w (may be negative).
         */
        public void addEdge(int u, int v, long w) {
            if (u < 0 || u >= n || v < 0 || v >= n) {
                throw new IllegalArgumentException("Invalid endpoint");
            }
            edges.add(new Edge(u, v, w));
        }

        public int size() {
            return n;
        }

        public List<Edge> edges() {
            return edges;
        }
    }

    public record Edge(int u, int v, long w) {
    }

    public static class Result {
        public final long[] dist;     // shortest distance from src; Long.MAX_VALUE if unreachable
        public final int[] parent;    // parent[v] on shortest path, or -1
        public final int src;
        public final boolean hasNegativeCycle; // true if some node reachable from src is affected by a negative cycle

        Result(long[] dist, int[] parent, int src, boolean hasNegativeCycle) {
            this.dist = dist;
            this.parent = parent;
            this.src = src;
            this.hasNegativeCycle = hasNegativeCycle;
        }

        /**
         * Reconstructs shortest path from src to target; empty if unreachable or if negative cycle affects target.
         */
        public List<Integer> reconstructPath(int target) {
            if (target < 0 || target >= dist.length) throw new IllegalArgumentException("Invalid target");
            if (dist[target] == Long.MAX_VALUE || hasNegativeCycle) return List.of();
            LinkedList<Integer> path = new LinkedList<>();
            for (int v = target; v != -1; v = parent[v]) path.addFirst(v);
            // sanity: should start at src if reachable
            if (path.isEmpty() || path.getFirst() != src) return List.of();
            return path;
        }

        /**
         * If a negative cycle is reachable from src, returns one example cycle as a list of nodes (u0,u1,...,u0).
         * Returns empty list if none detected.
         */
        public List<Integer> extractNegativeCycle(Graph g) {
            if (!hasNegativeCycle) return List.of();

            int n = dist.length;
            int x = -1;

            // Find a vertex that can still be relaxed (affected by neg cycle)
            long[] d = Arrays.copyOf(dist, n);
            int[] p = Arrays.copyOf(parent, n);

            for (Edge e : g.edges()) {
                if (d[e.u] != Long.MAX_VALUE && d[e.u] + e.w < d[e.v]) {
                    d[e.v] = Long.MIN_VALUE; // mark
                    p[e.v] = e.u;
                    x = e.v;
                }
            }
            if (x == -1) return List.of(); // should not happen if flag is set

            // Move x back n times to ensure it's inside the cycle
            for (int i = 0; i < n; i++) x = p[x] == -1 ? x : p[x];

            // Collect the cycle
            List<Integer> cycle = new ArrayList<>();
            int cur = x;
            do {
                cycle.add(cur);
                cur = p[cur];
            } while (cur != -1 && cur != x);

            if (cur == -1 || cycle.isEmpty()) return List.of();
            Collections.reverse(cycle);
            // make it (u0..u_k, u0)
            cycle.add(cycle.get(0));
            return cycle;
        }
    }

    /**
     * Runs Bellman–Ford from source src.
     * - Returns distances/parents
     * - hasNegativeCycle=true if a reachable negative cycle exists
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

        // Relax edges up to (n-1) times
        for (int i = 0; i < n - 1; i++) {
            boolean changed = false;
            for (Edge e : g.edges()) {
                if (dist[e.u] == Long.MAX_VALUE) continue;
                long nd = dist[e.u] + e.w;
                if (nd < dist[e.v]) {
                    dist[e.v] = nd;
                    parent[e.v] = e.u;
                    changed = true;
                }
            }
            if (!changed) break; // early stop
        }

        // One more pass to detect reachable negative cycles
        boolean hasNegCycle = false;
        for (Edge e : g.edges()) {
            if (dist[e.u] == Long.MAX_VALUE) continue;
            if (dist[e.u] + e.w < dist[e.v]) {
                hasNegCycle = true;
                break;
            }
        }

        return new Result(dist, parent, src, hasNegCycle);
    }
}
