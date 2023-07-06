package com.devstromo.easy.p219;

import static com.devstromo.easy.p219.Solution.containsNearbyDuplicate;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testContainsNearbyDuplicate() {
        assertTrue(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
    }

    @Test
    void testContainsNearbyDuplicate2() {
        assertTrue(containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));
    }

    @Test
    void testContainsNearbyDuplicate3() {
        assertFalse(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
    }
}