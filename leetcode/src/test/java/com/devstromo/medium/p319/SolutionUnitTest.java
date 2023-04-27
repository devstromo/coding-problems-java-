package com.devstromo.medium.p319;

import static com.devstromo.medium.p319.Solution.bulbSwitch;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    public void testBulbSwitch() {
        assertEquals(1, bulbSwitch(1));
        assertEquals(1, bulbSwitch(2));
        assertEquals(1, bulbSwitch(3));

    }
}