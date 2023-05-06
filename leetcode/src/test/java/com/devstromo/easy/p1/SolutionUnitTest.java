package com.devstromo.easy.p1;

import static com.devstromo.easy.p1.Solution.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testTwoSum() {
        var num = new int[] { 2, 7, 11, 15 };
        var target = 9;
        assertArrayEquals(new int[] { 0, 1 }, twoSum(num, target));

        num = new int[] { 3, 2, 4 };
        target = 6;
        assertArrayEquals(new int[] { 1, 2 }, twoSum(num, target));

        num = new int[] { 3, 3 };
        target = 6;
        assertArrayEquals(new int[] { 0, 1 }, twoSum(num, target));
    }

}