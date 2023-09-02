package com.devstromo.easy.p1342;

import static com.devstromo.easy.p1342.Solution.numberOfSteps;
import static com.devstromo.easy.p1342.Solution.numberOfStepsBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testNumberOfSteps() {
        assertEquals(6, numberOfSteps(14));
    }

    @Test
    void testNumberOfSteps2() {
        assertEquals(4, numberOfSteps(8));
    }

    @Test
    void testNumberOfSteps3() {
        assertEquals(12, numberOfSteps(123));
    }

    @Test
    void testNumberOfStepsBest() {
        assertEquals(6, numberOfStepsBest(14));
    }

    @Test
    void testNumberOfStepsBest2() {
        assertEquals(4, numberOfStepsBest(8));
    }

    @Test
    void testNumberOfStepsBest3() {
        assertEquals(12, numberOfStepsBest(123));
    }

}