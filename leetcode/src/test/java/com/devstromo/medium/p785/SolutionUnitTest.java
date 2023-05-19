package com.devstromo.medium.p785;

import static com.devstromo.medium.p785.Solution.isBipartite;
import static com.devstromo.medium.p785.Solution.isBipartiteBestMemory;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsBipartite() {
        assertTrue(isBipartite(new int[][] { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } }));
    }

    @Test
    void testIsNotBipartite() {
        assertFalse(isBipartite(new int[][] { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } }));
    }

    @Test
    void testIsBipartite2() {
        assertTrue(isBipartiteBestMemory(new int[][] { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } }));
    }

    @Test
    void testIsNotBipartite2() {
        assertFalse(isBipartiteBestMemory(new int[][] { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } }));
    }
}