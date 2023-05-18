package com.devstromo.medium.p1557;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a directed acyclic graph, with n vertices numbered from 0 to n-1, and an array edges where edges[i] = [fromi, toi] represents a directed edge from node fromi to node toi.
 * Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists.
 * Notice that you can return the vertices in any order.
 */
class Solution {

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] visited = new boolean[n];
        for (List<Integer> edge : edges) {
            visited[edge.get(1)] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
