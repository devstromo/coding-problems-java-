package com.devstromo.graphs.dijkstra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraUnitTest {
    @Test
    @DisplayName("Test shortest distances on a small directed graph")
    void testShortestDistances() {
        Dijkstra.Graph g = new Dijkstra.Graph(6);
        g.addEdge(0, 1, 7);
        g.addEdge(0, 2, 9);
        g.addEdge(0, 5, 14);
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3, 15);
        g.addEdge(2, 3, 11);
        g.addEdge(2, 5, 2);
        g.addEdge(3, 4, 6);
        g.addEdge(5, 4, 9);

        Dijkstra.Result r = Dijkstra.shortestPaths(g, 0);

        assertEquals(0, r.dist[0]);
        assertEquals(7, r.dist[1]);
        assertEquals(9, r.dist[2]);
        assertEquals(20, r.dist[3]);
        assertEquals(20, r.dist[4]);
        assertEquals(11, r.dist[5]);

        // Path checks
        assertEquals(List.of(0, 2, 5), r.reconstructPath(5));
        assertEquals(List.of(0, 2, 5, 4), r.reconstructPath(4));
    }

    @Test
    @DisplayName("Test unreachable node remains at infinity and path is empty")
    void testUnreachable() {
        Dijkstra.Graph g = new Dijkstra.Graph(4);
        g.addEdge(0, 1, 3);
        // Node 2 and 3 are disconnected from source 0
        Dijkstra.Result r = Dijkstra.shortestPaths(g, 0);

        assertEquals(0, r.dist[0]);
        assertEquals(3, r.dist[1]);
        assertEquals(Long.MAX_VALUE, r.dist[2]);
        assertEquals(Long.MAX_VALUE, r.dist[3]);
        assertTrue(r.reconstructPath(2).isEmpty());
    }

    @Test
    @DisplayName("Test negative weight rejection")
    void testNegativeWeight() {
        Dijkstra.Graph g = new Dijkstra.Graph(2);
        assertThrows(IllegalArgumentException.class, () -> g.addEdge(0, 1, -1));
    }
}