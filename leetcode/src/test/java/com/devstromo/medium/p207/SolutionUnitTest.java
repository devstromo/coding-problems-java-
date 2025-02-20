package com.devstromo.medium.p207;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Course Schedule")
    void testCourseSchedule() {
        assertTrue(solution.canFinish(2, new int[][]{
                {1, 0},
        }));
        assertFalse(solution.canFinish(2, new int[][]{
                {1, 0},
                {0, 1},
        }));
    }

    @Test
    @DisplayName("Test Course Schedule dfs")
    void testCourseScheduleDFS() {
        assertTrue(solution.canFinishDFS(2, new int[][]{
                {1, 0},
        }));
        assertFalse(solution.canFinishDFS(2, new int[][]{
                {1, 0},
                {0, 1},
        }));
    }
}