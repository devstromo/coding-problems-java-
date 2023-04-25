package com.devstromo.day402;

import static com.devstromo.day402.Problem.isStrobogrammatic;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProblemTest {
    @Test
    public void testIsStrobogrammatic() {
        assertTrue(isStrobogrammatic("16891"), "16891 should be strobogrammatic");
        assertTrue(isStrobogrammatic("69"), "69 should be strobogrammatic");
        assertTrue(isStrobogrammatic("96"), "96 should be strobogrammatic");
        assertTrue(isStrobogrammatic("818"), "818 should be strobogrammatic");
        assertTrue(isStrobogrammatic("1"), "1 should be strobogrammatic");
        assertTrue(isStrobogrammatic(""), "An empty string should be strobogrammatic");
        assertTrue(isStrobogrammatic("010"), "010 should be strobogrammatic");

        assertFalse(isStrobogrammatic("123"), "123 should not be strobogrammatic");
        assertFalse(isStrobogrammatic("678"), "678 should not be strobogrammatic");
        assertFalse(isStrobogrammatic("25"), "25 should not be strobogrammatic");
        assertFalse(isStrobogrammatic("171"), "171 should not be strobogrammatic");
    }
}