package com.devstromo.medium.p1992;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test  Find All Groups of Farmland")
    void testFindAllGroupsOfFarmland() {
        assertArrayEquals(
                new int[][]{
                        {0, 0, 0, 0},
                        {1, 1, 2, 2},
                },
                solution.findFarmland(new int[][]{
                        {1, 0, 0},
                        {0, 1, 1},
                        {0, 1, 1}
                })
        );
        assertArrayEquals(
                new int[][]{
                        {0, 0, 1, 1}
                },
                solution.findFarmland(new int[][]{
                        {1, 1},
                        {1, 1}
                })
        );
        assertArrayEquals(
                new int[][]{
                        {0}
                },
                solution.findFarmland(new int[][]{})
        );
    }

}