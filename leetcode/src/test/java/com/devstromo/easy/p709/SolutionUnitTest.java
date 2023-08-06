package com.devstromo.easy.p709;

import static com.devstromo.easy.p709.Solution.toLowerCase;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testToLowerCase() {
        assertEquals("hello", toLowerCase("Hello"));
    }

    @Test
    void testToLowerCase2() {
        assertEquals("here", toLowerCase("here"));
    }

    @Test
    void testToLowerCase3() {
        assertEquals("lovely", toLowerCase("LOVELY"));
    }
}