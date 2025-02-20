package com.devstromo.medium.p310;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Minimum Height Trees")
    void findMinHeightTrees() {
        assertEquals(List.of(1), solution.findMinHeightTrees(4, new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
        }));
        assertEquals(List.of(3, 4), solution.findMinHeightTrees(6, new int[][]{
                {3, 0},
                {3, 1},
                {3, 2},
                {3, 4},
                {4, 5},
        }));
    }

    @Test
    @DisplayName("Minimum Height Trees Best")
    void findMinHeightTreesBest() {
        assertEquals(List.of(1), solution.findMinHeightTreesBest(4, new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
        }));
        var expected = List.of(3, 4);
        var result = solution.findMinHeightTreesBest(6, new int[][]{
                {3, 0},
                {3, 1},
                {3, 2},
                {3, 4},
                {4, 5},
        });
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }
}