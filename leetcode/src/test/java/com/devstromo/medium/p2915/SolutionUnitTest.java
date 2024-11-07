package com.devstromo.medium.p2915;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void test() {
        assertEquals(3, solution.lengthOfLongestSubsequence(List.of(1, 2, 3, 4, 5), 9));
        assertEquals(4, solution.lengthOfLongestSubsequence(List.of(4, 1, 3, 2, 1, 5), 7));
        assertEquals(-1, solution.lengthOfLongestSubsequence(List.of(1, 1, 5, 4, 5), 3));
    }

}