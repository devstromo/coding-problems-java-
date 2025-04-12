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

    public int maximumDetonationBest(int[][] bombs) {
        int n = bombs.length;
        if (n <= 1) return n;
        if (n == 2) return twoBombs(bombs);

        byte[][] links = new byte[n][n + 1];
        int[] linksLen = new int[n];
        for (int b = 0; b < n; b++)
            buildLinks(links, linksLen, bombs, bombs[b], b);

        int maxLinks = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (linksLen[i] > maxLinks) maxLinks = linksLen[i];
            links[i][linksLen[i]] = (byte) -1;
        }
        if (maxLinks == 0 || maxLinks == n - 1) return maxLinks + 1;

        int maxExplosions = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxExplosions = Math.max(maxExplosions, countExplosions(links, new boolean[n], i));
            if (maxExplosions == n) break;
        }
        return maxExplosions;
    }


    private int countExplosions(byte[][] links, boolean[] used, int b) {
        used[b] = true;
        int explosions = 1;
        for (int b1 : links[b]) {
            if (b1 < 0) break;
            if (!used[b1]) explosions += countExplosions(links, used, b1);
        }
        return explosions;
    }


    private void buildLinks(byte[][] links, int[] linksLen, int[][] bombs, int[] bomb, int b) {
        int x = bomb[0];
        int y = bomb[1];
        long radius = (long) bomb[2] * bomb[2];
        for (int b1 = links.length - 1; b1 > b; b1--) {
            int[] bomb1 = bombs[b1];
            long dist = distance(x, y, bomb1[0], bomb1[1]);
            if (dist <= radius) links[b][linksLen[b]++] = (byte) b1;
            if (dist <= (long) bomb1[2] * bomb1[2]) links[b1][linksLen[b1]++] = (byte) b;
        }
    }


    private long distance(int x1, int y1, int x2, int y2) {
        return (long) (x1 - x2) * (x1 - x2) + (long) (y1 - y2) * (y1 - y2);
    }


    private int twoBombs(int[][] bombs) {
        int[] b0 = bombs[0];
        int[] b1 = bombs[1];
        long dist = distance(b0[0], b0[1], b1[0], b1[1]);
        if (dist <= (long) b0[2] * b0[2] || dist <= (long) b1[2] * b1[2]) return 2;
        return 1;
    }
}
