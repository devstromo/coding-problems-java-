package com.devstromo.easy.p1929;

import static com.devstromo.easy.p1929.Solution.getConcatenation;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testGetConcatenation() {
        assertArrayEquals(new int[] { 1, 2, 1, 1, 2, 1 }, getConcatenation(new int[] { 1, 2, 1 }));
        assertArrayEquals(new int[] { 1, 3, 2, 1, 1, 3, 2, 1 }, getConcatenation(new int[] { 1, 3, 2, 1 }));
    }

}