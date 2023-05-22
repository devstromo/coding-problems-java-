package com.devstromo.medium.p347;

import static com.devstromo.medium.p347.Solution.topKFrequent;
import static com.devstromo.medium.p347.Solution.topKFrequentBest;
import static com.devstromo.medium.p347.Solution.topKFrequentRuntime;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testTopKFrequent() {
        assertArrayEquals(new int[] { 1, 2 }, topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
    }

    @Test
    void testTopKFrequent2() {
        assertArrayEquals(new int[] { 1 }, topKFrequent(new int[] { 1 }, 1));
    }

    @Test
    void testTopKFrequentBestMemory() {
        assertArrayEquals(new int[] { 1, 2 }, topKFrequentBest(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
    }

    @Test
    void testTopKFrequentBestMemory2() {
        assertArrayEquals(new int[] { 1 }, topKFrequentBest(new int[] { 1 }, 1));
    }

    @Test
    void testTopKFrequentBestRuntime() {
        assertArrayEquals(new int[] { 1, 2 }, topKFrequentRuntime(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
    }

    @Test
    void testTopKFrequentBestRuntime2() {
        assertArrayEquals(new int[] { 1 }, topKFrequentRuntime(new int[] { 1 }, 1));
    }
}