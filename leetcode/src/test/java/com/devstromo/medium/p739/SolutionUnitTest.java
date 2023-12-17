package com.devstromo.medium.p739;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testDailyTemperatures() {
        var input = new int[]{58, 56, 61, 55, 57, 44, 40, 35, 46};
        var expected = new int[]{2, 1, 0, 1, 0, 3, 2, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(input));
    }

    @Test
    public void testDailyTemperatures2() {
        var input = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        var expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(input));
    }

    @Test
    public void testDailyTemperatures3() {
        var input = new int[]{30, 40, 50, 60};
        var expected = new int[]{1, 1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(input));
    }

    @Test
    public void testDailyTemperatures4() {
        var input = new int[]{30, 60, 90};
        var expected = new int[]{1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(input));
    }

    @Test
    public void testDailyTemperaturesBest() {
        var input = new int[]{58, 56, 61, 55, 57, 44, 40, 35, 46};
        var expected = new int[]{2, 1, 0, 1, 0, 3, 2, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperaturesBest(input));
    }

    @Test
    public void testDailyTemperaturesBest2() {
        var input = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        var expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperaturesBest(input));
    }

    @Test
    public void testDailyTemperaturesBest3() {
        var input = new int[]{30, 40, 50, 60};
        var expected = new int[]{1, 1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperaturesBest(input));
    }

    @Test
    public void testDailyTemperaturesBest4() {
        var input = new int[]{30, 60, 90};
        var expected = new int[]{1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperaturesBest(input));
    }

}