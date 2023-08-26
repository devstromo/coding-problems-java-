package com.devstromo.easy.p2769;

import static com.devstromo.easy.p2769.Solution.theMaximumAchievableX;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testTheMaximumAchievableX() {
        assertEquals(6, theMaximumAchievableX(4, 1));
    }

    @Test
    void testTheMaximumAchievableX2() {
        assertEquals(7, theMaximumAchievableX(3, 2));
    }
}