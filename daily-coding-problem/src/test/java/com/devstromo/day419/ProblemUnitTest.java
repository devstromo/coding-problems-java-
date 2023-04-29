package com.devstromo.day419;

import static com.devstromo.day419.Problem.findStepsToOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemUnitTest {

    @Test
    void testFindStepsToOne() {
        assertEquals(5, findStepsToOne(100));
        assertEquals(9, findStepsToOne(15));
    }

}