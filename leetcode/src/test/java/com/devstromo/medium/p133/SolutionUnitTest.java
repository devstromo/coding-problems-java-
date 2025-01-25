package com.devstromo.medium.p133;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Clone Graph")
    void testCloneGraph() {
        Solution.Node node1 = new Solution.Node(1);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node3 = new Solution.Node(3);
        Solution.Node node4 = new Solution.Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Solution.Node clonedGraph = solution.cloneGraph(node1);

        assertNotNull(clonedGraph);

        Map<Solution.Node, Solution.Node> visited = new HashMap<>();
        assertTrue(areGraphsEqual(node1, clonedGraph, visited));

        clonedGraph.neighbors.get(0).val = 99;
        assertNotEquals(node1.neighbors.get(0).val, clonedGraph.neighbors.get(0).val);
    }

    @Test
    @DisplayName("Test Clone Graph Best")
    void testCloneGraphBest() {
        Solution.Node node1 = new Solution.Node(1);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node3 = new Solution.Node(3);
        Solution.Node node4 = new Solution.Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Solution.Node clonedGraph = solution.cloneGraphBest(node1);

        assertNotNull(clonedGraph);

        Map<Solution.Node, Solution.Node> visited = new HashMap<>();
        assertTrue(areGraphsEqual(node1, clonedGraph, visited));

        clonedGraph.neighbors.get(0).val = 99;
        assertNotEquals(node1.neighbors.get(0).val, clonedGraph.neighbors.get(0).val);
    }

    private boolean areGraphsEqual(Solution.Node node1, Solution.Node node2, Map<Solution.Node, Solution.Node> visited) {
        if (node1 == null || node2 == null) return node1 == node2;
        if (visited.containsKey(node1)) return visited.get(node1) == node2;

        if (node1.val != node2.val || node1.neighbors.size() != node2.neighbors.size()) {
            return false;
        }

        visited.put(node1, node2);

        for (int i = 0; i < node1.neighbors.size(); i++) {
            if (!areGraphsEqual(node1.neighbors.get(i), node2.neighbors.get(i), visited)) {
                return false;
            }
        }

        return true;
    }
}