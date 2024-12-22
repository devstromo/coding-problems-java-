package com.devstromo.medium.p435;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testEraseOverlapIntervals() {
        assertEquals(1, solution.eraseOverlapIntervals(
                new int[][]{
                        {1, 2},
                        {2, 3},
                        {3, 4},
                        {1, 3}
                }
        ));
        assertEquals(2, solution.eraseOverlapIntervals(
                new int[][]{
                        {1, 2},
                        {1, 2},
                        {1, 2}
                }
        ));
        assertEquals(0, solution.eraseOverlapIntervals(
                new int[][]{
                        {1, 2},
                        {2, 3}
                }
        ));
    }

}