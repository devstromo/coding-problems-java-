package com.devstromo.dp.computerNCrp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeNCrpUnitTest {
    private final ComputeNCrp solution = new ComputeNCrp();

    @Test
    public void testComputeNCrp() {
        assertEquals(1, solution.solution(1, 1, 1));
        assertEquals(3, solution.solution(8, 2, 5));
    }

}