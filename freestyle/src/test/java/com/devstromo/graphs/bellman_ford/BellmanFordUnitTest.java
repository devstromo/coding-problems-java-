package com.devstromo.graphs.bellman_ford;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BellmanFordUnitTest {

    @Test
    @DisplayName("Test shortest paths with negative edges but no negative cycle")
    void testShortestPathsNoNegativeCycle() {
        BellmanFord.Graph g = new BellmanFord.Graph(5);
        g.addEdge(0, 1, 6);
        g.addEdge(0, 2, 7);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 3, 5);
        g.addEdge(1, 4, -4);
        g.addEdge(2, 3, -3);
        g.addEdge(2, 4, 9);
        g.addEdge(3, 1, -2);
        g.addEdge(4, 0, 2);
        g.addEdge(4, 3, 7);

        BellmanFord.Result r = BellmanFord.shortestPaths(g, 0);

        assertFalse(r.hasNegativeCycle);
        assertEquals(0, r.dist[0]);
        assertEquals(2, r.dist[1]);   // 0->2->3->1 : 7 + (-3) + (-2) = 2
        assertEquals(7, r.dist[2]);   // 0->2
        assertEquals(4, r.dist[3]);   // 0->2->3 : 7 + (-3) = 4
        assertEquals(-2, r.dist[4]);  // 0->2->3->1->4 : 7 + (-3) + (-2) + (-4) = -2

        // Path example (one valid shortest path)
        List<Integer> pathTo4 = r.reconstructPath(4);
        assertEquals(0, pathTo4.get(0));
        assertEquals(4, pathTo4.get(pathTo4.size() - 1));
    }

    @Test
    @DisplayName("Test unreachable node")
    void testUnreachableNode() {
        BellmanFord.Graph g = new BellmanFord.Graph(3);
        g.addEdge(0, 1, 5);
        // node 2 is disconnected
        BellmanFord.Result r = BellmanFord.shortestPaths(g, 0);

        assertEquals(0, r.dist[0]);
        assertEquals(5, r.dist[1]);
        assertEquals(Long.MAX_VALUE, r.dist[2]);
        assertTrue(r.reconstructPath(2).isEmpty());
    }

    @Test
    @DisplayName("Test detection of reachable negative cycle")
    void testNegativeCycleDetection() {
        BellmanFord.Graph g = new BellmanFord.Graph(3);
        g.addEdge(0, 1, 1);
        g.addEdge(1, 2, -1);
        g.addEdge(2, 1, -1); // cycle of total weight -2 reachable from 0

        BellmanFord.Result r = BellmanFord.shortestPaths(g, 0);
        assertTrue(r.hasNegativeCycle);

        // Optional: try to extract a cycle (may vary in node order)
        List<Integer> cyc = r.extractNegativeCycle(g);
        // If provided, should be non-empty and closed (u0...u0)
        if (!cyc.isEmpty()) {
            assertTrue(cyc.size() >= 2);
            assertEquals(cyc.get(0), cyc.get(cyc.size() - 1));
        }

        // When a negative cycle is reachable, we typically avoid returning paths
        assertTrue(r.reconstructPath(2).isEmpty());
    }
}
