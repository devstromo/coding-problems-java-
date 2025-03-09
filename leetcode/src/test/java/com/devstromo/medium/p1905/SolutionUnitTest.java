package com.devstromo.medium.p1905;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Count Sub Islands")
    void testCountSubIslands() {
        assertEquals(3, solution.countSubIslands(
                new int[][]{
                        {1, 1, 1, 0, 0},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 1, 1}
                },
                new int[][]{
                        {1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 1, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {0, 1, 0, 1, 0}
                }
        ));
        assertEquals(2, solution.countSubIslands(
                new int[][]{
                        {1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1}
                },
                new int[][]{
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1}
                }
        ));
    }

    @Test
    @DisplayName("Test Count Sub Islands Best")
    void testCountSubIslandsBest() {
        assertEquals(3, solution.countSubIslandsBest(
                new int[][]{
                        {1, 1, 1, 0, 0},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 1, 1}
                },
                new int[][]{
                        {1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 1, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {0, 1, 0, 1, 0}
                }
        ));
        assertEquals(2, solution.countSubIslandsBest(
                new int[][]{
                        {1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1}
                },
                new int[][]{
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1}
                }
        ));
    }
}