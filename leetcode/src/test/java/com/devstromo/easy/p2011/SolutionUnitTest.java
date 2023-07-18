package com.devstromo.easy.p2011;

import static com.devstromo.easy.p2011.Solution.finalValueAfterOperations;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFinalValueAfterOperations() {
        assertEquals(1, finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));
    }

    @Test
    void testFinalValueAfterOperations1() {
        assertEquals(3, finalValueAfterOperations(new String[] { "++X", "++X", "X++" }));
    }

    @Test
    void testFinalValueAfterOperations2() {
        assertEquals(0, finalValueAfterOperations(new String[] { "X++", "++X", "--X", "X--" }));
    }
}