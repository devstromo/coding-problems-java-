package com.devstromo.easy.p1486;

import static com.devstromo.easy.p1486.Solution.xorOperation;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testXorOperation() {
        assertEquals(8, xorOperation(5, 0));
    }

    @Test
    void testXorOperation2() {
        assertEquals(8, xorOperation(4, 3));
    }
}