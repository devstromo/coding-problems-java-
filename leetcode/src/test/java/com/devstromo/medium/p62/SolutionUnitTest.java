package com.devstromo.medium.p62;

import static com.devstromo.medium.p62.Solution.uniquePaths;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testUniquePaths() {
        assertEquals(28, uniquePaths(3, 7));
    }

    @Test
    void testUniquePaths2() {
        assertEquals(3, uniquePaths(3, 2));
    }

    @Test
    void testUniquePaths3() {
        assertEquals(1, uniquePaths(1, 1));
    }
}