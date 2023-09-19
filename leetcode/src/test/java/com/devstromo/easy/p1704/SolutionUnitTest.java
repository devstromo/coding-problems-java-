package com.devstromo.easy.p1704;

import static com.devstromo.easy.p1704.Solution.halvesAreAlike;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    void testHalvesAreAlike() {
        assertTrue(halvesAreAlike("book"));
    }

    @Test
    void testHalvesAreAlike2() {
        assertFalse(halvesAreAlike("textbook"));
    }

}