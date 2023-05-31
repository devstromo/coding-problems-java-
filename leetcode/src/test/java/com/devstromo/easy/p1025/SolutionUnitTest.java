package com.devstromo.easy.p1025;

import static com.devstromo.easy.p1025.Solution.divisorGame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testDivisorGame() {
        assertTrue(divisorGame(2));
        assertFalse(divisorGame(3));
    }

}