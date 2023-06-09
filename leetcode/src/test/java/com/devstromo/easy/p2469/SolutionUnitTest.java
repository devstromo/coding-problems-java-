package com.devstromo.easy.p2469;

import static com.devstromo.easy.p2469.Solution.convertTemperature;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testConvertTemperature() {
        assertArrayEquals(new double[] { 309.65000, 97.70000 }, convertTemperature(36.50));
        assertArrayEquals(new double[] { 395.26000, 251.79800 }, convertTemperature(122.11));
    }
}