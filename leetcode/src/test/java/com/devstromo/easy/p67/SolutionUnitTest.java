package com.devstromo.easy.p67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testAddBinary() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    void testAddBinary2() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

}