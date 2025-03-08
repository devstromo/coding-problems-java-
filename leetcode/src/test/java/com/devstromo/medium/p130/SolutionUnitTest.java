package com.devstromo.medium.p130;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Surrounded Regions")
    void testSurroundedRegions() {
        var expected = new char[][]{
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X'},
        };
        var input = new char[][]{
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X'},
        };
        solution.solve(input);
        assertArrayEquals(expected, input);
        var expected1 = new char[][]{
                {'X'}
        };
        var input1 = new char[][]{
                {'X'}
        };
        solution.solve(input1);
        assertArrayEquals(expected1, input1);
    }

}