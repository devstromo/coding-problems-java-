package com.devstromo.medium.p63;

import static com.devstromo.medium.p63.Solution.uniquePathsWithObstacles;
import static com.devstromo.medium.p63.Solution.uniquePathsWithObstaclesAnother;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testUniquePathsWithObstacles() {
        var obstacleGrid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        assertEquals(2, uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void testUniquePathsWithObstacles2() {
        var obstacleGrid = new int[][] { { 0, 1 }, { 0, 0 } };
        assertEquals(1, uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void testUniquePathsWithObstaclesAnother() {
        var obstacleGrid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        assertEquals(2, uniquePathsWithObstaclesAnother(obstacleGrid));
    }

    @Test
    void testUniquePathsWithObstaclesAnother2() {
        var obstacleGrid = new int[][] { { 0, 1 }, { 0, 0 } };
        assertEquals(1, uniquePathsWithObstaclesAnother(obstacleGrid));
    }
}