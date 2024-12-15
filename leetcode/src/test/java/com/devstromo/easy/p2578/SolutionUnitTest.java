package com.devstromo.easy.p2578;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testSplitNum() {
        assertEquals(59, solution.splitNum(4325));
        assertEquals(75, solution.splitNum(687));
    }

}