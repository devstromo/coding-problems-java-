package com.devstromo.medium.p2542;

import static com.devstromo.medium.p2542.Solution.maxScore;
import static com.devstromo.medium.p2542.Solution.maxScoreBestMemory;
import static com.devstromo.medium.p2542.Solution.maxScorePair;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxScore() {
        int[] nums1 = { 1, 3, 3, 2 };
        int[] nums2 = { 2,1,3,4 };
        assertEquals(12, maxScore(nums1, nums2, 3));
    }

    @Test
    void testMaxScorePair() {
        int[] nums1 = { 1, 3, 3, 2 };
        int[] nums2 = { 2,1,3,4 };
        assertEquals(12, maxScorePair(nums1, nums2, 3));
    }

    @Test
    void testMaxScoreBestMemory() {
        int[] nums1 = { 1, 3, 3, 2 };
        int[] nums2 = { 2,1,3,4 };
        assertEquals(12, maxScoreBestMemory(nums1, nums2, 3));
    }
}