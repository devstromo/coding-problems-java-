package com.devstromo.easy.p2900;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testGetLongestSubsequence() {
        assertEquals(List.of("e", "b"), solution.getLongestSubsequence(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}));
        assertEquals(List.of("a", "b", "c"), solution.getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}));
        assertEquals(List.of("c"), solution.getLongestSubsequence(new String[]{"c"}, new int[]{0}));
        assertEquals(List.of("d"), solution.getLongestSubsequence(new String[]{"d"}, new int[]{1}));
        assertEquals(List.of("d", "g"), solution.getLongestSubsequence(new String[]{"d", "g"}, new int[]{0, 1}));
    }


}