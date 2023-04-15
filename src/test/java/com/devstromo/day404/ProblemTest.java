package com.devstromo.day404;

import static com.devstromo.day404.Problem.findMinimumRooms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemTest {
    @Test
    public void testEmptyIntervals() {
        int[][] intervals = {};
        int expected = 0;
        assertEquals(expected, findMinimumRooms(intervals));
    }

    @Test
    public void testSingleInterval() {
        int[][] intervals = { { 0, 30 } };
        int expected = 1;
        assertEquals(expected, findMinimumRooms(intervals));
    }

    @Test
    public void testNonOverlappingIntervals() {
        int[][] intervals = { { 0, 30 }, { 30, 60 }, { 60, 90 } };
        int expected = 1;
        assertEquals(expected, findMinimumRooms(intervals));
    }

    @Test
    public void testOverlappingIntervals() {
        int[][] intervals = { { 30, 75 }, { 0, 50 }, { 60, 150 } };
        int expected = 2;
        assertEquals(expected, findMinimumRooms(intervals));
    }

    @Test
    public void testMultipleOverlappingIntervals() {
        int[][] intervals = { { 0, 50 }, { 10, 60 }, { 20, 70 }, { 30, 80 }, { 40, 90 } };
        int expected = 5;
        assertEquals(expected, findMinimumRooms(intervals));
    }
}