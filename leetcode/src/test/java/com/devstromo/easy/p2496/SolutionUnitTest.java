package com.devstromo.easy.p2496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testMaximumValue() {
        assertEquals(5, solution.maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"}));
        assertEquals(1, solution.maximumValue(new String[]{"1", "01", "001", "0001"}));
    }

}