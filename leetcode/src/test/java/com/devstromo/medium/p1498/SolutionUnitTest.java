package com.devstromo.medium.p1498;

import static com.devstromo.medium.p1498.Solution.numSubseq;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testNumSubseq() {
        var nums1 = new int[] { 3, 5, 6, 7 };
        var target1 = 9;
        assertEquals(4, numSubseq(nums1, target1));
        var nums2 = new int[] { 3, 3, 6, 8 };
        var target2 = 10;
        assertEquals(6, numSubseq(nums2, target2));

        var nums3 = new int[] { 2, 3, 3, 4, 6, 7 };
        var target3 = 12;
        assertEquals(61, numSubseq(nums3, target3));

        var nums4 = new int[] { 7,10,7,3,7,5,4 };
        var target4 = 12;
        assertEquals(56, numSubseq(nums4, target4));

        var nums5 = new int[] { 14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14 };
        var target5 = 22;
        assertEquals(272187084, numSubseq(nums5, target5));
    }

}