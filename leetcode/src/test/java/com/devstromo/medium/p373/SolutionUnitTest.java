package com.devstromo.medium.p373;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void solve() {
        assertEquals(List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6)), solution.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
        assertEquals(List.of(List.of(1, 1), List.of(1, 1)), solution.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2));

    }
}