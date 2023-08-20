package com.devstromo.medium.p74;

import static com.devstromo.medium.p74.Solution.searchMatrix;
import static com.devstromo.medium.p74.Solution.searchMatrixBestMemory;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSearchMatrix() {
        assertTrue(searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3));
    }

    @Test
    void testSearchMatrixNotFound() {
        assertFalse(searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 13));
    }

    @Test
    void testSearchMatrixBestMemory() {
        assertTrue(searchMatrixBestMemory(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3));
    }

    @Test
    void testSearchMatrixBestMemoryNotFound() {
        assertFalse(searchMatrixBestMemory(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 13));
    }
}