package com.devstromo.easy.p118;

import static com.devstromo.easy.p118.Solution.generate;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    public void testGenerate() {
        // Test case 1:
        // numRows = 1
        // Expected output: [[1]]
//        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(1));
//        assertEquals(expected1, generate(1));
//
//        // Test case 2:
//        // numRows = 2
//        // Expected output: [[1], [1, 1]]
//        List<List<Integer>> expected2 = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1));
//        assertEquals(expected2, generate(2));
//
//        // Test case 3:
//        // numRows = 3
//        // Expected output: [[1], [1, 1], [1, 2, 1]]
//        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1));
//        assertEquals(expected3, generate(3));

        // Test case 4:
        // numRows = 5
        // Expected output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
        List<List<Integer>> expected4 = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1),
          Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected4, generate(5));
    }

}