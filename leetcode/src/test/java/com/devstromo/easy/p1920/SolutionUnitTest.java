package com.devstromo.easy.p1920;

import static com.devstromo.easy.p1920.Solution.buildArray;
import static com.devstromo.easy.p1920.Solution.buildArrayNotExtraSpace;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testBuildArray() {
        int[] result = buildArray(new int[] { 0, 2, 1, 5, 3, 4 });
        assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, result);
    }

    @Test
    void testBuildArrayBestMemory() {
        int[] result = buildArrayNotExtraSpace(new int[] { 0, 2, 1, 5, 3, 4 });
        assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, result);
    }
}