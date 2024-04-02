package com.devstromo.medium.p1638;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();


    @Test
    void testCountSubstrings() {
        assertEquals(6, solution.countSubstrings("aba", "baba"));
    }

    @Test
    void testCountSubstrings2() {
        assertEquals(3, solution.countSubstrings("ab", "bb"));
    }

}