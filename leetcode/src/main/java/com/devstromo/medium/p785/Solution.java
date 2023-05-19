package com.devstromo.medium.p785;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    //There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:
    //
    //    There are no self-edges (graph[u] does not contain u).
    //    There are no parallel edges (graph[u] does not contain duplicate values).
    //    If v is in graph[u], then u is in graph[v] (the graph is undirected).
    //    The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
    //
    //A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
    //
    //Return true if and only if it is bipartite.
    public static boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && dfs(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBipartiteBestMemory(int[][] graph) {
        if (graph == null || graph.length == 0)
            return false;
        int n = graph.length;
        int[] color = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                queue.offer(i);
                color[i] = 1;
            }
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                for (int nei : graph[cur]) {
                    if (color[nei] != 0 && color[nei] == color[cur]) {
                        return false;
                    } else if (color[nei] == 0) {
                        color[nei] = color[cur] == 1 ? 2 : 1;
                        queue.offer(nei);
                    }
                }
            }
        }
        return true;
    }

    private static boolean dfs(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] != color;
        }
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (dfs(graph, colors, -color, neighbor)) {
                return true;
            }
        }
        return false;
    }

}