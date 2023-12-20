package com.devstromo.easy.p1952;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private Solution solution = new Solution();

    @Test
    void testIsThree() {
        assertTrue(solution.isThree(4));
    }

    @Test
    void testIsNotThree() {
        assertFalse(solution.isThree(2));
    }


}