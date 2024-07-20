package com.devstromo.dp.number_of_paths_in_n_x_m_matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPathsInNxMMatrixUnitTest {
    private final NumberOfPathsInNxMMatrix solution = new NumberOfPathsInNxMMatrix();

    @Test
    public void testNumberOfPathsInNxMMatrixRecursive() {
        assertEquals(2, solution.numberOfUniquePathsRecursive(2, 2));
        assertEquals(3, solution.numberOfUniquePathsRecursive(2, 3));
        assertEquals(6, solution.numberOfUniquePathsRecursive(3, 3));
    }

    @Test
    public void testNumberOfPathsInNxMMatrixMemoization() {
        assertEquals(2, solution.numberOfUniquePathsMemo(2, 2));
        assertEquals(3, solution.numberOfUniquePathsMemo(2, 3));
        assertEquals(6, solution.numberOfUniquePathsMemo(3, 3));
    }
}