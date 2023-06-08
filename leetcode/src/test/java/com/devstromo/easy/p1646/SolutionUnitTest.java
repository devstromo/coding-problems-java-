package com.devstromo.easy.p1646;

import static com.devstromo.easy.p1646.Solution.getMaximumGenerated;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {


    @Test
    void testGetMaximumGenerated(){
        assertEquals(3, getMaximumGenerated(7));
        assertEquals(1, getMaximumGenerated(2));
        assertEquals(2, getMaximumGenerated(3));
    }

}