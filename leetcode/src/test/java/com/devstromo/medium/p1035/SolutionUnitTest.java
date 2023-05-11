package com.devstromo.medium.p1035;

import static com.devstromo.medium.p1035.Solution.maxUncrossedLines;
import static com.devstromo.medium.p1035.Solution.maxUncrossedLinesRecursive;
import static com.devstromo.medium.p1035.Solution.maxUncrossedLinesBestRuntime;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxUncrossedLines() {
        assertEquals(2, maxUncrossedLines(new int[] { 1, 4, 2 }, new int[] { 1, 2, 4 }));
        assertEquals(3, maxUncrossedLines(new int[] { 2, 5, 1, 2, 5 }, new int[] { 10, 5, 2, 1, 5, 2 }));
        assertEquals(2, maxUncrossedLines(new int[] { 1, 3, 7, 1, 7, 5 }, new int[] { 1, 9, 2, 5, 1 }));
    }

    @Test
    void testMaxUncrossedLinesBestRuntime() {
        assertEquals(2, maxUncrossedLinesBestRuntime(new int[] { 1, 4, 2 }, new int[] { 1, 2, 4 }));
        assertEquals(3, maxUncrossedLinesBestRuntime(new int[] { 2, 5, 1, 2, 5 }, new int[] { 10, 5, 2, 1, 5, 2 }));
        assertEquals(2, maxUncrossedLinesBestRuntime(new int[] { 1, 3, 7, 1, 7, 5 }, new int[] { 1, 9, 2, 5, 1 }));
    }

    @Test
    void testMaxUncrossedLinesRecursive() {
        assertEquals(2, maxUncrossedLinesRecursive(new int[] { 1, 4, 2 }, new int[] { 1, 2, 4 }));
        assertEquals(3, maxUncrossedLinesRecursive(new int[] { 2, 5, 1, 2, 5 }, new int[] { 10, 5, 2, 1, 5, 2 }));
        assertEquals(2, maxUncrossedLinesRecursive(new int[] { 1, 3, 7, 1, 7, 5 }, new int[] { 1, 9, 2, 5, 1 }));
        // Time Limit Exceeded
        // assertEquals(2, maxUncrossedLinesRecursive(new int[] { 1,2,4,1,4,4,3,5,5,1,4,4,4,1,4,3,4,2,4,2 }, new int[] { 2,4,1,1,3,5,2,1,5,1,2,3,3,2,1,4,1,2,5,5 }));
    }
}