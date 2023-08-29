package com.devstromo.easy.p1281;

import static com.devstromo.easy.p1281.Solution.subtractProductAndSum;
import static com.devstromo.easy.p1281.Solution.subtractProductAndSumBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSubtractProductAndSum() {
        assertEquals(15, subtractProductAndSum(234));
    }

    @Test
    void testSubtractProductAndSum2() {
        assertEquals(21, subtractProductAndSum(4421));
    }

    @Test
    void testSubtractProductAndSumBest() {
        assertEquals(15, subtractProductAndSumBest(234));
    }

    @Test
    void testSubtractProductAndSumBest2() {
        assertEquals(21, subtractProductAndSumBest(4421));
    }

}