package com.devstromo.hard.p1964;

import static com.devstromo.hard.p1964.Solution.longestObstacleCourseAtEachPositionList;
import static com.devstromo.hard.p1964.Solution.longestObstacleCourseAtEachPositionDP;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testLongestObstacleCourseAtEachPosition() {

        var obstacles1 = new int[] { 1, 2, 3, 2 };
        var expected1 = new int[] { 1, 2, 3, 3 };
        assertArrayEquals(expected1, longestObstacleCourseAtEachPositionDP(obstacles1));

        var obstacles2 = new int[] { 2, 2, 1 };
        var expected2 = new int[] { 1, 2, 1 };
        assertArrayEquals(expected2, longestObstacleCourseAtEachPositionDP(obstacles2));

        var obstacles3 = new int[] { 3, 1, 5, 6, 4, 2 };
        var expected3 = new int[] { 1, 1, 2, 3, 2, 2 };
        assertArrayEquals(expected3, longestObstacleCourseAtEachPositionDP(obstacles3));

        var obstacles4 = new int[] { 3, 1, 4, 2 };
        var expected4 = new int[] { 1, 1, 2, 2 };
        assertArrayEquals(expected4, longestObstacleCourseAtEachPositionDP(obstacles4));
    }

    @Test
    void testLongestObstacleCourseAtEachPositionList() {
        var obstacles1 = new int[] { 1, 2, 3, 2 };
        var expected1 = new int[] { 1, 2, 3, 3 };
        assertArrayEquals(expected1, longestObstacleCourseAtEachPositionList(obstacles1));

        var obstacles2 = new int[] { 2, 2, 1 };
        var expected2 = new int[] { 1, 2, 1 };
        assertArrayEquals(expected2, longestObstacleCourseAtEachPositionList(obstacles2));

        var obstacles3 = new int[] { 3, 1, 5, 6, 4, 2 };
        var expected3 = new int[] { 1, 1, 2, 3, 2, 2 };
        assertArrayEquals(expected3, longestObstacleCourseAtEachPositionList(obstacles3));
    }

}