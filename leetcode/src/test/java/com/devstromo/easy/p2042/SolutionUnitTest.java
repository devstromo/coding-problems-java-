package com.devstromo.easy.p2042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testIfNumbersAreAscending() {
        assertTrue(solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        assertFalse(solution.areNumbersAscending("hello world 5 x 5"));
        assertFalse(solution.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    @Test
    void testIfNumbersAreAscendingBest() {
        assertTrue(solution.areNumbersAscendingBest("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        assertFalse(solution.areNumbersAscendingBest("hello world 5 x 5"));
        assertFalse(solution.areNumbersAscendingBest("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

}