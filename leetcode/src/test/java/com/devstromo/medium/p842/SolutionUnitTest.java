package com.devstromo.medium.p842;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testSplitIntoFibonacci() {
        assertEquals(List.of(11, 0, 11, 11), solution.splitIntoFibonacci("1101111"));
        assertEquals(List.of(), solution.splitIntoFibonacci("112358130"));
        assertEquals(List.of(), solution.splitIntoFibonacci("0123"));
    }

    @Test
    void testSplitIntoFibonacciBest() {
        assertEquals(List.of(11, 0, 11, 11), solution.splitIntoFibonacciBest("1101111"));
        assertEquals(List.of(), solution.splitIntoFibonacciBest("112358130"));
        assertEquals(List.of(), solution.splitIntoFibonacciBest("0123"));
    }

}