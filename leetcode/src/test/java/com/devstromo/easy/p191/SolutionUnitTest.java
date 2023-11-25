package com.devstromo.easy.p191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testHammingWeight() {
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    public void testHammingWeight2() {
        assertEquals(1, solution.hammingWeight(128));
    }
}