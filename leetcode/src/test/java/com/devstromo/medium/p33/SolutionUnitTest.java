package com.devstromo.medium.p33;

import static com.devstromo.medium.p33.Solution.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    void testSearch() {
        assertEquals(4, search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }

    @Test
    void testSearch2() {
        assertEquals(-1, search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
    }

    @Test
    void testSearch3() {
        assertEquals(-1, search(new int[] { 1 }, 0));
    }
}