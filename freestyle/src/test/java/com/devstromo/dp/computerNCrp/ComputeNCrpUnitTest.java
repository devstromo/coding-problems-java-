package com.devstromo.dp.computerNCrp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeNCrpUnitTest {
    private final ComputeNCrp solution = new ComputeNCrp();

    @Test
    public void testComputeNCrp() {
        assertEquals(1, solution.solution(1, 1, 1));
        assertEquals(3, solution.solution(8, 2, 5));
        assertEquals(10, solution.solution(5, 2, 13));
    }

    @Test
    public void testComputeNCrpRecursive() {
        assertEquals(1, solution.solutionRecursive(1, 1, 1));
        assertEquals(3, solution.solutionRecursive(8, 2, 5));
        assertEquals(10, solution.solutionRecursive(5, 2, 13));
    }

    @Test
    public void testComputeNCrp2DArray() {
        assertEquals(1, solution.solution2DArray(1, 1, 1));
        assertEquals(3, solution.solution2DArray(8, 2, 5));
        assertEquals(10, solution.solution2DArray(5, 2, 13));
    }

    @Test
    public void testComputeNCrpUsingFermatLittleTheorem() {
        // p must be a prime greater than n.
        assertEquals(6, solution.solutionUsingFermatLittleTheorem(10, 2, 13));
        assertEquals(10, solution.solutionUsingFermatLittleTheorem(5, 3, 17));
    }


    @Test
    public void testComputeNCrpUsingFermatLittleTheoremOptimized() {
        // p must be a prime greater than n.
        assertEquals(6, solution.solutionUsingFermatLittleTheoremOptimized(10, 2, 13));
        assertEquals(10, solution.solutionUsingFermatLittleTheoremOptimized(5, 3, 17));
    }
}