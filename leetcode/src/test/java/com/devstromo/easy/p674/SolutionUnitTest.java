package com.devstromo.easy.p674;

import static com.devstromo.easy.p674.Solution.findLengthOfLCIS;
import static com.devstromo.easy.p674.Solution.findLengthOfLCISBest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFindLengthOfLCIS() {
        assertEquals(3, findLengthOfLCIS(new int[] { 1, 3, 5, 4, 7 }));
    }

    @Test
    void testFindLengthOfLCIS2() {
        assertEquals(1, findLengthOfLCIS(new int[] { 2, 2, 2, 2, 2 }));
    }

    @Test
    void testFindLengthOfLCISBestPerformance() {
        assertEquals(3, findLengthOfLCISBest(new int[] { 1, 3, 5, 4, 7 }));
    }

    @Test
    void testFindLengthOfLCISBestPerformance2() {
        assertEquals(1, findLengthOfLCISBest(new int[] { 2, 2, 2, 2, 2 }));
    }

}