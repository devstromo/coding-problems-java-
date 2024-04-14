package com.devstromo.easy.p1668;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMaxRepeating() {
        assertEquals(2, solution.maxRepeating("ababc", "ab"));
    }

    @Test
    void testMaxRepeating2() {
        assertEquals(1, solution.maxRepeating("ababc", "ba"));
    }

    @Test
    void testMaxRepeating3() {
        assertEquals(0, solution.maxRepeating("ababc", "ac"));
    }

    @Test
    void testMaxRepeating4() {
        assertEquals(1, solution.maxRepeating("a", "a"));
    }

    @Test
    void testMaxRepeating5() {
        assertEquals(0, solution.maxRepeating("a", "c"));
    }

    @Test
    void testMaxRepeating6() {
        assertEquals(5, solution.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

    @Test
    void testMaxRepeatingBest() {
        assertEquals(2, solution.maxRepeatingBest("ababc", "ab"));
    }

    @Test
    void testMaxRepeatingBest2() {
        assertEquals(1, solution.maxRepeatingBest("ababc", "ba"));
    }

    @Test
    void testMaxRepeatingBest3() {
        assertEquals(0, solution.maxRepeatingBest("ababc", "ac"));
    }

    @Test
    void testMaxRepeatingBest4() {
        assertEquals(1, solution.maxRepeatingBest("a", "a"));
    }

    @Test
    void testMaxRepeatingBest5() {
        assertEquals(0, solution.maxRepeatingBest("a", "c"));
    }

    @Test
    void testMaxRepeatingBest6() {
        assertEquals(5, solution.maxRepeatingBest("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

}