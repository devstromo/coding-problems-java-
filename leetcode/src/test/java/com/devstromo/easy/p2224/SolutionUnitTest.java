package com.devstromo.easy.p2224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testConvertTime() {
        assertEquals(3, solution.convertTime("02:30", "04:35"));
        assertEquals(1, solution.convertTime("11:00", "11:01"));
    }

    @Test
    public void testConvertTimeBest() {
        assertEquals(3, solution.convertTimeBest("02:30", "04:35"));
        assertEquals(1, solution.convertTimeBest("11:00", "11:01"));
    }

}