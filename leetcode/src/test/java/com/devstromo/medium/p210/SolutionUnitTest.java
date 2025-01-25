package com.devstromo.medium.p210;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Course Schedule II")
    public void testCourseScheduleII() {
        assertArrayEquals(
                new int[]{0, 1},
                solution.findOrder(2, new int[][]{
                        {1, 0},
                }));
        int[] actual = solution.findOrder(4, new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2},
        });
        List<int[]> expectedOutputs = List.of(
                new int[]{0, 1, 2, 3},
                new int[]{0, 2, 1, 3}
        );

        assertTrue(
                expectedOutputs.stream().anyMatch(expected -> Arrays.equals(expected, actual))
        );
    }

    @Test
    @DisplayName("Test Course Schedule II Best")
    public void testCourseScheduleIIBest() {
        int[] actual = solution.findOrderBest(4, new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2},
        });
        List<int[]> expectedOutputs = List.of(
                new int[]{0, 1, 2, 3},
                new int[]{0, 2, 1, 3}
        );

        assertTrue(
                expectedOutputs.stream().anyMatch(expected -> Arrays.equals(expected, actual))
        );
    }
}