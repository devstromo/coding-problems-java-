package com.devstromo.easy.p2215;

import static com.devstromo.easy.p2215.Solution.findDifference;
import static com.devstromo.easy.p2215.Solution.findDifferenceLessMemory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFindDifference() {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };
        var result = findDifference(array1, array2);
        assertEquals(List.of(1, 2), result.get(0));
        assertEquals(List.of(6, 7), result.get(1));
        array1 = new int[] { 1, 2, 3, 3 };
        array2 = new int[] { 1, 1, 2, 2 };
        result = findDifference(array1, array2);
        assertEquals(List.of(3), result.get(0));
        assertEquals(Collections.emptyList(), result.get(1));
    }

    @Test
    void testFindDifferenceBinarySearch() {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };
        var result = findDifferenceLessMemory(array1, array2);
        assertEquals(List.of(1, 2), result.get(0));
        assertEquals(List.of(6, 7), result.get(1));
        array1 = new int[] { 1, 2, 3, 3 };
        array2 = new int[] { 1, 1, 2, 2 };
        result = findDifferenceLessMemory(array1, array2);
        assertEquals(List.of(3), result.get(0));
        assertEquals(Collections.emptyList(), result.get(1));
    }
}