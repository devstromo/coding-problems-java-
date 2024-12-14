package com.devstromo.easy.p1991;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testFindMiddleIndex() {
        assertEquals(3, solution.findMiddleIndex(new int[]{2, 3, -1, 8, 4}));
//        assertEquals(2, solution.findMiddleIndex(new int[]{1, -1, 4}));
//        assertEquals(-1, solution.findMiddleIndex(new int[]{2, 5}));
    }

}