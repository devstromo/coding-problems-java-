package com.devstromo.medium.p583;

import static com.devstromo.medium.p583.Solution.minDistance;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMinDistance() {
        assertEquals(2, minDistance("sea", "eat"));
    }

    @Test
    void testMinDistance2() {
        assertEquals(4, minDistance("leetcode", "etco"));
    }

    @Test
    void testMinDistance3() {
        assertEquals(0, minDistance("a", "a"));
    }

}