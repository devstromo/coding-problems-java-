package com.devstromo.day401;

import static com.devstromo.day401.Problem.applyPermutation;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProblemUnitTest {
    @Test
    public void testApplyPermutation() {
        String[] arr1 = { "a", "b", "c" };
        int[] perm1 = { 2, 1, 0 };
        String[] expected1 = { "c", "b", "a" };
        assertArrayEquals(expected1, applyPermutation(arr1, perm1), "Permutation 1 should return expected result");

        String[] arr2 = { "apple", "banana", "cherry", "date" };
        int[] perm2 = { 3, 2, 1, 0 };
        String[] expected2 = { "date", "cherry", "banana", "apple" };
        assertArrayEquals(expected2, applyPermutation(arr2, perm2), "Permutation 2 should return expected result");

        String[] arr3 = { "one", "two", "three", "four" };
        int[] perm3 = { 0, 3, 2, 1 };
        String[] expected3 = { "one", "four", "three", "two" };
        assertArrayEquals(expected3, applyPermutation(arr3, perm3), "Permutation 3 should return expected result");
    }
}