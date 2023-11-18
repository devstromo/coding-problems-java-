package com.devstromo.easy.p202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testIsHappy() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    public void testNotIsHappy() {
        assertFalse(solution.isHappy(2));
    }


}