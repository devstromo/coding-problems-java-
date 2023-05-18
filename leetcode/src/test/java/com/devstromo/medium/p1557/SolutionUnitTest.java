package com.devstromo.medium.p1557;

import static com.devstromo.medium.p1557.Solution.findSmallestSetOfVertices;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFindSmallestSetOfVertices() {
        var list = List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2));
        var result = findSmallestSetOfVertices(6, list);
        var expected = List.of(0, 3);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    void testFindSmallestSetOfVertices1() {
        var list = List.of(List.of(0, 1), List.of(2, 1), List.of(3, 1), List.of(1, 4), List.of(2, 4));
        var result = findSmallestSetOfVertices(5, list);
        var expected = List.of(0, 2, 3);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }
}