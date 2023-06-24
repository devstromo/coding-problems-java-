package com.devstromo.medium.p72;

import static com.devstromo.medium.p72.Solution.minDistance;
import static com.devstromo.medium.p72.Solution.minDistanceRecursivo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMnDistance() {
        assertEquals(3, minDistance("saturday", "sunday"));
        assertEquals(3, minDistance("horse", "ros"));
        assertEquals(5, minDistance("intention", "execution"));
        assertEquals(1, minDistance("", "a"));
    }

    @Test
    void testMnDistanceRecursivo() {
        assertEquals(3, minDistanceRecursivo("saturday", "sunday"));
        assertEquals(3, minDistanceRecursivo("horse", "ros"));
        assertEquals(5, minDistanceRecursivo("intention", "execution"));
        assertEquals(1, minDistance("", "a"));
    }

}