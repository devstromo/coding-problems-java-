package com.devstromo.dp.lis;

import static com.devstromo.dp.lis.LIS.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LISUnitTest {

    @Test
    public void testLis() {
        var arr1 = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        assertEquals(6, lis(arr1));
    }

    @Test
    public void testLis2() {
        var arr2 = new int[]{3, 4, 5, 10, 2, 15};
        assertEquals(5, lis(arr2));
    }

    @Test
    public void testLis3() {
        var arr3 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(1, lis(arr3));
    }

    @Test
    public void testLisP1() {
        var arr1 = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        assertEquals(6, lisP1(arr1));
    }

    @Test
    public void testLisP12() {
        var arr2 = new int[]{3, 4, 5, 10, 2, 15};
        assertEquals(5, lisP1(arr2));
    }

    @Test
    public void testLisP13() {
        var arr3 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(1, lisP1(arr3));
    }

    @Test
    public void testLisP2() {
        var arr1 = new int[]{1, 3, 7, 5, 10, 4, 15};
        assertEquals(5, lisP2(arr1));
    }

    @Test
    public void testLisP3() {
        var arr1 = new int[]{6, 2, 4, 3, 7, 4, 5};
        assertEquals(4, lisP3(arr1));
    }

    @Test
    public void testLds1() {
        var arr1 = new int[]{9, 4, 3, 2, 5, 4, 3, 2};
        assertEquals(5, longestDecreasingSubsequence(arr1));
    }

    @Test
    public void testLds2() {
        var arr1 = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        assertEquals(2, longestDecreasingSubsequence(arr1));
    }

    @Test
    public void testLongestBitonicSubsequence() {
        var arr1 = new int[]{1, 11, 2, 10, 4, 5, 2, 1};
        assertEquals(6, longestBitonicSubsequence(arr1));
    }

    @Test
    public void testLongestBitonicSubsequence2() {
        var arr1 = new int[]{12, 11, 40, 5, 3, 1};
        assertEquals(5, longestBitonicSubsequence(arr1));
    }

    @Test
    public void testLongestBitonicSubsequence3() {
        var arr1 = new int[]{10, 20, 30, 40};
        assertEquals(4, longestBitonicSubsequence(arr1));
    }

    @Test
    public void testLongestIncreaseSubsequenceWithUniqueDifferences() {
        var arr1 = new int[]{1, 2, 4, 7, 11, 8, 12, 7, 6, 5};
        assertEquals(4, longestIncreaseSubsequenceWithUniqueDifference(arr1));
    }

    @Test
    public void testLongestIncreaseSubsequenceWithUniqueDifferences2() {
        var arr1 = new int[]{5, 9, 4, 10, 5, 8, 9, 7};
        assertEquals(3, longestIncreaseSubsequenceWithUniqueDifference(arr1));
    }
}