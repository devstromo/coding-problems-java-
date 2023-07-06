package com.devstromo.easy.p461;

import static com.devstromo.easy.p461.Solution.hammingDistance;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testHammingDistance() {
        assertEquals(2, hammingDistance(1,4));
    }

    @Test
    void testHammingDistance2() {
        assertEquals(1, hammingDistance(3,1));
    }
}