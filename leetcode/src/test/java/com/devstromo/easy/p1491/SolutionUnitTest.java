package com.devstromo.easy.p1491;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    private static final double DELTA = 1e-5;
    Solution solution = new Solution();

    @Test
    void testAverage() {
        assertEquals(2500.0, solution.average(new int[] { 4000, 3000, 1000, 2000 }), DELTA);
        assertEquals(2000.0, solution.average(new int[] { 1000, 2000, 3000 }), DELTA);
    }

    @Test
    public void testAverageSalary_Example3() {
        int[] salary = { 6000, 5000, 4000, 3000, 2000, 1000 };
        double expected = 3500.0;
        assertEquals(expected, solution.average(salary), DELTA);
    }

    @Test
    public void testAverageSalary_AllEqual() {
        int[] salary = { 5000, 5000, 5000, 5000, 5000 };
        double expected = 5000.0;
        assertEquals(expected, solution.average(salary), DELTA);
    }

    @Test
    public void testAverageSalary_LargeArray() {
        int[] salary = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };
        double expected = 55000.0;
        assertEquals(expected, solution.average(salary), DELTA);
    }

    @Test
    void testAverageSecond() {
        assertEquals(2500.0, solution.averageSimple(new int[] { 4000, 3000, 1000, 2000 }), DELTA);
        assertEquals(2000.0, solution.averageSimple(new int[] { 1000, 2000, 3000 }), DELTA);
    }

    @Test
    public void testAverageSalarySecond_Example3() {
        int[] salary = { 6000, 5000, 4000, 3000, 2000, 1000 };
        double expected = 3500.0;
        assertEquals(expected, solution.averageSimple(salary), DELTA);
    }

    @Test
    public void testAverageSalarySecond_AllEqual() {
        int[] salary = { 5000, 5000, 5000, 5000, 5000 };
        double expected = 5000.0;
        assertEquals(expected, solution.averageSimple(salary), DELTA);
    }

    @Test
    public void testAverageSalarySecond_LargeArray() {
        int[] salary = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };
        double expected = 55000.0;
        assertEquals(expected, solution.averageSimple(salary), DELTA);
    }
}