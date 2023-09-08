package com.devstromo.medium.p300;

import static com.devstromo.medium.p300.Solution.lengthOfLIS;
import static com.devstromo.medium.p300.Solution.lengthOfLISBestMemory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testLengthOfLIS() {
        assertEquals(4, lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    }

    @Test
    void testLengthOfLIS2() {
        assertEquals(4, lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
    }

    @Test
    void testLengthOfLIS3() {
        assertEquals(1, lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
    }

    @Test
    void testLengthOfLISBestMemory() {
        assertEquals(4, lengthOfLISBestMemory(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    }

    @Test
    void testLengthOfLISBestMemory2() {
        assertEquals(4, lengthOfLISBestMemory(new int[] { 0, 1, 0, 3, 2, 3 }));
    }

    @Test
    void testLengthOfLISBestMemory3() {
        assertEquals(1, lengthOfLISBestMemory(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
    }
}