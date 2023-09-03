package com.devstromo.easy.p1051;

import static com.devstromo.easy.p1051.Solution.heightChecker;
import static com.devstromo.easy.p1051.Solution.heightCheckerMerge;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testHeightChecker() {
        assertEquals(3, heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
    }

    @Test
    void testHeightChecker2() {
        assertEquals(5, heightChecker(new int[] { 5, 1, 2, 3, 4 }));
    }

    @Test
    void testHeightChecker3() {
        assertEquals(0, heightChecker(new int[] { 1, 2, 3, 4, 5 }));
    }

    @Test
    void testHeightCheckerMergeSort() {
        assertEquals(3, heightCheckerMerge(new int[] { 1, 1, 4, 2, 1, 3 }));
    }

    @Test
    void testHeightCheckerMergeSort2() {
        assertEquals(5, heightCheckerMerge(new int[] { 5, 1, 2, 3, 4 }));
    }

    @Test
    void testHeightCheckerMergeSort3() {
        assertEquals(0, heightCheckerMerge(new int[] { 1, 2, 3, 4, 5 }));
    }
}