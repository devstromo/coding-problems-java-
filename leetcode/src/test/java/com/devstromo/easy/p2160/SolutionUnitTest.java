package com.devstromo.easy.p2160;

import static com.devstromo.easy.p2160.Solution.minimumSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMinimumSum() {
        assertEquals(52, minimumSum(2932));
    }

    @Test
    void testMinimumSum2() {
        assertEquals(13, minimumSum(4009));
    }

}