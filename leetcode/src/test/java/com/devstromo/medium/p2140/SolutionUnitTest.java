package com.devstromo.medium.p2140;

import static com.devstromo.medium.p2140.Solution.mostPoints;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    public void testMaxPoints() {
        var questions = new int[][] { { 3, 2 }, { 4, 3 }, { 4, 4 }, { 2, 5 } };

        assertEquals(5, mostPoints(questions));
    }

    @Test
    public void testMaxPoints2() {
        var questions = new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };

        assertEquals(7, mostPoints(questions));
    }
}