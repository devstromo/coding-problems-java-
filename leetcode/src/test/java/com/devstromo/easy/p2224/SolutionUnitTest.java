package com.devstromo.easy.p2224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void test() {
        assertEquals(3, solution.convertTime("02:30", "04:35"));
        assertEquals(1, solution.convertTime("11:00", "11:01"));
    }

}