package com.devstromo.day310;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemTest {

    @Test
    public void testBit() {
        Problem problem = new Problem();
        assertEquals(5, problem.solve(4));
        assertEquals(35, problem.solve(17));
    }

}